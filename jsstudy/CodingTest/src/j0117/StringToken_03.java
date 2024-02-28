package j0117;

import java.util.StringTokenizer;

/* ********************파일 쓰기 _ BufferedReader (Scanner와 유사)
 * 
* -read한 데이터는 Line 단위로만 나눠지기 떄문에 공백단위로 데이터를 가공하려면 따로 작업 필요!!!
*   1. stringtokenizer에 nextToken()함수를 쓰면 리드라인을 통해 입력받은 값은 공백단위로 구분하여 순서대로 호출!!!!!!!!
*   
*   -countTokens();  _ 토큰의 개수 확인
*   -hasMoreTokens();	토큰이 더 남아있는지 확인
*   -nextToken();	다음 토큰을 불러옴
*   
*   
*   2. String.split() 함수활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용!!!!
*/   
public class StringToken_03 { //0116_13

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열을 특정기호로 분리하는 방법들
		String str = "red,yellow,cyan,gray,pink";
		
		//1, 분리방법 #1
		System.out.println("String 객체의 split을 이용한 분리");
		String[] arrColors = str.split(",");
		System.out.println("총 " + arrColors.length + "개");
		
		for(int i = 0; i < arrColors.length; i++) {
			System.out.println(i + " : " + arrColors[i]);
		}
		
		//2. 분리방법 #2
		System.out.println("String 객체의 StringTokeneizer를 이용한 분리");
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("총 토근수 : " + st.countTokens());
		
		//3. 반복문을 통해 토큰이 더 남아있는지 출력 및 다음 토큰을 불러옴(다음 토큰이 있다면true로 반복, 없다면 flase로 종료!!!!)
		while(st.hasMoreTokens()) { 
			System.out.println(st.nextToken());
		}

	}

}
