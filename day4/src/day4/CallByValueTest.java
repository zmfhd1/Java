package day4;

class Data{
	int a = 10;
}

class Sample{
	void add(int i) { // 기본형변수. 메소드 정의할 때 호출하는 곳에서부터 전달받을 변수가 있다면 매개변수 정의.=형식매개변수
		System.out.println("add메소드내부=" + i++);
	}
	void addData(Data d) {//참조형변수. 
		System.out.println("addData메소드내부=" + d.a ++ );
	}
}

public class CallByValueTest {
public static void main(String[] args) {
	Sample s = new Sample();
	//기본형변수 전달 
	//int j = 10;
	//s.add(j);//기본형변수. 메소드 호출 실행할 때 매개변수 해당 값 전달=실매개변수 
	//System.out.println("main메소드내부=" + j );
	
	//참조형변수 전달
	Data d2 = new Data();
	s.addData(d2);// 참조형변수 실매개변수
	System.out.println("main메소드내부=" + d2.a);
	
	// String 을 int (10진수) 변환 기능 
	int r1 = Integer.parseInt("100");//100
	// String 을 int (2,8,16진수) 변환 기능 
	int r2 = Integer.parseInt("100" , 2);//4
	System.out.println(r1);
	System.out.println(r2);
	
	

	
}
}





