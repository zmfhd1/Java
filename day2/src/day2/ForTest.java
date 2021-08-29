package day2;

public class ForTest {
// 10 20 30 40 50 ... 100
	public static void main(String[] args) {
		for(int i = 10; i >= 1 ; i--) { //10  9 8 .... 1
			System.out.println(i);
		}
		
		for(int i = 1; i <= 10 ; i++) { //1 2 ... 10
			System.out.println(i);
		}

		/*for(int i = 1; i >= 10 ; i++) { //x
			System.out.println(i);
		}
		for(int i = 10; i >= 1 ; i++) { //무한 루프
			System.out.println(i);
		}*/
		
		// 1(1) 3(1+2) 6(1+2+3) 10 ... 55
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;// 0+1+2+3
			System.out.println(i + " 까지의 총합=" + sum);
		}

	}
	


}




