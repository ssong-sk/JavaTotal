package j0115;

import java.util.Scanner;

public class ArraySearchNum_04 { //0110_01

	public static void main(String[] args) {
		/*배열 중에서 숫자 입력하기 찾기
		 * boolean을 사용하여 논리적으로 전개하여 먼저 해당 숫자가 있는지 먼저 파악
		 * 있는지 찾기, 없으면 없다고 표시 / 있으면 몇번쨰?
		 * 0 입력 시 종료
		 * 
		 */
		
		int [] data = {2, 5, 4, 10, 50, 44, 850, 940, 200, 195, 15};
		
		boolean flag = false;
		
		Scanner in = new Scanner(System.in);
		int su;
		
		while(true) {
			System.out.println("입력할 숫자");
			su = in.nextInt();
			
			//0입력시 종료
			if(su == 0) {
				System.out.println("종료");
				break;
			}
			
			flag = false;
			
			for(int i = 0; i < data.length; i++) {
				if (su == data[i]) {
					flag = true;
					System.out.println((i+1) + "번째에서 검색");
				}
			}
			
			if(!flag) {
				System.out.println(su + " 데이터가 없습니다.");
			}
		}
		

	}

}
