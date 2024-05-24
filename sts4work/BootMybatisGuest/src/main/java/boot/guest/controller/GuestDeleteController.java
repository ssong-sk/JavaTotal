package boot.guest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot.guest.service.GuestService;

@RestController
public class GuestDeleteController {
	
	@Autowired
	private GuestService gService;
	
	
	@GetMapping("/guest/delete")
	public Map<String, Integer> delete(@RequestParam int num, @RequestParam String pass) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//비번이 맞을경우 데이터 삭제
		int b = gService.isEqualPassCheck(num, pass);
		
		if(b==1) {
			gService.deleteGuest(num);
		}
		
		map.put("status", b==1?1:0);
		
		return map;
	}
	

}
