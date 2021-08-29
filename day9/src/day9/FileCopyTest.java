package day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("�������ϸ� : ");
		String sourcefile = s.next();
		System.out.print("���������ϸ� : ");
		String destfile = s.next();
	/* 1. a.txt b.txt ->  �Է����� ������� ���� �߻� - �ߴ�
	 * 2. src/day9/FileCopyTest.java b.txt -> ������� ������� �ڵ� ����(����������Ʈ-F5)
	 * 3. src/day9/ScannerTest.java b.txt ->  ������� ����� ���� ���� ��� ����
	 * 4. �ҽ� ���� new FileWriter(destfile,  true ); �����ϰ� 
	 *    src/day9/SystemInTest.java b.txt -> ������� ����� ���� ���� �߰� ���
	 * */	
		FileReader fr = null;
		FileWriter fw = null;
		try {
		fr = new FileReader(sourcefile);
		fw = new FileWriter(destfile, true);
		while(true) {
			int r = fr.read();
			if(r == -1) { break; } //end of file = eof
			fw.write(r);
		}
		// ���Ϻ��� ���� = fr �Է¹޾Ƽ� -- fw ��� (���ܹ߻�--�ߴ�)
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
