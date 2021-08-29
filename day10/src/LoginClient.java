

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class LoginClient {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("10.5.6.100", 8888);
		System.out.println("===���� ��ǻ�� 8888  ��Ʈ ���� ��û�մϴ�.===");
		System.out.println("=== " + s.getInetAddress().getHostAddress() + "���� ����.===");
		
		//Ŭ���̾�Ʈ�� ������ ���
		Scanner keyboard = new Scanner(System.in);
		System.out.print("���̵� �Է� : ");
		String id = keyboard.next() + " ";
		System.out.print("��ȣ �Է� : ");
		String pw = keyboard.next() + " ";	
		
		OutputStream os = s.getOutputStream();
		os.write(id.getBytes());
		os.write(pw.getBytes());
		os.flush();
		
		System.out.println("=== ������ ���̵�,  ��ȣ �����߽��ϴ�.===");
		
		//�����κ��� �Է�(import, ����ó��...)
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("=== �����κ��� " + server_reply + " ������ �޾ҽ��ϴ�.===");
		
		//is.close();
		//os.close();
		s.close();
		System.out.println("===���� ��ǻ�� 9999  ��Ʈ ���� �����մϴ�.===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
