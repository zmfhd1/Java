package day2;

public class SwitchTest2 {
	public static void main(String args[]) {
		// ���� ���� ���� ���� 3�� �Է�
		// ����, ���(����, �Ǽ�) ������
		
		
		int kor = 100;//(int)(Math.random() * 100) + 1;
		int eng = 100;//(int)(Math.random() * 100) + 1;
		int mat = 100;//(int)(Math.random() * 100) + 1;
		
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
		
		int avg3 = avg1 / 10; //10 9 8 
		// ���� / ���� ==> ����
		switch(avg3) {// ����񱳸� 
		case 10:
		case 9:
		case 8:
			System.out.println("A���");
			break;
		case 7:
		case 6:
			System.out.println("B���");
			break;
		case 5:
		case 4:
			System.out.println("C���");
			break;
		default:
			System.out.println("�������");
			//break;
		}

		
	}
}





