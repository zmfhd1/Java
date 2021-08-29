package day2;

//run 메뉴 - 클래스 실행 = 클래스 main   메소드 전체 내용 실행 동일 의미
//main 메소드 선언 지정 형식 규칙!!!!

public class ReturnTest {
	public static void test() {
		int time = 1000;
		System.out.println("test 시작");
		// time 1000 미만이면 test 메소드 중단
		if(time < 1000) {return;}
		System.out.println("test 종료");		
	}
	
	public static void main(String[] args) {
		System.out.println("메인 시작");
		//test();
		System.out.println("메인 종료");

	}

}
