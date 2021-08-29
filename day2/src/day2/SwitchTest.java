package day2;

public class SwitchTest {

	public static void main(String[] args) {
		int month = (int)(Math.random() * 20) + 1; //1-20 월 난수 생성 
		int day = 0;
		
		// jdk 1.7 이후부터 switch(String 도 가능)
		switch(month) {// byte, short, char-->(자동형변환 타입들) int
		case 1://값 동일 비교
		case 3: 
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:	
			day = 31;
			break;
		case 2:
			day = 28;
			System.out.println("2월 case실행");
			break;	
		case 4:
		case 6:
		case 9:
		case 11:	
			day = 30;
			break;
		default :
			System.out.println("해당 월은 존재하지 않습니다.");
		}
		System.out.println(month + "   월은 " + day + " 일까지 있습니다.");
		
	}

}
