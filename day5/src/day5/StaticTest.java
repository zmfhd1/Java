package day5;

class Person{
	String name;
	int age;
	//��� ��ü 1���� ���� �ʵ庯��. Ŭ������.xxx
	final static String nation = "���ѹα�";
}
public class StaticTest {
	public static void main(String[] args) {
		System.out.println("��� ����� ����=" +Person.nation);
		//Ŭ������.static������  or ��ü�ּ�����������.static������  
		//Person.nation, p1.nation, p2.nation
		
		Person p1 = new Person();
		p1.name="�̴���"; //��ü�ּ�����������.non-static������
		p1.age = 25;
		//p1.nation = "�̱�";
		System.out.println("p1 ���� ��ü�� �̸��� " + p1.name + " �̰� ���̴� " + p1.age 
				+ " �̸� ������  " + p1.nation + " �Դϴ�.");
		Person p2 = new Person();
		p2.name="�ڹα�";
		p2.age = 35;
		//p2.nation = "���ѹα�";
		System.out.println("p2 ���� ��ü�� �̸��� " + p2.name + " �̰� ���̴� " + p2.age 
				+ " �̸� ������  " + p2.nation + " �Դϴ�.");
		
		//int ( 2 ^ 31 - 1) �ִ밪
		System.out.println(Integer.MAX_VALUE);
	
	}

}
