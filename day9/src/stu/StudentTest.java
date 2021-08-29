package stu;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Student{
	String name;
	int kor, eng, mat, sum, avg;
	public Student(String name, int kor, int eng, int mat) {
		//super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	void calc() {
		sum = kor + eng + mat;
		avg = sum / 3;
	}
	@Override
	public String toString() {
		return name + "-" + kor +  "-" + eng + "-" + mat + "-" + sum + "-" + avg ;
	}
	
	
}
public class StudentTest {
	public static void main(String[] args) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		
		//input.dat 파일 입력
		FileReader fr = new FileReader("input.dat");
		Scanner s = new Scanner(fr);
		/*while(s.hasNextLine() == true) {
			String line = s.nextLine(); //김수미 99 100 45
			String inform[] = line.split(" ");
			Student s1 = new Student(inform[0], Integer.parseInt(inform[1]), 
					Integer.parseInt(inform[2]), Integer.parseInt(inform[3]));
			s1.calc();
			System.out.println(s1);// 김수미-99-100-45-sum-avg
		*/
		while(s.hasNext() == true) {
			Student s1 = new Student(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
			s1.calc();
			//System.out.println(s1);// 김수미-99-100-45-sum-avg
			list.add(s1);
		}
		
		int maxSum = 0; //  maxSum => 300     [243][300][190][250][111]  
		int rank = 0; // 최대총점 학생 list  몇번 index
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).sum > maxSum) {
				maxSum = list.get(i).sum;
				rank = i;
			}
		}
		
		//파일 출력 
		FileWriter fw = new FileWriter("out.dat");
		for(Student one :list) {
			fw.write(one.toString() + "\n");
		}
		
		fw.write("\n");
		fw.write("1등 " + list.get(rank).name + " " + list.get(rank).sum + " " + list.get(rank).avg);
		
		fr.close();
		fw.close();
		
	}

}









