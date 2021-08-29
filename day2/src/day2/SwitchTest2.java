package day2;

public class SwitchTest2 {
	public static void main(String args[]) {
		// 국어 영어 수학 점수 3개 입력
		// 총점, 평균(정수, 실수) 구하자
		
		
		int kor = 100;//(int)(Math.random() * 100) + 1;
		int eng = 100;//(int)(Math.random() * 100) + 1;
		int mat = 100;//(int)(Math.random() * 100) + 1;
		
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
		
		int avg3 = avg1 / 10; //10 9 8 
		// 정수 / 정수 ==> 정수
		switch(avg3) {// 동등비교만 
		case 10:
		case 9:
		case 8:
			System.out.println("A등급");
			break;
		case 7:
		case 6:
			System.out.println("B등급");
			break;
		case 5:
		case 4:
			System.out.println("C등급");
			break;
		default:
			System.out.println("낙제등급");
			//break;
		}

		
	}
}





