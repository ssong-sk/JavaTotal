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
	
	
	//������ ��Ÿ����
	@GetMapping("/updateform")
	public String uform(@RequestParam String num, Model model) {
		
		CarMemberDto dto = memberInter.getOneData(num);
		model.addAttribute("dto", dto);
		
		return "carmember/updateform";
	}
	
	//�����ϱ�
	@PostMapping("/update")
	public String update(@ModelAttribute CarMemberDto dto) {
		
		memberInter.updateCarMember(dto);
		
		return "redirect:list";
	}

	//�����ϱ�
	@GetMapping("/delete")
	public String delete(@RequestParam String num) {
		
		memberInter.deleteMember(num);
		
		return "redirect:list";
	}
}
