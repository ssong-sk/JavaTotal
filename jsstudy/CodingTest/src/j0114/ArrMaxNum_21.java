package j0114;

public class ArrMaxNum_21 { //0109 _ 13

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] data = {4, 55, 44, 14, 99, 76, 6, 55};
		
		System.out.println("갯수 " + data.length);
		
		int max = data[0]; // 4 
		int min = data[0]; // 4
		
		
		for(int i = 0; i < data.length; i++) {
			if(max < data[i]) {  // 4 < 4 , 4  < 55  , 55 < 44 ,
				max = data[i];   //        -> 55
			}
			if(min > data[i]) {  // 4 > 4 , 4 > 55   , 4 > 44 , 
				min = data[i];
			}
			
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		

	}

}
