package net;

import java.net.*;

public class IPTest {

public static void main(String[] args) throws Exception{
	//내컴퓨터 ip정보 
	System.out.println(InetAddress.getLocalHost());
	//다른 컴퓨터 ip정보
	InetAddress[] ar = 	InetAddress.getAllByName("www.daum.net");
			//InetAddress.getAllByName("www.multicampus.com");
	 for(InetAddress i : ar) {
		 System.out.println(i.getHostAddress());
	 }
}

}
