package day0109;

public class ArrMaxNum_13 {

	public static void main(String[] args) {
		
		int []data = {4, 44, 144, 3, 33, 133, 55, 5, 100}; //int값에 대한 배열
		
		System.out.println("갯수 : " + data.length); //변수 길이(갯수) \
		
		//배열에서 max값을 구할떄는 첫 값을 제일 큰값으로 지정
	    int max = data[0]; //첫 데이터를 무조건 최대값에 지정
	    int min = data[0]; //두번째 데이터 부터 최대값과 비교
	    
	    //두번째 데이터 부터 끝까지 max와 비교
	    for(int i = 1; i < data.length; i++) { //두번째 부터 끝까지 비교
	    	if(max < data[i]) //가장 큰값부터 끝까지
	    		max = data[i];
	    	
	    	if(min > data[i]) //중간부터 끝까지
	    		min = data[i];
	    }
	    System.out.println("최댓값 : " + max);
	    System.out.println("최솟값 : " + min);
	    
		
		

	}

}
