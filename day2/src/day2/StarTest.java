package day2;

public class StarTest {
	public static void main(String[] args) {
		//10 * 10 ���� �� ��� = �簢�� ���
		//1  �ٿ� * 10�� �ݺ� -> 10�� �ݺ�
		for(int line=1; line <=10; line++) {
			for(int star = 1; star <=3; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		


	/*
	 * 
	 ** 
	 ***
	 ****
	 ****** 
	 */
	for(int line=1; line <=10; line++) {
			for(int star = 1; star <=line; star++) {
				System.out.print("*");
			}
			System.out.println();
	}	
	int count = 9;
	//   1�� ���� ���� (9/2 => 4��) + * (�߾� 1��)  �������*2 -1 
	//   2�� ���� ���� (3��) + * (�߾� 3��)	
	//   3�� ���� ���� (2��) + * (�߾� 5��)
	//   4�� ���� ���� (1��) + * (�߾� 7��)
	
	/*
	       *
	      ***
	     *****
	    ******* 
	   *********
	  
	 * */	
	
	for(int line = 1; line <= count / 2; line++) {
		//����
		for(int j = count / 2; j >= line; j--) {
			System.out.print(" ");
		}
		//��
		for(int star = 1; star <= line*2 -1 ; star++) {
			System.out.print("*");
		}
		System.out.println();
	}//outer for end
		
	}//main end
}//class end



			





