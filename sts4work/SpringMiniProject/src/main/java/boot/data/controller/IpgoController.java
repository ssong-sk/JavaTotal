package boot.data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import boot.data.dto.IpgoDto;
import boot.data.mapper.IpgoMapperInter;

@Controller //bean 등록
public class IpgoController {

	@Autowired //자동 주입
	IpgoMapperInter mapper;
	
	//첫 루트 설정
    @GetMapping("/")
    public String start() {
    	
    	return "/layout/main";
    }
    
    //list
    @GetMapping("/ipgo/list") 
    public ModelAndView list() {
    	
    	ModelAndView mview = new ModelAndView();
    	
    	//전체갯수
    	int totalCount = mapper.getTotalCount();
    	
    	//전체리스트
    	List<IpgoDto> list = mapper.getAllDatas();
    	
    	mview.addObject("totalCount", totalCount);
    	mview.addObject("list", list);
    	
    	//포워드 -> 넘겨줌
    	//mview.setViewName("ipgo/ipgolist"); //jsp
    	
    	mview.setViewName("/ipgo/ipgolist"); //tiles
    	
    	return mview;
    }
    
    //form 띄우기
    @GetMapping("/ipgo/writeform")
    public String writeform() {
    	
    	return "/ipgo/ipgoform";
    }
    
    //form 데이터 저장
    @PostMapping("/ipgo/insert")
    public String insert(@ModelAttribute IpgoDto dto, @RequestParam ArrayList<MultipartFile> upload, HttpSession session) {
    	
    	String path = session.getServletContext().getRealPath("/ipgoimage");
    	
    	String uploadName = "";
    	
    	if(upload.get(0).getOriginalFilename().equals("")) {
    		
    		uploadName = "no";
    	}
    	else {
    		
    		for(MultipartFile f:upload) {
    			
    			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    			
    			String fName = sdf.format(new Date()) + "_" + f.getOriginalFilename();
    			uploadName += fName + ",";
    			
    			try {
					f.transferTo(new File(path + "\\" + fName));
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		
    		//마지막 , 제거
    		uploadName = uploadName.substring(0, uploadName.length()-1);
    		
    	}
    	
    	dto.setPhotoname(uploadName);
    	
    	mapper.insertIpgo(dto);
    	
    	return "redirect:list";
    }
}
