package day4;

class Trainee2{
	String name;
	String center;
	String title;
	int fee;
	int addFee;
	int returnFee;
	Trainee2(String name, String center, String title, String fee, String addFee){
		this.name = name;
		this.center = center;
		this.title = title;
		this.fee = Integer.parseInt(fee);
		this.addFee = Integer.parseInt(addFee);
	}
	void getReturnFee() {
		//ȯ�ޱ� ����ϴ� ��� = �޼ҵ�
		if(title.equals("�ڹ����α׷���")) {
			returnFee = (int)(fee * 0.25 + addFee );
		}
		else if(title.equals("JDBC���α׷���")) {
			returnFee = (int)(fee * 0.2 + addFee );
		}
		else  if(title.equals("JSP���α׷���" ))  {
			returnFee = (int)( fee * 0.15 + addFee );
		}
		else {
			returnFee = 0;
		}
	}
	
	void printResult() {
		if(returnFee != 0) {
			System.out.println("�̸�=" + name);
			System.out.println("�Ҽ�=" + center);
			System.out.println("������=" + title);
			System.out.println("������=" + fee);
			System.out.println("�ΰ���=" + addFee);
			System.out.println("ȯ�ޱ�=" + returnFee);
			
		}
		else {
			System.out.println("�߸� �ԷµǾ����ϴ�");
		}
	}
}

public class TraineeTest2 {
public static void main(String[] args) {

	//run-run confirations-arguments-program arguments
	//���ڹ� ��Ƽķ�۽� JSP���α׷��� 50000 5000

	Trainee2 stu = new Trainee2(args[0], args[1], args[2], args[3], args[4]);
	stu.getReturnFee();//ȣ��
	stu.printResult();//ȣ��

}
}
