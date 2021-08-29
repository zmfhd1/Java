package day3;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "program";
		String s3  = "java" ;
		String s4 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// s1 문자열과  s3 문자열값 같은지 비교
		if(s1 == s3) {
			System.out.println("s1 == s3 같다");
		}
		else {
			System.out.println("s1 == s3 같지 않다");
		}
		if(s1 == s4) {
			System.out.println("s1 == s4 같다");
		}
		else {
			System.out.println("s1 == s4 같지 않다");
		}		
		
		if(s1.equals(s3) ) {
			System.out.println("s1 == s3 같다");
		}
		else {
			System.out.println("s1 == s3 같지 않다");
		}
		if(s1.equals(s4) ) {
			System.out.println("s1 == s4 같다");
		}
		else {
			System.out.println("s1 == s4 같지 않다");
		}
		
		String s5 = null;//참조주소값 없다. NullPointerException
		//s5 = "";// 참조주소값 있다. 주소 내부 공백 저장
		
		if( s5.equals(s1)) {
			System.out.println("s5.equals(s1) 같다");
		}
		
	}

}
