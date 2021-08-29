
class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(100 , "�ڻ��", 56000.99, "���"); //��ü����. ������ȣ��.
		System.out.println
		("��� =" + e1.id + " �̸�=" + e1.name + " �޿�=" + e1.pay
		+ " �μ�=" + e1.dept + " ����=" + e1.title);
		
		Employee e2 = new Employee(200, "��븮");//����� �̸�
		System.out.println
		("��� =" + e2.id + " �̸�=" + e2.name + " �޿�=" + e2.pay
		+ " �μ�=" + e2.dept + " ����=" + e2.title);
		
		Employee e3 = new Employee();//����
		System.out.println
		("��� =" + e3.id + " �̸�=" + e3.name + " �޿�=" + e3.pay
		+ " �μ�=" + e3.dept + " ����=" + e3.title);
		
		e1.work("������");//�޼ҵ� ȣ��
		System.out.println(e1.getBonus());
		e2.work("�����");
		System.out.println(e2.getBonus());
		e3.work("�λ��");
		System.out.println(e3.getBonus());
		
		
	}
}//EmployeeTest.class(����)

class Employee{ //ȸ�����ü ǥ�� Ŭ���� ����
	int id ; //���      
	String name; //�̸�
	double pay ; //�޿�
	String dept ; //�μ���
	String title ; //����
	Employee(int id, String name, double pay, String title){
		this.id = id;
		this.name = name;
		this.pay = pay;
		this.title = title;
	}
	Employee(int id, String name){
		this(id, name, 0.0, "��������");
	}
	Employee(){
		this(-1, "����", -1.0, "����");
	}
	
	//�޼ҵ� �߰� - ���ϴ� ��� ���� - ���� 
	// �⺻��(8) + ������ + void 
	void work(String dept) {
		System.out.println(dept + "  �μ����� ���Ѵ�");
	}
	double getBonus(){
		return pay * 0.1; //�޿��� 10% ��� �����ֲ�
	}
}//Employee.class(����)








