package client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class LoginClient {

	public static void main(String[] args) {
		try {
		Socket s = new Socket("10.5.6.100", 8888);
		System.out.println("=== " + s.getInetAddress().getHostAddress() + " 8888 포트 접속 성공 ===");
		
		//키보드 아이디와 암호 입력
		Scanner keyboard = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = keyboard.next() + " ";
		System.out.print("암호 입력 : ");
		String pw = keyboard.next() + " ";
		
		//키보드 입력 내용을  서버로 출력
		OutputStream os = s.getOutputStream();
		//os.write( (id +"-" + pw).getBytes()  );  //sc.next()- "-" split
		os.write(id.getBytes());  //  sc.next(); //공백 이전
		os.write(pw.getBytes());  //  sc.next();		
		
		System.out.println("=== 서버로 " + id + "," + pw + " 전송했습니다.===");
		
		//서버로부터 처리결과 입력
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String server_reply = sc.nextLine();
		System.out.println("===" + server_reply + "===");
		
		is.close();
		os.close();
		s.close();
		System.out.println("===로컬 컴퓨터 9999  포트 접속 해제합니다.===");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
