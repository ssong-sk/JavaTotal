package spring.db.carmember;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
	//수정폼 나타내기
	@GetMapping("/updateform")
	public String uform(@RequestParam String num, Model model) {
		
		CarMemberDto dto = memberInter.getOneData(num);
		model.addAttribute("dto", dto);
		
		return "carmember/updateform";
	}
	
	//수정하기
	@PostMapping("/update")
	public String update(@ModelAttribute CarMemberDto dto) {
		
		memberInter.updateCarMember(dto);
		
		return "redirect:list";
	}

	//삭제하기
	@GetMapping("/delete")
	public String delete(@RequestParam String num) {
		
		memberInter.deleteMember(num);
		
		return "redirect:list";
	}
}
