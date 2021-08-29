package server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버 1개 - 클라이언트 여러개
public class TCPServerTest {

	public static void main(String[] args) {
		try {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("===서버는 9999  포트로 시작합니다===");
		while(true) {
			Socket s = ss.accept();
			System.out.println("=== " + s.getInetAddress().getHostAddress() + " 클라이언트와 연결되었습니다===");
			
			// 서버가 클라이언트로부터 데이터를 입력 방법1
			/*byte[] id_byte_server = new byte[5];// 배열이 비어있다
			InputStream is = s.getInputStream();
			is.read(id_byte_server);// 클라이언트로부터 전달 배열 저장한다.  안녕하세요(10개)
			String id = new String(id_byte_server);
			System.out.println("===클라이언트가 전달한  아이디는 " + id + "  입니다.");*/
			
			// 서버가 클라이언트로부터 데이터를 입력 방법2
			InputStream is = s.getInputStream();
			//DataInputStream ds = new DataInputStream(is);
			//String id = ds.readLine();
			Scanner sc = new Scanner(is);
			String id = sc.nextLine();
			System.out.println("===클라이언트가 전달한  아이디는 " + id + "  입니다.");			
			
			//클라이언트로 응답 인사 전달 = 서버가 클라이언트로 출력
			OutputStream os = s.getOutputStream();
			String server_reply = " 잘 지냅니다.\n";
			byte[] server_reply_byte = server_reply.getBytes();
			os.write(server_reply_byte);
			System.out.println("===클라이언트 로 응답했습니다===");
			
			is.close();
			os.close();
			s.close();
			System.out.println("===클라이언트와 연결해제되었습니다===");
		}//while end
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
