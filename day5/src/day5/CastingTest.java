package day5;

//Parent p2 = new Child()
//p2.pr()
//필드변수와 non-overriding메소드 - Parent 포함 
//overriding메소드 - "우선" - Child 포함 
class Parent{
	int su = 10;
	void pr() {
		System.out.println(su);
	}
	void getParent() {
		System.out.println("Parent클래스");
	}
}

class Child extends Parent{
	int su = 20;
	void pr() {
		System.out.println(su);
	}
	void getChild() {
		System.out.println("Child클래스");
	}
}

public class CastingTest {
public static void main(String[] args) {
		Parent p1 = new Parent();//형변환필요x
		System.out.println(p1.su);
		p1.getParent();//Parent정의
		//p1.getChild();//메모리생성x
		
		Child c1 = new Child();//형변환필요x
		System.out.println(c1.su);
		c1.getParent();
		c1.getChild();//o
		
		Parent p2 = new Child();//자동형변환
		System.out.println(p2.su);//Parent변수
		System.out.println( ((Child)p2).su);//Child변수	- 20
		p2.getParent();
		((Child)p2).getChild();//메모리생성o. p2변수 사용 제한 
		
		/*Child c2 = (Child)p2;//명시적형변환
		System.out.println(c2.su);//Child변수-20
		c2.getParent();
		c2.getChild();*/
		

}
}



