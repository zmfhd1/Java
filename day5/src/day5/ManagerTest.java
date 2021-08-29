package day5;

class Employee{
	String title="회사원";
	int id;
	String name;
	double pay;
	public void work() {
		System.out.println(title + " 이 일하다");//50문장 가정
	}
	
}

class Manager extends Employee {
	/*public void work() {   ===> Employee 상속 메소드 
		System.out.println(title + " 이 일하다");
	}*/
	@Override //   자바시스템 오버라이딩임을 알려준다
	public void work() {
		super.work();//50문장 수행 동일 효과
		System.out.println(title + " 이 일하다");
		System.out.println(dept + " 직종을 관리하다 ");
	}
	//상속 	String title="회사원";
	String title = "관리직";
	String dept;
	void test() {//필드변수 - 클래스 내부 모든 메소드 사용 가능 , 매개변수 - 선언 메소드만 사용 가능. 호출 값 전달받을 용도
		//지역변수 - 선언 메소드만 사용 가능. 메소드내부 값 정해서
		String title = "test메소드";
		System.out.println(title);
		System.out.println(this.title);
		System.out.println(super.title);
	}
}
public class ManagerTest {
public static void main(String[] args) {
	Manager m = new Manager();
	m.id = 100;
	m.name = "최임원";
	m.pay = 10000.00;
	m.dept = "전산관리";
	System.out.println("사번=" + m.id );
	System.out.println("이름=" + m.name);
	System.out.println("급여=" + m.pay );
	System.out.println("관리업무=" + m.dept );
	System.out.println(m.title);//??
	m.work();
	m.test(); 


}
}
