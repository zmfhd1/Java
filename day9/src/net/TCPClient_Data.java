package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient_Data {

	public static void main(String[] args) throws Exception {
		//3. 서버(ip, port) 접속
		Socket s = new Socket("127.0.0.1", 9999);
		System.out.println("[클라이언트] : 서버와의 연결 완료됨");
		//String <--> byte[] 변환
		// 1. 로그인 2.회원가입  3.종료 4. 서버연결
		// 번호 : 1
		// 아이디 : xxx
		// 암호 : xxx
		String insa = "안녕 서버야 나는 자바 프로그래밍 과정을 공부중이야\n";
		byte[] insabyte = insa.getBytes();
		
		//5. 서버로 인사메시지 출력
		OutputStream o = s.getOutputStream();
		DataOutputStream datao =  new DataOutputStream(o);
		datao.writeUTF(insa);
		
		//8. 서버가 전송한 결과를 입력
		InputStream i = s.getInputStream();
		DataInputStream di = new DataInputStream(i);
		String imsistr = di.readUTF();
		System.out.println
		("[클라이언트] : " + imsistr + " 이라는 응답을 서버로부터 받음");
		
		
		//9. 3번 접속 해제
		s.close();

	}

}
