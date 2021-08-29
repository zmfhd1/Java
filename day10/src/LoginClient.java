

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class LoginClient {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("10.5.6.100", 8888);
		System.out.println("===로컬 컴퓨터 8888  포트 접속 요청합니다.===");
		System.out.println("=== " + s.getInetAddress().getHostAddress() + "접속 성공.===");
		
		//클라이언트가 서버로 출력
		Scanner keyboard = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = keyboard.next() + " ";
		System.out.print("암호 입력 : ");
		String pw = keyboard.next() + " ";	
		
		OutputStream os = s.getOutputStream();
		os.write(id.getBytes());
		os.write(pw.getBytes());
		os.flush();
		
		System.out.println("=== 서버로 아이디,  암호 전송했습니다.===");
		
		//서버로부터 입력(import, 예외처리...)
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("=== 서버로부터 " + server_reply + " 응답을 받았습니다.===");
		
		//is.close();
		//os.close();
		s.close();
		System.out.println("===로컬 컴퓨터 9999  포트 접속 해제합니다.===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
