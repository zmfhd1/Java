package day4;

class Data{
	int a = 10;
}

class Sample{
	void add(int i) { // �⺻������. �޼ҵ� ������ �� ȣ���ϴ� ���������� ���޹��� ������ �ִٸ� �Ű����� ����.=���ĸŰ�����
		System.out.println("add�޼ҵ峻��=" + i++);
	}
	void addData(Data d) {//����������. 
		System.out.println("addData�޼ҵ峻��=" + d.a ++ );
	}
}

public class CallByValueTest {
public static void main(String[] args) {
	Sample s = new Sample();
	//�⺻������ ���� 
	//int j = 10;
	//s.add(j);//�⺻������. �޼ҵ� ȣ�� ������ �� �Ű����� �ش� �� ����=�ǸŰ����� 
	//System.out.println("main�޼ҵ峻��=" + j );
	
	//���������� ����
	Data d2 = new Data();
	s.addData(d2);// ���������� �ǸŰ�����
	System.out.println("main�޼ҵ峻��=" + d2.a);
	
	// String �� int (10����) ��ȯ ��� 
	int r1 = Integer.parseInt("100");//100
	// String �� int (2,8,16����) ��ȯ ��� 
	int r2 = Integer.parseInt("100" , 2);//4
	System.out.println(r1);
	System.out.println(r2);
	
	

	
}
}





