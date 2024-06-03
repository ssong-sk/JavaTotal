package boot.data.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Alias("MemBoardDto")
public class MemBoardDto {

	private String num;
	private String myid;
	private String name;
	private String subject;
	private String content;
	private String uploadfile;
	private MultipartFile upload; //멤버로 주입(insert할때 업로드한 파일)
	private int readcount;
	private int acount; //댓글 표기하기
	private Timestamp writeday;
	
	
}
