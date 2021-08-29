package net;

import java.io.FileWriter;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogServer {
	
public static void main(String[] args) throws Exception {
		
		//1. 15000 포트 서버소켓 생성
	ServerSocket ss = new ServerSocket(15000);
	while(true) {
		//2. 클라이언트 접속 허용하면
		Socket s = ss.accept();
		//3. 클라이언트 ip, 시간, id, pw 값  , 현재 서버클래스이름 
		String client = s.getInetAddress().getHostAddress();
		SimpleDateFormat sdf = 
		new SimpleDateFormat("yyyy년도 MM월 dd일 HH시mm분ss초");
		String time = sdf.format( System.currentTimeMillis());
		
		InputStream i = s.getInputStream();
		Scanner scan = new Scanner(i);

		//"id:oracle-pw:4321\n";
		String idpw = scan.nextLine();
		String id = idpw.split(":|-|\n")[1];
		String pw = idpw.split(":|-|\n")[3];
		
		String classname = "LogServer";
		
		//log.txt 파일 저장-FileWriter
		FileWriter fw = new FileWriter("src/net/log.txt", true);
		fw.write(client + " " + time + " " + id + " "
		+ pw + " " + classname + "\n");
		fw.close();
		//<chap15/src/net/log.txt>

		//192.168.0.1 xxxx년도 xx월 xx일 13시13분13초 java 1234 LogServer
		//192.168.0.2 xxxx년도 xx월 xx일 13시13분20초 oracle 4321 LogServer
		//...
			
		}//while end
	}//main end
}//class end
