package day5;

class Employee{
	String title="ȸ���";
	int id;
	String name;
	double pay;
	public void work() {
		System.out.println(title + " �� ���ϴ�");//50���� ����
	}
	
}

class Manager extends Employee {
	/*public void work() {   ===> Employee ��� �޼ҵ� 
		System.out.println(title + " �� ���ϴ�");
	}*/
	@Override //   �ڹٽý��� �������̵����� �˷��ش�
	public void work() {
		super.work();//50���� ���� ���� ȿ��
		System.out.println(title + " �� ���ϴ�");
		System.out.println(dept + " ������ �����ϴ� ");
	}
	//��� 	String title="ȸ���";
	String title = "������";
	String dept;
	void test() {//�ʵ庯�� - Ŭ���� ���� ��� �޼ҵ� ��� ���� , �Ű����� - ���� �޼ҵ常 ��� ����. ȣ�� �� ���޹��� �뵵
		//�������� - ���� �޼ҵ常 ��� ����. �޼ҵ峻�� �� ���ؼ�
		String title = "test�޼ҵ�";
		System.out.println(title);
		System.out.println(this.title);
		System.out.println(super.title);
	}
}
public class ManagerTest {
public static void main(String[] args) {
	Manager m = new Manager();
	m.id = 100;
	m.name = "���ӿ�";
	m.pay = 10000.00;
	m.dept = "�������";
	System.out.println("���=" + m.id );
	System.out.println("�̸�=" + m.name);
	System.out.println("�޿�=" + m.pay );
	System.out.println("��������=" + m.dept );
	System.out.println(m.title);//??
	m.work();
	m.test(); 


}
}