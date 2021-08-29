package day3;

public class MainTest {
//클래스 실행시 1번에 입력변수
	public static void main(String[] args) {
		System.out.println("입력변수의 갯수 = " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println(args[0] + args[1]);
// + : 문자열 + 문자열 ==>결합
// 숫자 + 숫자 ==> 산술 덧셈
// 데이터타입 변환 메소드 제공 - String --> 정수 변경
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);
		// 100.99  10.11 String-->실수 변경
		//		double first = Double.parseDouble(args[0]);
		//double second = Double.parseDouble(args[1]);
	}

}
