package day2;

public class A{

public static void main(String[]  args)  {
// 1과 자신으로만 나누어지는 자연수(소수)

int number = 13;
//test 1
//number가 소수인지 아닌지 판단하여 13 : 소수이다 또는 13 : 소수가 아니다
// number 를 1~ number 사이 숫자 나누어서 나머지 0인 경우 2개
//number 를  1 ~ number 사이 숫자들로 나누어서(반복문 사용)  나머지 0인 경우  2개뿐인지 조사(조건문)하도록 조건을 설정합니다.
int cnt = 0;   
for(int  i = 1; i <= number; i++){
	if(number % i == 0) {
		cnt++;
	}
}

if(cnt == 2) {
System.out.println(number + "소수이다");
}
else {
System.out.println(number + "소수가 아니다");	
}
}
{
//test 2	
int number2 = 100;
// 2 : 소수이다
// 3 : 소수이다
// 4 : 소수 아니다
// ...
// 100 : 소수 아니다
for(int j = 2; j <=100; j++) {
int cnt2 = 0 ;
for(int i = 1; i <=j; i++) {
	if(j%i==0) {
		cnt2++;
	}
 	
	}//inner for end
if(cnt2 ==2) {
	
}
else {
}
}

}
}

