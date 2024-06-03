package boot.data.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.data.dto.ReBoardDto;
import boot.data.mapper.ReBoardMapperInter;

@Service
public class ReBoardService implements ReBoardServiceInter {
	
	@Autowired
	ReBoardMapperInter mapperInter;

	// 갯수 및 검색
	@Override
	public int getTotalCount(String searchcolumn, String searchword) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("searchcolumn", searchcolumn);
		map.put("searchword", searchword);
		
		return mapperInter.getTotalCount(map);
	}

	//insert
	@Override
	public void insertReBoard(ReBoardDto dto) {
		// TODO Auto-generated method stub
	
		int num = dto.getNum(); //새글이면 이미 0들어가 있음
		int regroup = dto.getRegroup();
		int restep = dto.getRestep();
		int relevel = dto.getRelevel();
		
		//새글인 경우
		if(num==0) { 
			
			regroup = this.getMaxNum()+1; //처음에 글이 없을 경우 1번
			restep = 0;
			relevel = 0;
		}
		
		//답글인 경우
		else {
			
			//같은 그룹 중에서 전달받은 restep보다 큰 값들은 모두 일괄 +1
			this.updateRestep(regroup, restep);
			
			//그리고 나서 전달받은 값보다 1크게 db에 저장
			restep++;
			relevel++;
		}
		
		//변경된 값들은 다시 dto에 담아주기
		dto.setRegroup(regroup);
		dto.setRestep(restep);
		dto.setRelevel(relevel);
		
		//insert에 담기
		mapperInter.insertReBoard(dto);
	}

	//페이징 처리
	@Override
	public List<ReBoardDto> getPagingList(String searchcolumn, String searchword, int start, int perpage) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		
		map.put("searchcolumn", searchcolumn);
		map.put("searchword", searchword);
		map.put("start", start);
		map.put("perpage", perpage);
		
		return mapperInter.getPaginglist(map);
	}

	//num 넘기기
	@Override
	public ReBoardDto getData(int num) {
		// TODO Auto-generated method stub
		return mapperInter.getData(num);
	}

	// 최신글이 위에 올라오더라도 내가 쓴 글이 위에 정렬하기위해서 사용
	@Override
	public void updateRestep(int regroup, int restep) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("regroup", regroup);
		map.put("restep", restep);
		
		mapperInter.updateRestep(map);
	}

	// 페이징 처리
	@Override
	public void updateReadCount(int num) {
		// TODO Auto-generated method stub
		mapperInter.updateReadCount(num);
	}

	// 마지막 페이징처리(상세보기에 가야하기 때문)
	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return mapperInter.getMaxNum();
	}

	//삭제
	@Override
	public void deleteBoard(int num) {
		// TODO Auto-generated method stub
		mapperInter.deleteBoard(num);
	}

	//좋아요 카운트
	@Override
	public void likesUpdte(int num) {
		// TODO Auto-generated method stub
		mapperInter.likesUpdte(num);
	}

	

}
