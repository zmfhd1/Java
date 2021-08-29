package day10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) {
		try {
		InetAddress myip = InetAddress.getLocalHost();//������ǻ��
		System.out.println(myip.getHostAddress()); //������ǻ��ip
		System.out.println(myip.getHostName()); //������ǻ���̸�
		
		// www.daum.net -  ���� ���� ����(���� ip)
		// ��Ʈ��ũ Ŭ���̾�Ʈ�� ���� ip address + ��(port) �˾ƾ� �Ѵ�
		// Ŭ���̾�Ʈ ���� ������  = 203.133.167.81 + 8080 <==(�ؼ�)-- domain name
		InetAddress[] otherip = InetAddress.getAllByName("www.multicampus.com");
		for(InetAddress one : otherip) {
			System.out.println(one.getHostAddress());
			//���� - 203.133.167.81
			//���̹� - 125.209.222.142 , 223.130.195.200
			//112.106.58.23
		}
		
		}catch(UnknownHostException e) {
			e.printStackTrace(); 
		}
	}

}
