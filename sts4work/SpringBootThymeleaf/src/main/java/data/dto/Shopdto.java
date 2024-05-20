package data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor //모든항목의 생성자를 형성
@Builder //값을 바로 주입시키는것
public class Shopdto {
	
	private int num;
	private String sangpum;
	private int su;
	private int dan;
	private String color;

}
