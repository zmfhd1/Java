package day3;

public class ArrayTest1 {
// 1차원 배열. 이름, 과목 1개 점수 배열
	public static void main(String[] args) {
		// 5명 학생이름 저장 배열
		// 과목 점수 저장 배열
		// 이자바 : 95
		// 배열 선언 + 생성 + 초기화를 1문장으로
		// names.length , scores.length
		String names [] = {"김준호", "박연경", "최재우", "이자바", "김인정"}; //new String [5];
		//굳이 다른것들 수정하지 않아도 됨
		//배열 선언 + 생성
		int scores [] = new int[names.length];
		//배열 초기화
		for(int i = 0 ; i <= names.length ; i++) {
		scores[i] = (int)(Math.random() * 100) + 1;
		}
		//출력
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(names[i] + " : " + scores[i] );
		}
		//1등 : 이름 : 점수
		/*김준호 : 68
박연경 : 88
최재우 : 86
이자바 : 29
김인정 : 53
*/
		int max = 0 ; // score 배열 최대값 저장 변수
		int maxIndex = 0;
		for(int i = 0 ; i < names.length ; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxIndex = i;
			}
		}
		System.out.println("1등 : " + names[maxIndex] + " : " + scores[maxIndex]);
		// max = o scores[0] 비교 ==> max = 18 [18,29,88,66,77]
		// max = 18 scores[1] 비교 ==> max = 29
// max = 29 scores[2] 비교 ==> max = 88
		// max = 88 scores[3] 비교 ==> 아무 일도 안한다
		// max = 88 scores[4] 비교 ==> 아무 일도 안한다
		// 전체 등수 구해보기
		
		//클래스 실행시 김준호 입력하면 scores 배열에서 김준호 점수 출력
		//클래스 실행시 박준호 입력하면 해당 학생은 존재하지 않습니다. 출력
		
		//args[0] - names 배열 5개 이름 중 같은지 비교 찾으면 인덱스 기억 - 점수배열[인덱스]
		//{"김준호", "박연경", "최재우", "이자바", "김인정"};
		
		boolean result = false;
		for(int i = 0 ; i < names.length ; i++) {
			if(args[0].equals(names[i])) { // [0]과 [i]가 문자열이기 때문에 == 사용시 주소값을 비교하게 됨
			System.out.println(scores[i]);
			result = true;
			break;
			}
		}//for end
		
		if(result == false ) {
			System.out.println("해당 학생은 존재하지 않습니다");
		}
		
		for(int i = 0 ; i < names.length ; i++) {
			System.out.println(names[i]);
		}//for end
		
		//jdk 1.5 이후 추가 문법 = 향상된 for
		for( String one : names/*반복사용 할 것 입력*/) {
			System.out.println(one);
	}	
}
}

