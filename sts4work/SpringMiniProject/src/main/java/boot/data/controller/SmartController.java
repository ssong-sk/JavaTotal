package boot.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import boot.data.dto.SmartDto;
import boot.data.mapper.SmartMapperInter;

@Controller
@RequestMapping("/smart")
public class SmartController {
	
	
	@Autowired
	SmartMapperInter mapperInter;
	
	//저장폼
	@GetMapping("/form")
	public String form() {
		
		return "/smart/smartform";
	}
	
	//저장
	@PostMapping("/insert")
	public String insert(@ModelAttribute SmartDto dto) {
		
		mapperInter.insertSmart(dto);
		
		return "redirect:list";
		
	}
	
	//list로 가기
	@GetMapping("/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		int totalCount = mapperInter.getTotalCount();
		
		List<SmartDto> list = mapperInter.getAllDatas();
		
		mview.addObject("list", list);
		mview.addObject("totalCount", totalCount);
		
		//포워드
		mview.setViewName("/smart/smartlist");
		
		return mview;
	}

}
