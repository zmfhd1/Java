package day2;

import java.util.Random;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// 1�� �ڽż��θ� ���������� �ڿ���
        int number = 13;
        //test1
        //number �� �Ҽ����� �Ǵ��Ͽ� 13 : �Ҽ��̴� �Ǵ� 13:�Ҽ��� �ƴϴ�
        // number ��  1 ~ number ���� ���� ����� ������ 0�� ��� 2�� 
        int cnt = 0;
        for(int i = 3; i < number; i = i+2) {
        	if(number % i == 0) {
        		cnt++;
        	}
        }
        
        if(cnt == 0) {
        	System.out.println(number + " : �Ҽ��̴�");
        }
        else {
        	System.out.println(number + " : �Ҽ��� �ƴϴ�");
        }
        //test2
        int number2 = 100;
        for(int j = 2; j <= 100; j++) {
            int cnt2 = 0;
            for(int i = 1; i <= j; i++) {
            	if(j % i == 0) {
            		cnt2++;
            	}
            }//inner for end
            
            if(cnt2 == 2) {
            	System.out.println(j + " : �Ҽ��̴�");
            }
            else {
            	System.out.println(j + " : �Ҽ��� �ƴϴ�");
            }
        }//outer for end
        
        // 2  : �Ҽ��̴�
        // 3 : �Ҽ��̴�
        // 4 : �Ҽ� �ƴϴ�
        //  ...
        // 100 :�Ҽ� �ƴϴ�
        

        
	}

}
