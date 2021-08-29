
class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(100 , "박사원", 56000.99, "사원"); //객체생성. 생성자호출.
		System.out.println
		("사번 =" + e1.id + " 이름=" + e1.name + " 급여=" + e1.pay
		+ " 부서=" + e1.dept + " 직급=" + e1.title);
		
		Employee e2 = new Employee(200, "김대리");//사번과 이름
		System.out.println
		("사번 =" + e2.id + " 이름=" + e2.name + " 급여=" + e2.pay
		+ " 부서=" + e2.dept + " 직급=" + e2.title);
		
		Employee e3 = new Employee();//신입
		System.out.println
		("사번 =" + e3.id + " 이름=" + e3.name + " 급여=" + e3.pay
		+ " 부서=" + e3.dept + " 직급=" + e3.title);
		
		e1.work("교육부");//메소드 호출
		System.out.println(e1.getBonus());
		e2.work("전산부");
		System.out.println(e2.getBonus());
		e3.work("인사부");
		System.out.println(e3.getBonus());
		
		
	}
}//EmployeeTest.class(기계어)

class Employee{ //회사원객체 표현 클래스 정의
	int id ; //사번      
	String name; //이름
	double pay ; //급여
	String dept ; //부서명
	String title ; //직급
	Employee(int id, String name, double pay, String title){
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.title = title;
	}
	Employee(int id, String name){
		this(id, name, 0.0, "승진직전");
	}
	Employee(){
		this(-1, "미정", -1.0, "신입");
	}
	
	//메소드 추가 - 일하다 기능 구현 - 정의 
	// 기본형(8) + 참조형 + void 
	void work(String dept) {
		System.out.println(dept + "  부서에서 일한다");
	}
	double getBonus(){
		return pay * 0.1; //급여의 10% 결과 돌려주께
	}
}//Employee.class(기계어)








