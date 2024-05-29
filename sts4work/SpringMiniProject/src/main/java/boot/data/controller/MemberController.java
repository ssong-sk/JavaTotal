package boot.data.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import boot.data.dto.IpgoDto;
import boot.data.dto.MemberDto;
import boot.data.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService service;
	
	@GetMapping("/member/list")
	public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		//list불러오기
		List<MemberDto> list = service.getAllMembers();
		
		mview.addObject("list", list);
		mview.addObject("mcount", list.size());
		
		mview.setViewName("/member/memberlist");
		
		return mview;
	}
	
	//회원가입 form
	@GetMapping("/member/form")
	public String form() {
		
		return "/member/memberform";
	}
	
	//insert
	@PostMapping("/member/insert")
	public String insert(@ModelAttribute MemberDto dto, @RequestParam ArrayList<MultipartFile> myphoto,
			HttpSession session) {

		String path = session.getServletContext().getRealPath("/memberimage");

		String uploadName = "";

		if (myphoto.get(0).getOriginalFilename().equals("")) {

			uploadName = "no";
		} else {

			for (MultipartFile f : myphoto) {

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

			// 마지막 , 제거
			uploadName = uploadName.substring(0, uploadName.length() - 1);

		}

		dto.setPhoto(uploadName);
		
		

		service.insertMember(dto);
		
		
		return "redirect:list";
	}
	
	
	//id 체크
	@GetMapping("/member/idcheck")
	@ResponseBody
	public Map<String, Integer> idcheckprocess(@RequestParam String id) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//id체크 메서드 불러오기
		int n = service.getSerchId(id);
		
		map.put("count", n); //1 or 0
		
		return map;
	}
	
	
	//회원정보
	@GetMapping("/member/myinfo")
	public String info(Model model) {
		
		List<MemberDto> list = service.getAllMembers();
		
		model.addAttribute("list", list);
		
		return "/member/memberinfo";
	}
	
	//회원목록 삭제
	@GetMapping("member/delete")
	@ResponseBody
	public void deleteMember(String num) {
		
		service.deleteMember(num);
	}
	
	//회원사진 변경하기
	@PostMapping("/member/updatephoto")
	@ResponseBody
	public void photoUpload(@RequestParam String num, @RequestParam MultipartFile photo, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/memberimage");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		
		String fileName = sdf.format(new Date()) + photo.getOriginalFilename();
		
		try {
			photo.transferTo(new File(path + "\\" + fileName));
			
			//db사진수정
			service.updatePhoto(num, fileName);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
