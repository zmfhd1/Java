package day3;

public class MainTest {
//Ŭ���� ����� 1���� �Էº���
	public static void main(String[] args) {
		System.out.println("�Էº����� ���� = " + args.length);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println(args[0] + args[1]);
// + : ���ڿ� + ���ڿ� ==>����
// ���� + ���� ==> ��� ����
// ������Ÿ�� ��ȯ �޼ҵ� ���� - String --> ���� ����
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first + second);
		// 100.99  10.11 String-->�Ǽ� ����
		//		double first = Double.parseDouble(args[0]);
		//double second = Double.parseDouble(args[1]);
	}

}
