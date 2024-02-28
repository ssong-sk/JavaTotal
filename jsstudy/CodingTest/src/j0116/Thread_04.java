package j0116;
//문제풀이

public class Thread_04 { 

	public static void main(String[] args) {
		
		Thread t = new Thread(new MyRunnable());
		t.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.print("안녕. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class MyRunnable implements Runnable {
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("잘가. ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace(); //여기가 출력하는 곳이 아니기 때문에 삭제처리
			}
		}
	}
}