package day2;

public class A{

public static void main(String[]  args)  {
// 1�� �ڽ����θ� ���������� �ڿ���(�Ҽ�)

int number = 13;
//test 1
//number�� �Ҽ����� �ƴ��� �Ǵ��Ͽ� 13 : �Ҽ��̴� �Ǵ� 13 : �Ҽ��� �ƴϴ�
// number �� 1~ number ���� ���� ����� ������ 0�� ��� 2��
//number ��  1 ~ number ���� ���ڵ�� �����(�ݺ��� ���)  ������ 0�� ���  2�������� ����(���ǹ�)�ϵ��� ������ �����մϴ�.
int cnt = 0;   
for(int  i = 1; i <= number; i++){
	if(number % i == 0) {
		cnt++;
	}
}

if(cnt == 2) {
System.out.println(number + "�Ҽ��̴�");
}
else {
System.out.println(number + "�Ҽ��� �ƴϴ�");	
}
}
{
//test 2	
int number2 = 100;
// 2 : �Ҽ��̴�
// 3 : �Ҽ��̴�
// 4 : �Ҽ� �ƴϴ�
// ...
// 100 : �Ҽ� �ƴϴ�
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

