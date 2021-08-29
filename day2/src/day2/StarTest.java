package day2;

public class StarTest {
	public static void main(String[] args) {
		//10 * 10 개의 별 출력 = 사각형 모양
		//1  줄에 * 10번 반복 -> 10번 반복
		for(int line=1; line <=10; line++) {
			for(int star = 1; star <=3; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		


	/*
	 * 
	 ** 
	 ***
	 ****
	 ****** 
	 */
	for(int line=1; line <=10; line++) {
			for(int star = 1; star <=line; star++) {
				System.out.print("*");
			}
			System.out.println();
	}	
	int count = 9;
	//   1번 라인 공백 (9/2 => 4개) + * (중앙 1개)  현재라인*2 -1 
	//   2번 라인 공백 (3개) + * (중앙 3개)	
	//   3번 라인 공백 (2개) + * (중앙 5개)
	//   4번 라인 공백 (1개) + * (중앙 7개)
	
	/*
	       *
	      ***
	     *****
	    ******* 
	   *********
	  
	 * */	
	
	for(int line = 1; line <= count / 2; line++) {
		//공백
		for(int j = count / 2; j >= line; j--) {
			System.out.print(" ");
		}
		//별
		for(int star = 1; star <= line*2 -1 ; star++) {
			System.out.print("*");
		}
		System.out.println();
	}//outer for end
		
	}//main end
}//class end



			





