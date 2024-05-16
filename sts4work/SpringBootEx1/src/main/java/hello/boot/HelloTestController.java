package hello.boot;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloTestController {
	
	@GetMapping("/shop/list")
	public List<ShopDto> list() {
		
		List<ShopDto> list = new ArrayList<>();
		
		ShopDto s1 = new ShopDto();
		
		s1.setShop("과일가게");
		s1.setSu(2);
		s1.setDan(250000);
		
		ShopDto s2 = new ShopDto();
		
		s2.setShop("요가매트");
		s2.setSu(5);
		s2.setDan(15000);
		
		list.add(s1);
		list.add(s2);
		
		return list;
	}
	

}
