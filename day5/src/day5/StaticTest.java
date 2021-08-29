package day5;

class Person{
	String name;
	int age;
	//모든 객체 1개값 공유 필드변수. 클래스명.xxx
	final static String nation = "대한민국";
}
public class StaticTest {
	public static void main(String[] args) {
		System.out.println("모든 사람의 국적=" +Person.nation);
		//클래스명.static변수명  or 객체주소참조변수명.static변수명  
		//Person.nation, p1.nation, p2.nation
		
		Person p1 = new Person();
		p1.name="이대한"; //객체주소참조변수명.non-static변수명
		p1.age = 25;
		//p1.nation = "미국";
		System.out.println("p1 참조 객체의 이름은 " + p1.name + " 이고 나이는 " + p1.age 
				+ " 이며 국적은  " + p1.nation + " 입니다.");
		Person p2 = new Person();
		p2.name="박민국";
		p2.age = 35;
		//p2.nation = "대한민국";
		System.out.println("p2 참조 객체의 이름은 " + p2.name + " 이고 나이는 " + p2.age 
				+ " 이며 국적은  " + p2.nation + " 입니다.");
		
		//int ( 2 ^ 31 - 1) 최대값
		System.out.println(Integer.MAX_VALUE);
	
	}

}
