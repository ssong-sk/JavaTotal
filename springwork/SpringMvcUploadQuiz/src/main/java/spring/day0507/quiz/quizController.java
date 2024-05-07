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
	    	
	    	
	    	//업로드 할 실제 경로 구하기
	    	String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image"); //업로드한 위치
	    	System.out.println(path);
	    	
	    	
	    	
	    	//현재 날짜와 시간을 이용해 파일명 저장
	    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	    	
	    	ArrayList<String> files = new ArrayList<String>();
	    	
	    	//파일명 담기
	    	for(MultipartFile f:photo) { //file에 담아서 있는 만큼 반복문 돌림
	    		
	    		String fileName = sdf.format(new Date()) + "_" + f.getOriginalFilename();
	    		//담아주기
	    		files.add(fileName);
	    		
	    		//실제업로드 하기
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
