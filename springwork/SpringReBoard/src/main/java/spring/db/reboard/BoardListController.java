package spring.db.reboard;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.db.answerdata.AnswerDao;
import spring.db.data.BoardDaoInter;
import spring.db.data.BoardDto;

@Controller
public class BoardListController {
	
	@Autowired
	BoardDaoInter dao;
	
	//���
	@Autowired
	AnswerDao adao;
	
	//ùȭ��
	@GetMapping("/")
	public String start() {
		return "redirect:board/list";
	}
	
	//��ü ����Ʈ ��ȸ
	@GetMapping("/board/list")
	public ModelAndView list(@RequestParam(value = "currentPage", defaultValue = "1")int currentPage) {
		
		ModelAndView mview = new ModelAndView();
			
			//����¡�� �ʿ��� ����
			int totalCount = dao.getTotalCount();
			int perPage=5; //���������� ������ ���� ����
			int perBlock=5; //�Ѻ��� ������ ������ ����
			int start; //db���� ������ ���� ���۹�ȣ(mysql�� ù����0��,����Ŭ�� 1��);
			int startPage; //������ ������ ����������
			int endPage; //������ ������ ��������
			int totalPage; //����������
			int no; //���������� ����� ���۹�ȣ
			
			//���������� ���Ѵ�
			//�ѱ۰���/���������纸���������� ����(7/5=1)
			//�������� 1�̶� ������ ������ 1������ �߰�(1+1=2�������� �ʿ�)
			totalPage=totalCount/perPage+(totalCount%perPage==0?0:1);
			
			//������ ������ ����������
			//perBlock=5�ϰ�� ������������ 1~5�ϰ�� ������������1,���������� 5
			//���簡 13�ϰ�� ����:11 ��:15
			startPage=(currentPage-1)/perBlock*perBlock+1;
			endPage=startPage+perBlock-1;
			
			//���������� 23�ϰ�� ���������� ���������� 25�� �ƴ϶� 23
			if(endPage>totalPage)
				endPage=totalPage;
			
			//������������ ������ ���۹�ȣ
			//1������:0, 2������:5 3������: 10.....
			start=(currentPage-1)*perPage;
			
			//���������� ����� ���۹�ȣ ���ϱ�
			//�ѱ۰����� 23  , 1������:23 2������:18  3������:13
			no=totalCount-(currentPage-1)*perPage;
			
			//����Ʈ
			List<BoardDto> list = dao.getList(start, perPage);
		
		
			//����Ʈ ���ۿ� ���� ���� �߰��ϱ�
			for(BoardDto d:list) {
				d.setAcount(adao.getAnswerList(d.getNum()).size());
			}
			
		
		//������
		mview.addObject("totalCount", totalCount);
		mview.addObject("list", list); //����� ������ �� ����
		mview.addObject("no", no);
		mview.addObject("startPage", startPage);
		mview.addObject("endPage", endPage);
		mview.addObject("currentPage", currentPage);
		mview.addObject("totalPage", totalPage);
		mview.setViewName("board/boardlist");
		
		return mview;
	}

}
