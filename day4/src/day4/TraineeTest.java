package day4;

class Trainee{
	String name;
	String center;
	String title;
	int fee;
	int addFee;
	int returnFee;
	//�ڵ����� Trainee() {super();}
}

public class TraineeTest {
public static void main(String[] args) {

	//run-run confirations-arguments-program arguments
	//���ڹ� ��Ƽķ�۽� JSP���α׷��� 50000 5000

	Trainee stu = new Trainee();
	stu.name = args[0];
	stu.center = args[1];
	stu.title = args[2];
	stu.fee = Integer.parseInt(args[3]);
	stu.addFee = Integer.parseInt(args[4]);
	
	if(stu.title.equals("�ڹ����α׷���")) {
		stu.returnFee = (int)( stu.fee * 0.25 + stu.addFee );
	}
	else if(stu.title.equals("JDBC���α׷���")) {
		stu.returnFee = (int)( stu.fee * 0.2 + stu.addFee );
	}
	else  if(stu.title.equals("JSP���α׷���" ))  {
		stu.returnFee = (int)( stu.fee * 0.15 + stu.addFee );
	}
	else {
		stu.returnFee = 0;
	}

	if(stu.returnFee != 0) {
		System.out.println("�̸�=" + stu.name);
		System.out.println("�Ҽ�=" + stu.center);
		System.out.println("������=" + stu.title);
		System.out.println("������=" + stu.fee);
		System.out.println("�ΰ���=" + stu.addFee);
		System.out.println("ȯ�ޱ�=" + stu.returnFee);
		
	}
	else {
		System.out.println("�߸� �ԷµǾ����ϴ�");
	}
}
}
