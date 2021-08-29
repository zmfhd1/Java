package day10;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPTest {

	public static void main(String[] args) {
		try {
		InetAddress myip = InetAddress.getLocalHost();//현재컴퓨터
		System.out.println(myip.getHostAddress()); //현재컴퓨터ip
		System.out.println(myip.getHostName()); //현재컴퓨터이름
		
		// www.daum.net -  다음 서버 접속(다음 ip)
		// 네트워크 클라이언트는 서버 ip address + 웹(port) 알아야 한다
		// 클라이언트 많은 서버들  = 203.133.167.81 + 8080 <==(해석)-- domain name
		InetAddress[] otherip = InetAddress.getAllByName("www.multicampus.com");
		for(InetAddress one : otherip) {
			System.out.println(one.getHostAddress());
			//다음 - 203.133.167.81
			//네이버 - 125.209.222.142 , 223.130.195.200
			//112.106.58.23
		}
		
		}catch(UnknownHostException e) {
			e.printStackTrace(); 
		}
	}

}
