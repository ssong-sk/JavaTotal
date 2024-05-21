package mycar.data;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "mycar_comment")
public class MyCarCommentDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idx;
	
	//포인키로 연결
	@ManyToOne
	@JoinColumn(name = "num") //join할 컬럼 입력
	@OnDelete(action = OnDeleteAction.CASCADE) //부모 데이터 지우면 댓글 삭제
	private MyCarDto mycar;
	
	@Column
	private String comment;
	
	@Column(updatable = false)
	@CreationTimestamp //생성 시 자동 등록
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul") //날짜형식 미리 포맷하여 저장
	private Timestamp writeday;
}
