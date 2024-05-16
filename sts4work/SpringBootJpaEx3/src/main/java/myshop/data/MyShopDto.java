package myshop.data;

import java.security.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity //하나의 테이블이 mysql에 자동으로 만들어짐
@Table(name = "myshop") //자동으로 myshop 테이블이 mysql 만들어짐 / 변수가 변경 될 경우 자동 수정
public class MyShopDto {

	@Id //각 엔티티를 구별할 수 있는 식별자(시퀀스) 역할
	@GeneratedValue(strategy = GenerationType.AUTO) //자동으로 insert 와 update 구분역할을 해주는 시퀀스 역할
	private long num;
	
	@Column(name = "sangname") //등록할 컬럼명 정하기
	private String sangname;
	
	@Column //이름이 같으면 생략가능
	private String sangprice;
	
	@Column
	private String sangcolor;
	
	@Column
	private String sangipgo;
	
	@CreationTimestamp //엔티티 생성시점 (테이블)이 만들어지는 그 시간대로 자동등록됨.
	private Timestamp writeday;
	
}
