package day2;

public class SwitchTest {

	public static void main(String[] args) {
		int month = (int)(Math.random() * 20) + 1; //1-20 �� ���� ���� 
		int day = 0;
		
		// jdk 1.7 ���ĺ��� switch(String �� ����)
		switch(month) {// byte, short, char-->(�ڵ�����ȯ Ÿ�Ե�) int
		case 1://�� ���� ��
		case 3: 
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:	
			day = 31;
			break;
		case 2:
			day = 28;
			System.out.println("2�� case����");
			break;	
		case 4:
		case 6:
		case 9:
		case 11:	
			day = 30;
			break;
		default :
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		}
		System.out.println(month + "   ���� " + day + " �ϱ��� �ֽ��ϴ�.");
		
	}

}
