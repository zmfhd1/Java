package day5;

class A /*extends Object*/{
	int i ;
	A(String s){
		//super();
		System.out.println("A������ȣ��");
		i = 10;
	}
}

class B extends A{
	int j;
	B(){
		super("111"); //A(String) ������ȣ��
		System.out.println("B������ȣ��");
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
