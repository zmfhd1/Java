package day1;

public class OperatorTest {

	public static void main(String[] args) {
		int time = 100000;// �Էµ�����(�ʴ���)
		int time2 = time;
		
		//System.out.print(time + "  �ʴ� ");
		
		int hour; //������Ÿ�� ������ = �ʱ�ȭ��; ==> ���� ���� ���� 
		int min;
		int second;
		String result;
		
		//1�ð��� 3600��
		//1���� 60��
		
		hour = time2 / 3600; // 	������ = ����� ; ==> 	���� Ȱ�� ����
		time2 = time2 % 3600;
		min = time2 / 60;
		second = time2 % 60;
		
		System.out.println(time + "  �ʴ� " + hour + " �ð� " + min + "  �� " + second + "  ���Դϴ�. ");
		
		//hour  �� 24 �̻��̸� " �� 1���� ����߽��ϴ�." , 
		// �׷��� ������ " 1���̳��Դϴ�" ���
		
		//���ǻ��׿�����
		result = hour >= 24 ? " �� 1���� ����߽��ϴ�."  : " 1���̳��Դϴ�";
		
		//���ǹ�
		//if(hour >= 24) { result =" �� 1���� ����߽��ϴ�."; time2 = 1 ; }
		//else { result = " 1���̳��Դϴ�";  time2 = 0 ; }
		
		
		System.out.println(result);


	}

}
