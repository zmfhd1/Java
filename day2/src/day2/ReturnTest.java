package day2;

//run �޴� - Ŭ���� ���� = Ŭ���� main   �޼ҵ� ��ü ���� ���� ���� �ǹ�
//main �޼ҵ� ���� ���� ���� ��Ģ!!!!

public class ReturnTest {
	public static void test() {
		int time = 1000;
		System.out.println("test ����");
		// time 1000 �̸��̸� test �޼ҵ� �ߴ�
		if(time < 1000) {return;}
		System.out.println("test ����");		
	}
	
	public static void main(String[] args) {
		System.out.println("���� ����");
		//test();
		System.out.println("���� ����");

	}

}
