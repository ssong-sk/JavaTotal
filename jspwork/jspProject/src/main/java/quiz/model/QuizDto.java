package quiz.model;

import java.sql.Timestamp;

public class QuizDto {
    //1-1. DTO _ 특정테이블의 정보를 단위별로 정의한 클래스 필수변수설정 
	private String no;
	private String name;
	private String hp;
	private String age;
	private String driver;
	private Timestamp writeday;
	
	
	//1-2. set, get메서드 형성
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public Timestamp getWriteday() {
		return writeday;
	}
	public void setWriteday(Timestamp writeday) {
		this.writeday = writeday;
	}
	
	
	
	
	
}
