package day2;

public class IfElseTest {
	public static void main(String args[]) {
		// ���� ���� ���� ���� 3�� �Է�
		// ����, ���(����, �Ǽ�) ������
		
		
		int kor = (int)(Math.random() * 100) + 1;
		int eng = (int)(Math.random() * 100) + 1;
		int mat = (int)(Math.random() * 100) + 1;
		
		int total = kor + eng + mat;
		int avg1 = total / 3;
		double avg2 = (double)total / (double)3;
		
		System.out.println("��������=" + kor);
		System.out.println("��������=" + eng);
		System.out.println("��������=" + mat);
		System.out.println("����=" + total);
		System.out.println("�������=" + avg1);
		System.out.println("�Ǽ����=" + avg2);
		
		//���� ����� 80 �̻��̸� "A" , 
		// 60�̻��̰� 80 �̸��̸� 'B'
		// 40�̻��̰� 60�̸��̸� C
		//  ������ ����
		
		//if-else --> switch-case
		
		if(avg1 >= 80) { 			
			System.out.println("A���"); 		
		}
		else if(avg1 >= 60) { 
			System.out.println("B���");
		}
		else if(avg1 >= 40) {
			System.out.println("C���");
		}
		else {
			System.out.println("�������");
		}
		
	}
}





