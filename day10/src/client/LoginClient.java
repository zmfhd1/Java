package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class LoginClient {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("10.5.6.100", 8888);
		System.out.println("=== " + s.getInetAddress().getHostAddress() + " 8888 ��Ʈ ���� ���� ===");
		
		//Ű���� ���̵�� ��ȣ �Է�
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = keyboard.next() + " ";
		System.out.print("��ȣ �Է� : ");
		String pw = keyboard.next() + " ";
		
		//Ű���� �Է� ������  ������ ���
		OutputStream os = s.getOutputStream();
		//os.write( (id +"-" + pw).getBytes()  );  //sc.next()- "-" split
		os.write(id.getBytes());  //  sc.next(); //���� ����
		os.write(pw.getBytes());  //  sc.next();		
		
		System.out.println("=== ������ " + id + "," + pw + " �����߽��ϴ�.===");
		
		//�����κ��� ó����� �Է�
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("===" + server_reply + "===");
		
		is.close();
		os.close();
		s.close();
		System.out.println("===���� ��ǻ�� 9999  ��Ʈ ���� �����մϴ�.===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
