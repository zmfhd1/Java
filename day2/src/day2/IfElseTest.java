package day2;

public class IfElseTest {
	public static void main(String args[]) {
		// 국어 영어 수학 점수 3개 입력
		// 총점, 평균(정수, 실수) 구하자
		
		
		int kor = (int)(Math.random() * 100) + 1;
		int eng = (int)(Math.random() * 100) + 1;
		int mat = (int)(Math.random() * 100) + 1;
		
		int total = kor + eng + mat;
		int avg1 = total / 3;
		double avg2 = (double)total / (double)3;
		
		System.out.println("국어점수=" + kor);
		System.out.println("영어점수=" + eng);
		System.out.println("수학점수=" + mat);
		System.out.println("총점=" + total);
		System.out.println("정수평균=" + avg1);
		System.out.println("실수평균=" + avg2);
		
		//정수 평균이 80 이상이면 "A" , 
		// 60이상이고 80 미만이면 'B'
		// 40이상이고 60미만이며 C
		//  나머지 낙제
		
		//if-else --> switch-case
		
		if(avg1 >= 80) { 			
			System.out.println("A등급"); 		
		}
		else if(avg1 >= 60) { 
			System.out.println("B등급");
		}
		else if(avg1 >= 40) {
			System.out.println("C등급");
		}
		else {
			System.out.println("낙제등급");
		}
		
	}
}





