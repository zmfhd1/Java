

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버 1개 - 클라이언트 여러개
public class LoginServer {

	public static void main(String[] args) {
		try {
		ServerSocket ss = new ServerSocket(8888);
		System.out.println("===서버는 8888  포트로 시작합니다===");
		while(true) {
			Socket s = ss.accept();
			System.out.println("=== " + s.getInetAddress().getHostAddress() + " 클라이언트와 연결되었습니다===");
			
			// 서버가 클라이언트로부터 데이터를 입력 방법2
			InputStream is = s.getInputStream();
			System.out.println(1);
			Scanner sc = new Scanner(is);
			System.out.println(1);
			String id = sc.next();
			System.out.println(1);
			String pw = sc.next();
			System.out.println(1);
			System.out.println("===클라이언트가 전달한  아이디, 암호는 " + id + "," + pw + "  입니다.");			
			
			//클라이언트로 응답 인사 전달 = 서버가 클라이언트로 출력
			OutputStream os = s.getOutputStream();
			String server_reply = " 잘 지냅니다.\n";
			byte[] server_reply_byte = server_reply.getBytes();
			os.write(server_reply_byte);
			System.out.println("===클라이언트 로 응답했습니다===");
			
			//is.close();
			//os.close();
			s.close();
			System.out.println("===클라이언트와 연결해제되었습니다===");
		}//while end
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
