package spring.day0507.quiz;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class quizController {
	
	 @GetMapping("/quiz/myshop")
	    public String form1() {
	    	
	    	return "quiz/quizUploadForm";
	    }
	    
	    
	    @PostMapping("/quiz/quizupload")
	    public ModelAndView read2 (@RequestParam String title, @RequestParam ArrayList<MultipartFile> photo,
	    		                   @RequestParam String price, @RequestParam String ipgo,  HttpServletRequest request) {
	    	ModelAndView mview = new ModelAndView();
	    	
	    	
	    	//���ε� �� ���� ��� ���ϱ�
	    	String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image"); //���ε��� ��ġ
	    	System.out.println(path);
	    	
	    	
	    	
	    	//���� ��¥�� �ð��� �̿��� ���ϸ� ����
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    	
	    	ArrayList<String> files = new ArrayList<String>();
	    	
	    	//���ϸ� ���
	    	for(MultipartFile f:photo) { //file�� ��Ƽ� �ִ� ��ŭ �ݺ��� ����
	    		
	    		String fileName = sdf.format(new Date()) + "_" + f.getOriginalFilename();
	    		//����ֱ�
	    		files.add(fileName);
	    		
	    		//�������ε� �ϱ�
	    		try {
					f.transferTo(new File(path+"\\"+fileName));
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    	
	    	mview.addObject("files", files);
	    	mview.addObject("title", title);
	    	mview.addObject("price", price);
	    	mview.addObject("ipgo", ipgo);
	    	mview.addObject("path", path);
	    	
	    	mview.setViewName("/quiz/quizUploadResult");
	    			
	    	return mview;
	    }

}