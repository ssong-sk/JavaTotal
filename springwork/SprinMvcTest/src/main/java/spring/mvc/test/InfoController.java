package spring.mvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InfoController {
   
   @GetMapping("/info/myform")
   public String myform() {
      return "info/infoform";
   }
   
   @PostMapping("/info/read")
   public String result (@ModelAttribute("dto") InfoDto dto) { //ModelAttribute는 dto에 있는 모든 값들을 가져옴 //(@ModelAttribute InfoDto dto) 적어도됨
	   return "info/infowrite";
   }

}