package day5;

class Employee{}
class Manager extends Employee {}
class Engineer extends Employee {}
class Secretary extends Employee{}

public class SalaryTest {

	public static void main(String[] args) {
		//4���� ���� ȸ��� �迭 ����
		Employee e[] = new Employee[4];
		e[0] = new Employee(100, "�̻��", 100000, 5000);
		e[1] = new Manager();
		e[2] = new Engineer();
		e[3] = new Secretary();
		
//
	}

}
