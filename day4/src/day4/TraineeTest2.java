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
		//환급금 계산하다 기능 = 메소드
		if(title.equals("자바프로그래밍")) {
			returnFee = (int)(fee * 0.25 + addFee );
		}
		else if(title.equals("JDBC프로그래밍")) {
			returnFee = (int)(fee * 0.2 + addFee );
		}
		else  if(title.equals("JSP프로그래밍" ))  {
			returnFee = (int)( fee * 0.15 + addFee );
		}
		else {
			returnFee = 0;
		}
	}
	
	void printResult() {
		if(returnFee != 0) {
			System.out.println("이름=" + name);
			System.out.println("소속=" + center);
			System.out.println("과정명=" + title);
			System.out.println("교육비=" + fee);
			System.out.println("부가금=" + addFee);
			System.out.println("환급금=" + returnFee);
			
		}
		else {
			System.out.println("잘못 입력되었습니다");
		}
	}
}

public class TraineeTest2 {
public static void main(String[] args) {

	//run-run confirations-arguments-program arguments
	//이자바 멀티캠퍼스 JSP프로그래밍 50000 5000

	Trainee2 stu = new Trainee2(args[0], args[1], args[2], args[3], args[4]);
	stu.getReturnFee();//호출
	stu.printResult();//호출

}
}
