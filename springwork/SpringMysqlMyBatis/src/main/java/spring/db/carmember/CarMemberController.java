package spring.db.carmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.db.may.SpringCarDto;

@Controller
@RequestMapping("/carmember")
public class CarMemberController {
	
	@Autowired
	CarMemberDaoInter memberInter;
	
	//목록
	@GetMapping("/list")
	public String list(Model model) {
			
	//dao로 부터 총 갯수 저장
	int totalCount = memberInter.getTotalCount();
			
	//목록 가져오기
	List<CarMemberDto> list = memberInter.getAllDatas();
			
	//request에 저장
	model.addAttribute("totalCount", totalCount);
	model.addAttribute("list", list);
			
	return "carmember/memberlist";
	
    }
	
	//insert
	@GetMapping("/mwriteform")
	public String memberform () {
		
		return "carmember/memberform";
	}
	
	@PostMapping("/mwrite")
	public String insert(@ModelAttribute("dto") CarMemberDto dto) {
		
		memberInter.insertMember(dto);
		
		return "redirect:list"; //위에 이미 carlist로 가는 메서드를 만들었기 때문에 list로 바로 이동하게 해야한다.
	}

}
