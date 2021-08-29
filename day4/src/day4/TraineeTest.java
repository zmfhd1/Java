package day4;

class Trainee{
	String name;
	String center;
	String title;
	int fee;
	int addFee;
	int returnFee;
	//자동포함 Trainee() {super();}
}

public class TraineeTest {
public static void main(String[] args) {

	//run-run confirations-arguments-program arguments
	//이자바 멀티캠퍼스 JSP프로그래밍 50000 5000

	Trainee stu = new Trainee();
	stu.name = args[0];
	stu.center = args[1];
	stu.title = args[2];
	stu.fee = Integer.parseInt(args[3]);
	stu.addFee = Integer.parseInt(args[4]);
	
	if(stu.title.equals("자바프로그래밍")) {
		stu.returnFee = (int)( stu.fee * 0.25 + stu.addFee );
	}
	else if(stu.title.equals("JDBC프로그래밍")) {
		stu.returnFee = (int)( stu.fee * 0.2 + stu.addFee );
	}
	else  if(stu.title.equals("JSP프로그래밍" ))  {
		stu.returnFee = (int)( stu.fee * 0.15 + stu.addFee );
	}
	else {
		stu.returnFee = 0;
	}

	if(stu.returnFee != 0) {
		System.out.println("이름=" + stu.name);
		System.out.println("소속=" + stu.center);
		System.out.println("과정명=" + stu.title);
		System.out.println("교육비=" + stu.fee);
		System.out.println("부가금=" + stu.addFee);
		System.out.println("환급금=" + stu.returnFee);
		
	}
	else {
		System.out.println("잘못 입력되었습니다");
	}
}
}
