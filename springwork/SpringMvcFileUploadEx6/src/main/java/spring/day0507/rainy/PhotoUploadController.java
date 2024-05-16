package spring.day0507.rainy;

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
public class PhotoUploadController {
	
	//���ε� ��1���� ����(�ܼ�)
    @GetMapping("/board/uploadform1")
    public String uform1() {
    	
    	return "board/uploadform1";
    }
    
    @PostMapping("/board/upload1")
    public ModelAndView read1 (@RequestParam String title, @RequestParam MultipartFile photo, HttpServletRequest request) {
    	ModelAndView mview = new ModelAndView();
    	
    	
    	//���ε� �� ���� ��� ���ϱ�
    	String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image"); //���ε��� ��ġ
    	System.out.println(path);
    	
    	String fileName = photo.getOriginalFilename(); //���ε��� ���ϸ�
    	
    	
    	//���� ��¥�� �ð��� �̿��� ���ϸ� ����
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    	
    	if(!fileName.equals("")) {
    		fileName = sdf.format(new Date())+"_"+fileName;
    		
    		//path�� ���ε� �ϱ�
    		try {
				photo.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}else {
    		fileName = "no"; //���ε� ������ ���
    	}
    	
    	
    	mview.addObject("fileName", fileName);
    	mview.addObject("title", title);
    	mview.addObject("path", path);
    	
    	mview.setViewName("/board/uploadresult1");
    			
    	return mview;
    }
    
    
    
  //���ε� ��2���� ���� (����)
    @GetMapping("/board/uploadform2")
    public String uform2() {
    	
    	return "board/uploadform2";
    }
    
    
    @PostMapping("/board/upload2")
    public ModelAndView read2 (@RequestParam String title, @RequestParam ArrayList<MultipartFile> photo, HttpServletRequest request) {
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
    	mview.addObject("path", path);
    	
    	mview.setViewName("/board/uploadresult2");
    			
    	return mview;
    }
}