package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class TCPClientTest {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("10.5.6.100", 9999);
		System.out.println("===로컬 컴퓨터 9999  포트 접속 요청합니다.===");
		System.out.println("=== " + s.getInetAddress().getHostAddress() + "접속 성공.===");
		
		//클라이언트가 서버로 출력
		String id = "안녕 하세요\n";//한글 5개이면 byte 길이 10.  영문 5개이면 byte 배열 길이 5.
		byte id_byte [] = id.getBytes();
		
		OutputStream os = s.getOutputStream();
		os.write(id_byte);
		System.out.println("=== "+ id_byte.length +" ===");
		System.out.println("=== 서버로 아이디 전송했습니다.===");
		
		//서버로부터 입력(import, 예외처리...)
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("=== 서버로부터 " + server_reply + " 응답을 받았습니다.===");
		
		is.close();
		os.close();
		s.close();
		System.out.println("===로컬 컴퓨터 9999  포트 접속 해제합니다.===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
