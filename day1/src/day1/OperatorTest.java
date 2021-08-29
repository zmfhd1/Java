package day1;

public class OperatorTest {

	public static void main(String[] args) {
		int time = 100000;// 입력데이터(초단위)
		int time2 = time;
		
		//System.out.print(time + "  초는 ");
		
		int hour; //데이터타입 변수명 = 초기화값; ==> 변수 선언 문장 
		int min;
		int second;
		String result;
		
		//1시간은 3600초
		//1분은 60초
		
		hour = time2 / 3600; // 	변수명 = 연산식 ; ==> 	변수 활용 문장
		time2 = time2 % 3600;
		min = time2 / 60;
		second = time2 % 60;
		
		System.out.println(time + "  초는 " + hour + " 시간 " + min + "  분 " + second + "  초입니다. ");
		
		//hour  가 24 이상이면 " 만 1일이 경과했습니다." , 
		// 그렇지 않으면 " 1일이내입니다" 출력
		
		//조건삼항연산자
		result = hour >= 24 ? " 만 1일이 경과했습니다."  : " 1일이내입니다";
		
		//조건문
		//if(hour >= 24) { result =" 만 1일이 경과했습니다."; time2 = 1 ; }
		//else { result = " 1일이내입니다";  time2 = 0 ; }
		
		
		System.out.println(result);


	}

}
