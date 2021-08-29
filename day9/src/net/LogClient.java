package net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class LogClient {

	public static void main(String[] args) throws Exception {
		//3. ����(ip, port) ����
		Socket s = new Socket("192.168.0.51", 15000);
		System.out.println("[Ŭ���̾�Ʈ] : �������� ���� �Ϸ��");

		//String <--> byte[] ��ȯ
		String insa = "id:java-pw:1234\n";
		byte[] insabyte = insa.getBytes();
		
		//5. ������ �λ�޽��� ���
		OutputStream o = s.getOutputStream();
		o.write(insabyte);
		

		
		//9. 3�� ���� ����
		s.close();

	}

}
