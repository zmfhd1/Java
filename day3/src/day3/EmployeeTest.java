package day3; //클래스파일 여러개 저장 폴더/디렉토리 단위 = package

//day3  패키지 내/외부 다른 클래스에서도 EmployeeTest  사용 가능

//1개 자바 소스파일에 2개 이상 클래스 정의 가능
// public 선언된 클래스명.java 정의해야만 함다
// main메소드 포함한 클래스명.java 정의해야만 한다
// 자바소스파일 1개 --> EmployeeTest.class , Employee.class 파일 2개 생성 

class EmployeeTest {//  객체 생성, 메소드, 변수 호출 값 수정 문장 실행=main 메소드
	public static void main(String[] args) {
		Employee e1 = new Employee();
		// 클래스  객체주소값참조변수명 = new 클래스명()
		e1.id = 100;
		e1.name = "박사원";
		e1.pay = 56000.99;
		e1.dept = "교육부";
		e1.title = "사원";
		System.out.println
		("사번 =" + e1.id + " 이름=" + e1.name + " 급여=" + e1.pay
		+ " 부서=" + e1.dept + " 직급=" + e1.title);

		Employee e2 = new Employee();
		// 클래스  객체주소값참조변수명 = new 클래스명()
		e2.id = 200;
		e2.name = "김대리";
		e2.pay = 66000.99;
		e2.dept = "교육부";
		e2.title = "대리";
		System.out.println
		("사번 =" + e2.id + " 이름=" + e2.name + " 급여=" + e2.pay
		+ " 부서=" + e2.dept + " 직급=" + e2.title);
		
	}


}

class Employee{ //회사원객체 표현 클래스
	int id; //사번      타입 변수명 ;
	String name; //이름
	double pay ; //급여
	String dept ; //부서명
	String title ; //직급
 
}
