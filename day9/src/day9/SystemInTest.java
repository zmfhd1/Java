package day9;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args)  {
		try {	
			while(true) {
				int result = System.in.read();//jdk ��ġ�Ǹ鼭 Ű���� �Է� ���� ����. 1����Ʈ
				// 4BYTE ���� result �� 1����Ʈ�� ����. ������ �ڵ尪
				if((char)result == '\n' ) { break; }
				//if(result == 13) {break; }
				System.out.println( result );
			}
			
		//	Ű�����Է� ������ �״�� ��� (���� x - int, double  Ÿ��)
		// �ѱ۵����� ǥ��x (String Ÿ��)
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
