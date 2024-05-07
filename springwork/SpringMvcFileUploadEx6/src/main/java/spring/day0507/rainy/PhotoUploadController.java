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
	
	//업로드 폼1으로 가기(단수)
    @GetMapping("/board/uploadform1")
    public String uform1() {
    	
    	return "board/uploadform1";
    }
    
    @PostMapping("/board/upload1")
    public ModelAndView read1 (@RequestParam String title, @RequestParam MultipartFile photo, HttpServletRequest request) {
    	ModelAndView mview = new ModelAndView();
    	
    	
    	//업로드 할 실제 경로 구하기
    	String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image"); //업로드한 위치
    	System.out.println(path);
    	
    	String fileName = photo.getOriginalFilename(); //업로드한 파일명
    	
    	
    	//현재 날짜와 시간을 이용해 파일명 저장
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    	
    	if(!fileName.equals("")) {
    		fileName = sdf.format(new Date())+"_"+fileName;
    		
    		//path에 업로드 하기
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
    		fileName = "no"; //업로드 안했을 경우
    	}
    	
    	
    	mview.addObject("fileName", fileName);
    	mview.addObject("title", title);
    	mview.addObject("path", path);
    	
    	mview.setViewName("/board/uploadresult1");
    			
    	return mview;
    }
    
    
    
  //업로드 폼2으로 가기 (복수)
    @GetMapping("/board/uploadform2")
    public String uform2() {
    	
    	return "board/uploadform2";
    }
    
    
    @PostMapping("/board/upload2")
    public ModelAndView read2 (@RequestParam String title, @RequestParam ArrayList<MultipartFile> photo, HttpServletRequest request) {
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
    	mview.addObject("path", path);
    	
    	mview.setViewName("/board/uploadresult2");
    			
    	return mview;
    }
}
