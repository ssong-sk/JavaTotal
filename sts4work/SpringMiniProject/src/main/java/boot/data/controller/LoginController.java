package boot.data.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.data.dto.MemberDto;
import boot.data.service.MemberService;

@Controller
public class LoginController {
	
	@Autowired
	MemberService service;

	@GetMapping("/login/main")
	public String login(HttpSession session, Model model) {
		
		//폼의 아이디 얻어줌
		String myid = (String)session.getAttribute("myid");
		
		//로그인 중인지, 아닌지 체크
		String loginok = (String)session.getAttribute("loginok");
		
		//한번도 실행 안하면 null
		if(loginok == null) {
			
			return "/login/loginform";
		}
		else {
			
			String name = service.getName(myid);
			
			model.addAttribute("name", name);
			
			return "/login/logoutform";
		}
		
	}
	
	@PostMapping("/login/loginprocess")
	public String loginprocess(@RequestParam String id, @RequestParam String pass, 
			                   @RequestParam(required = false) String cbsave,
			                   HttpSession session, Model model) {
		
		int check = service.loginIdPassCheck(id, pass);
		
		if(check == 1) {
			
			session.setMaxInactiveInterval(60*60*8); //8시간
		    
			session.setAttribute("myid", id);
			session.setAttribute("loginok", "yes");
			session.setAttribute("saveok", cbsave);
			
			MemberDto mdto = service.getDataById(id);
			
			session.setAttribute("loginphoto", mdto.getPhoto());
			
			return "redirect:main";
		}
		
		else {
			
			return "/member/passfail";
		}
		
	}
	
	@GetMapping("/login/logoutprocess")
	public String logout(HttpSession session) {
		
		session.removeAttribute("loginok");
		
		return "redirect:main";
	}
}
