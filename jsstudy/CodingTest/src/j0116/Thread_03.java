package j0116;
/*
 * join() : 다른 thread가 멈출 때 까지 기다리게 한다.
 * 동시에 두개 이상의 thread가 실행될 때 다른 thread의 결과를 참조하여 실행해야 하는 경우 사용
 * join() 함수를 호출한 thread는 non-runnable 상태가 되고 다른 thread의 수행이 끝나면 runnable 상태로 돌아옴.
 */

//스트레를 실행하고 해당 스레드가 종료될 떄까지 기다리고 내용을 출력
class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("MyThread2 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
////////////////////////////////
public class Thread_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 thread = new MyThread2();
		//Thread 시작
		thread.start();
		System.out.println("thread가 종료까지 대기");

		try {
			//해당 스레드가 멈출떄 까지 대기
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread 종료");

	}

}
