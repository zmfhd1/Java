package day9;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args)  {
		try {	
			while(true) {
				int result = System.in.read();//jdk 설치되면서 키보드 입력 구현 제공. 1바이트
				// 4BYTE 정수 result 에 1바이트만 저장. 문자의 코드값
				if((char)result == '\n' ) { break; }
				//if(result == 13) {break; }
				System.out.println( result );
			}
			
		//	키보드입력 데이터 그대로 출력 (연산 x - int, double  타입)
		// 한글데이터 표현x (String 타입)
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
