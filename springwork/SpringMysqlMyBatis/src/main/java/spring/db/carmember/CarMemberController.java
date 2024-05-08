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
	
	//���
	@GetMapping("/list")
	public String list(Model model) {
			
	//dao�� ���� �� ���� ����
	int totalCount = memberInter.getTotalCount();
			
	//��� ��������
	List<CarMemberDto> list = memberInter.getAllDatas();
			
	//request�� ����
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
		
		return "redirect:list"; //���� �̹� carlist�� ���� �޼��带 ������� ������ list�� �ٷ� �̵��ϰ� �ؾ��Ѵ�.
	}

}
