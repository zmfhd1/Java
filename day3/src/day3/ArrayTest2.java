package day3;

public class ArrayTest2 {

	public static void main(String args[]) {
	/* int scores[][] = new int[3][5]; //학생수들이 과목마다 동일 
	 System.out.println(scores.length);
	 System.out.println(scores[0].length);
	 
	 for(int i = 0; i < scores.length; i++) {//3
		 for(int j = 0; j < scores[i].length; j++) {//5
			 scores[i][j] = (int)(Math.random() * 100) + 1;
			 System.out.print(scores[i][j] + "\t");
		 }
		 System.out.println();
		 
	 }*/
	 System.out.println("====================================");
	 int scores[][] = new int[3][]; //학생수들이 과목마다 동일x 
	 System.out.println(scores.length);//3
	 
	 for(int i = 0; i < scores.length; i++) {//3
		 scores[i] = new int[i+3];// 서로 다른 학생수
		 //System.out.println(scores[i].length);//3, 4, 5
		 for(int j = 0; j < scores[i].length; j++) {//3, 4, 5
			 scores[i][j] = (int)(Math.random() * 100) + 1;
			 System.out.print(scores[i][j] + "\t");
		 }
		 System.out.println();
		 
	 }
	 

	}//main end

}//class end
