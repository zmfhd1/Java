package day1;

public class VariableTest {

	public static void main(String[] args) {
		//논리값
		/*boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 > 5;
		
		System.out.println("b1=" + b1);
		System.out.println("b2=" + b2);
		System.out.println("b3=" + b3);	*/
		
		//단일문자
		/*char grade = 'A';
		System.out.println("grade=" + grade);
		char grade2 = '\u0000';// unicode 16진수 0000 해당 문자 ' '
		System.out.println("grade2=" + grade2);		
		char grade3 = '\t';// \ 시작 특수문자  ( t - tab , n - new line)
		System.out.println("grade3=" + grade3 + 'A');*/	
		
		//정수
		byte by1 = 100; // -128 ~ 127
		System.out.println("by1=" + by1);
		short by2 = 1000;
		System.out.println("by2=" + by2);		
		int i = 214847999;
		System.out.println("i=" + i);
		
		System.out.println("byte의 최대값=" + Byte.MAX_VALUE);
		System.out.println("byte의 최소값=" + Byte.MIN_VALUE);
		System.out.println("int의 최대값=" + Integer.MAX_VALUE);
		System.out.println("int의 최소값=" + Integer.MIN_VALUE);	
		
		//실수
		double d1 = 3.14;
		float f1 = 3.14F;
		System.out.println("d1=" + d1);
		System.out.println("f1=" + f1);
		System.out.println("double의 최대값=" + Double.MAX_VALUE);
		System.out.println("double의 최소값=" + Double.MIN_VALUE);
		
		//참조형변수-5장
		String s1 = "abcde";
		
		int k1 = 100;
		int k2 = 200;
		System.out.println(k1 + k2);//  산술연산
		System.out.println("k1+k2=" + (k1 + k2));//
		
	}

}







