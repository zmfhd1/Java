package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception {
		//3. ����(ip, port) ����
		Socket s = new Socket("127.0.0.1", 9999);
		System.out.println("[Ŭ���̾�Ʈ] : �������� ���� �Ϸ��");
		//String <--> byte[] ��ȯ
		// 1. �α��� 2.ȸ������  3.���� 4. ��������
		// ��ȣ : 1
		// ���̵� : xxx
		// ��ȣ : xxx
		String insa = "�ȳ� ������ ���� �ڹ� ���α׷��� ������ �������̾�\n";
		byte[] insabyte = insa.getBytes();
		
		//5. ������ �λ�޽��� ���
		OutputStream o = s.getOutputStream();
		o.write(insabyte);
		
		//8. ������ ������ ����� �Է�
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
		("[Ŭ���̾�Ʈ] : " + imsistr + " �̶�� ������ �����κ��� ����");
		
		
		//9. 3�� ���� ����
		s.close();

	}

}
