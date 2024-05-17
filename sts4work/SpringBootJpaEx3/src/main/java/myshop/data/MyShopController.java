package myshop.data;

import java.util.List;

import org.eclipse.tags.shaded.org.apache.regexp.recompile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyShopController {
	
	@Autowired
	MyShopDao dao;
	
	//root만들기
	@GetMapping("/")
	public String start() {
		
		return "redirect:shop/list";
	}
	
	@GetMapping("/shop/list")
    public ModelAndView list() {
		
		ModelAndView mview = new ModelAndView();
		
		List<MyShopDto> list = dao.getAllSangpums();
		
		mview.addObject("list", list);
		mview.addObject("totalCount", list.size());
		
		mview.setViewName("myshop/shoplist");
		
		return mview;
	}
	
	//입력폼
	@GetMapping("/shop/writeform")
	public String addform() {
		
		return "myshop/addform";
	}
	
	//insert
	@PostMapping("/shop/insert")
	public String add(@ModelAttribute MyShopDto dto) {
		
		dao.insertShop(dto);
		
		return "redirect:list";
		
	}
	
	//수정폼
	@GetMapping("/shop/updateform")
	public ModelAndView uform(Long num) {
		
		ModelAndView model = new ModelAndView();
		
		MyShopDto dto = dao.getData(num);
		
		model.addObject("dto", dto);
		
		model.setViewName("myshop/updateform");
		
		
		return model;
	}
	
	//수정하기
	@PostMapping("/shop/update")
	public String up(@ModelAttribute MyShopDto dto) {
		
		dao.updateShop(dto);
		
		return "redirect:list";
	}
	
	//삭제하기
	@GetMapping("shop/delete")
	public String shopDelete(Long num) {
		
        dao.deleteShop(num);
        
        return "redirect:list";
	}
}
