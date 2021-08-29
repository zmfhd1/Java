package day5;

class Employee{}
class Manager extends Employee {}
class Engineer extends Employee {}
class Secretary extends Employee{}

public class SalaryTest {

	public static void main(String[] args) {
		//4가지 직종 회사원 배열 선언
		Employee e[] = new Employee[4];
		e[0] = new Employee(100, "이사원", 100000, 5000);
		e[1] = new Manager();
		e[2] = new Engineer();
		e[3] = new Secretary();
		
//
	}

}
