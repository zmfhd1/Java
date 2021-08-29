package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {//1��

	public static void main(String[] args) 
	throws Exception {
		//1. port��ȣ ����  ServerSocket ����(9999)
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("[����] : ���۵�");
		
		while(true) {
		//2. Ŭ���̾�Ʈ ��� 4. ��	�� ���
		Socket s = ss.accept();
		String client = s.getInetAddress().getHostAddress();
		System.out.println
		("[����] : " + client + " ��ǻ�� ���� �����");
		
		//6. Ŭ���̾�Ʈ ������ ������(byte[]) �Է�
		InputStream i = s.getInputStream();
		
		//���1 
		//byte[] imsi = new byte[200];
		//i.read(imsi); //�������κ��� �Է¹��� �����͸� imsi �迭 ����
		//byte[] --> String ��ȯ
		//String imsistr = new String(imsi);
		
		//���2
		Scanner scan = new Scanner(i);
		String imsistr = scan.nextLine();
		
		System.out.println
		("[����] : " + imsistr + " �̶�� �޽����� Ŭ���̾�Ʈ�κ��� ����");
		
		//7. ���� ���� ��� ���
		//String <--> byte[] ��ȯ
		String reply = "���� ��������!!!\n";
		byte[] replybyte = reply.getBytes();//
		OutputStream o = s.getOutputStream();
		o.write(replybyte);
		
		//10. 4�� ���� ����
		s.close();
		}//while end
	}

}

