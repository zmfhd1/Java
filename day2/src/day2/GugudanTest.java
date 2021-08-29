package day2;

public class GugudanTest {

	public static void main(String[] args) {
//5 단 이후 출력 안하겠다
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {// j 단변수
				//if(j == 5) { continue; }//5단만 출력 생략
				
				System.out.println("실행중");
				//if(j == 5) { break; } //5단이후 출력 중단
				System.out.print(j + "*" + i + "=" +  j * i + "\t");
			}//inner for end
			System.out.println();
		}//outer for end

		
	}

}
