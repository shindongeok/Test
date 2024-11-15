package kr.co.bit19_InetAddress;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try{
            Socket socket = new Socket("127.0.0.1", 9998); //--> accept()
            System.out.println("연결 성공");

            //클라이언트가 서버에게 메세지 보냄
            Scanner s = new Scanner(System.in);
            String msg = s.nextLine();  //안녕 연결해줬네?

            OutputStream out = socket.getOutputStream();
            DataOutputStream dos =new DataOutputStream(out);    //스트림은 바이트 단위.. 그래서 깨짐
            dos.writeUTF(msg);

            //서버가 전송한 데이터 받기
            InputStream in=socket.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            System.out.println("Receive" + dis.readUTF());

            dis.close();
            dos.close();
            socket.close();

        }catch (Exception e){}
    }
}
