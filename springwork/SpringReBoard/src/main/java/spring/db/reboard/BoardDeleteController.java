package spring.db.reboard;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.db.data.BoardDaoInter;

@Controller
public class BoardDeleteController {

	
	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/deletepassform")
	public ModelAndView upassform(@RequestParam String num, @RequestParam String currentPage) {
		
		ModelAndView mview = new ModelAndView();
		mview.addObject("num", num);
		mview.addObject("currentPage", currentPage);
		
		mview.setViewName("board/deletepassform");
		
		return mview;
	}
	
	
	//�����ϱ�
	@PostMapping("/board/delete")
	public String delete(@RequestParam int num, @RequestParam int pass, @RequestParam int currentPage, HttpSession session) {

       //����� ������ �������� ��Ÿ�����ϱ� (������ ��Ű��) / Ʋ���� passfail��
      	int check = dao.getCheckPass(num, pass);
      		
		if (check == 1) {
			String photo = dao.getOneData(num).getPhoto();

			if (!photo.equals("no")) {

				String[] fName = photo.split(",");

				// ���� ���ε� ���
				String path = session.getServletContext().getRealPath("/WEB-INF/photo");

				for (String f : fName) {
					File file = new File(path + "/" + f);
					file.delete();
				}
			}
			
			dao.deleteBoard(num);
			
			return "redirect:list?currentPage="+currentPage;

		}
        
        else {
        	return "board/passfail";
        }
		
	}
}
