package day3; //Ŭ�������� ������ ���� ����/���丮 ���� = package

//day3  ��Ű�� ��/�ܺ� �ٸ� Ŭ���������� EmployeeTest  ��� ����

//1�� �ڹ� �ҽ����Ͽ� 2�� �̻� Ŭ���� ���� ����
// public ����� Ŭ������.java �����ؾ߸� �Դ�
// main�޼ҵ� ������ Ŭ������.java �����ؾ߸� �Ѵ�
// �ڹټҽ����� 1�� --> EmployeeTest.class , Employee.class ���� 2�� ���� 

class EmployeeTest {//  ��ü ����, �޼ҵ�, ���� ȣ�� �� ���� ���� ����=main �޼ҵ�
	public static void main(String[] args) {
		Employee e1 = new Employee();
		// Ŭ����  ��ü�ּҰ����������� = new Ŭ������()
		e1.id = 100;
		e1.name = "�ڻ��";
		e1.pay = 56000.99;
		e1.dept = "������";
		e1.title = "���";
		System.out.println
		("��� =" + e1.id + " �̸�=" + e1.name + " �޿�=" + e1.pay
		+ " �μ�=" + e1.dept + " ����=" + e1.title);

		Employee e2 = new Employee();
		// Ŭ����  ��ü�ּҰ����������� = new Ŭ������()
		e2.id = 200;
		e2.name = "��븮";
		e2.pay = 66000.99;
		e2.dept = "������";
		e2.title = "�븮";
		System.out.println
		("��� =" + e2.id + " �̸�=" + e2.name + " �޿�=" + e2.pay
		+ " �μ�=" + e2.dept + " ����=" + e2.title);
		
	}


}

class Employee{ //ȸ�����ü ǥ�� Ŭ����
	int id; //���      Ÿ�� ������ ;
	String name; //�̸�
	double pay ; //�޿�
	String dept ; //�μ���
	String title ; //����
 
}
