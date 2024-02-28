package day0115;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	public String command;
	public String to;
	
	public Message(String commad, String to) {
		this.command = commad;
		this.to = to;
	}
	
	
}

public class Book679_Que {

	public static void main(String[] args) {
		// Queue 컬렉션 생성
		
		Queue<Message> messageQueue = new LinkedList<>();
		
		//메세지넣기
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "감자바"));
		
		//메세지를 하나씩 꺼내어 처리
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
				case "sendMail" :
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS" :
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk" :
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
					
			}
		}

	}

}
