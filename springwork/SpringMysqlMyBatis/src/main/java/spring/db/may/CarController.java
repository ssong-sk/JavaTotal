package spring.db.may;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/samsung")
public class CarController {

	@Autowired //자동주입
	SpringCarDaoInter carInter;
	
	//목록
	@GetMapping("/list")
	public String list(Model model) {
		
		//dao로 부터 총 갯수 저장
		int totalCount = carInter.getTotalCount();
		
		//목록 가져오기
		List<SpringCarDto> list = carInter.getAllCarDatas();
		
		//request에 저장
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("list", list);
		
		return "car/carlist";
	}
	
	
	//insert
	@GetMapping("/writeform")
	public String carform () {
		
		return "car/addform";
	}
	
	@PostMapping("/write")
	public String insert(@ModelAttribute("dto") SpringCarDto dto) {
		
		carInter.insertCar(dto);
		
		return "redirect:list"; //위에 이미 carlist로 가는 메서드를 만들었기 때문에 list로 바로 이동하게 해야한다.
	}
	
	//updateform 나오게
	@GetMapping("/updateform")
	public String uform(@RequestParam String num, Model model) {
		
		SpringCarDto dto = carInter.getData(num);
		model.addAttribute("dto", dto);
		
		return "car/updateform";
	}
	
	//수정하기
	@PostMapping("/update")
	public String update(@ModelAttribute("dto") SpringCarDto dto) {
		
		carInter.updateMyCar(dto);
		
		return "redirect:list";
	}
	
	//삭제하기
	@GetMapping("/delete")
	public String delete(@RequestParam String num, Model model) {
		
		carInter.deleteCar(num);
		
		return "redirect:list";
	}
}
