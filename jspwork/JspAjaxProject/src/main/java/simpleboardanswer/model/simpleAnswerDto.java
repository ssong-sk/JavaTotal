package simpleboardanswer.model;

import java.sql.Timestamp;

public class simpleAnswerDto {
	
	private String idx;
	private String num;
	private String nickname;
	private String content;
	private Timestamp writeday;
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWirteday() {
		return writeday;
	}
	public void setWirteday(Timestamp wirteday) {
		this.writeday = wirteday;
	}
	
	

}
