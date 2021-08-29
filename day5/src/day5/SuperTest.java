package day5;

class A /*extends Object*/{
	int i ;
	A(String s){
		//super();
		System.out.println("A생성자호출");
		i = 10;
	}
}

class B extends A{
	int j;
	B(){
		super("111"); //A(String) 생성자호출
		System.out.println("B생성자호출");
		j = 20;
	}
}
public class SuperTest {
public static void main(String[] args) {
	B b1 = new B();
	System.out.println(b1.i);
	System.out.println(b1.j);

}
}
