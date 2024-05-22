package boot.data;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapperInter {
	
	//갯수
	public int getTotalCount();

}
