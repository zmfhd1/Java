package day2;

import java.util.Random;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// 1과 자신수로만 나누어지는 자연수
        int number = 13;
        //test1
        //number 가 소수인지 판단하여 13 : 소수이다 또는 13:소수가 아니다
        // number 를  1 ~ number 사이 숫자 나누어서 나머지 0인 경우 2개 
        int cnt = 0;
        for(int i = 3; i < number; i = i+2) {
        	if(number % i == 0) {
        		cnt++;
        	}
        }
        
        if(cnt == 0) {
        	System.out.println(number + " : 소수이다");
        }
        else {
        	System.out.println(number + " : 소수가 아니다");
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
            	System.out.println(j + " : 소수이다");
            }
            else {
            	System.out.println(j + " : 소수가 아니다");
            }
        }//outer for end
        
        // 2  : 소수이다
        // 3 : 소수이다
        // 4 : 소수 아니다
        //  ...
        // 100 :소수 아니다
        

        
	}

}
