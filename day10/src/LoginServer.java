

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//���� 1�� - Ŭ���̾�Ʈ ������
public class LoginServer {

	public static void main(String[] args) {
		try {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("===������ 8888  ��Ʈ�� �����մϴ�===");
		while(true) {
			Socket s = ss.accept();
			System.out.println("=== " + s.getInetAddress().getHostAddress() + " Ŭ���̾�Ʈ�� ����Ǿ����ϴ�===");
			
			// ������ Ŭ���̾�Ʈ�κ��� �����͸� �Է� ���2
			InputStream is = s.getInputStream();
			System.out.println(1);
			Scanner sc = new Scanner(is);
			System.out.println(1);
			String id = sc.next();
			System.out.println(1);
			String pw = sc.next();
			System.out.println(1);
			System.out.println("===Ŭ���̾�Ʈ�� ������  ���̵�, ��ȣ�� " + id + "," + pw + "  �Դϴ�.");			
			
			//Ŭ���̾�Ʈ�� ���� �λ� ���� = ������ Ŭ���̾�Ʈ�� ���
			OutputStream os = s.getOutputStream();
			String server_reply = " �� �����ϴ�.\n";
			byte[] server_reply_byte = server_reply.getBytes();
			os.write(server_reply_byte);
			System.out.println("===Ŭ���̾�Ʈ �� �����߽��ϴ�===");
			
			//is.close();
			//os.close();
			s.close();
			System.out.println("===Ŭ���̾�Ʈ�� ���������Ǿ����ϴ�===");
		}//while end
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
