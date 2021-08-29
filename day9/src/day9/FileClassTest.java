package day9;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClassTest {

	public static void main(String[] args) throws IOException{
		//����� �Ű����� �Է� :  a.txt , . -->  File��ü�� ����
		File f = new File(args[0]); //����������Ʈ����
		if(f.exists()) {
			//��������
			if(f.isFile()) {
				System.out.println("�б�(�Է�)���ɿ���=" + f.canRead());
				System.out.println("����(���)���ɿ���=" + f.canWrite());	
				System.out.println("���ϰ��=" + f.getCanonicalPath());
				System.out.println("����ũ��(byte����)=" +  f.length());
				
				Date d = new Date(f.lastModified());//  1/1000�� --> �� �� ...
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy�⵵ MM�� dd�� HH�� mm�� ss��");
				
				System.out.println("���������ð�(...)=" + sdf.format(d));
			}
			else{//���丮
				String details[] = f.list();
				for(String one : details) {
					System.out.println(one);
					
				}
			}
			
		}
		else {
			System.out.println(args[0] + " �� �������� �ʽ��ϴ�.");
		}

	}

}
