package day2;

public class GugudanTest {

	public static void main(String[] args) {
//5 �� ���� ��� ���ϰڴ�
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {// j �ܺ���
				//if(j == 5) { continue; }//5�ܸ� ��� ����
				
				System.out.println("������");
				//if(j == 5) { break; } //5������ ��� �ߴ�
				System.out.print(j + "*" + i + "=" +  j * i + "\t");
			}//inner for end
			System.out.println();
		}//outer for end

		
	}

}
