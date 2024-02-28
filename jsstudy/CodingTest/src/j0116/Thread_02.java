package j0116;
// wait() : 갖고 있던 고유의 락을 해제하고 thread를 잠들게 함.
/* notify() : 잠들어 있던 thread를 임의로 하나를 골라 꺠운다.
 * ==> wait 과 notify는 동기화된 블록안에서 사용
 * 
 * 해당 thread가 실행되면 자기 자신의 모니터링 락을 획득
 * 5번 반복하면서 1초씩 쉬면서 total에 총값을 누적
 * 그 후에 notify()메소드를 호출하여 wiat하고 있는 thread를 꺠움
 *  ==>>결과적으로 락을 해제해서 잠들게 한다음 notify()를 사용하여 다시 thread를 깨움!!!!
 *  
 *  
 */

class ThreadB extends Thread { //Thread를 상속받은 ThreadB 클래스 사용!
	int total;

	@Override //오버라이드!!
	public void run() {
		synchronized (this) { //락을 검.
			for (int i = 0; i < 5; i++) {
				System.out.println("ThreadB : " + i);
				total += i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}

	}
}

public class Thread_02 {

	public static void main(String[] args) {
		// 해당 thread가 실행되면, 해당 thread는 run 메서드 안에서 자신의 모니터링 락 획득
		ThreadB b = new ThreadB();
		b.start();

		//b에 대하여 동기화 블럭을 설명
		//만약 메인 thread가 아래의 블록을 위의 thread보다 먼저 실행되었다면 wait을 하게 되면서 모니터링 락을 놓고 대기
		synchronized (b) { //락을 거는 용도로 사용하여 다른 스드레가 접근하지 못하도록함. => 스드레 동기화
			try {
				//b.wait() 메소드를 출력
				//메인 thread 정지
				//threadB가 5번 값을 더한 후 notify를 호출하게 되면 wait에서 꺠어남!!!!
				System.out.println("b가 종료할 때 까지 대기");
				b.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//깨어난 후 결과를 출력
			System.out.println("total : " + b.total);
		}

	}

}
