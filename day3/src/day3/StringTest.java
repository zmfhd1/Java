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
		
		// s1 ���ڿ���  s3 ���ڿ��� ������ ��
		if(s1 == s3) {
			System.out.println("s1 == s3 ����");
		}
		else {
			System.out.println("s1 == s3 ���� �ʴ�");
		}
		if(s1 == s4) {
			System.out.println("s1 == s4 ����");
		}
		else {
			System.out.println("s1 == s4 ���� �ʴ�");
		}		
		
		if(s1.equals(s3) ) {
			System.out.println("s1 == s3 ����");
		}
		else {
			System.out.println("s1 == s3 ���� �ʴ�");
		}
		if(s1.equals(s4) ) {
			System.out.println("s1 == s4 ����");
		}
		else {
			System.out.println("s1 == s4 ���� �ʴ�");
		}
		
		String s5 = null;//�����ּҰ� ����. NullPointerException
		//s5 = "";// �����ּҰ� �ִ�. �ּ� ���� ���� ����
		
		if( s5.equals(s1)) {
			System.out.println("s5.equals(s1) ����");
		}
		
	}

}
