package kr.co.bit19_02;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        //클라이언트 쪽
        Socket s =null;
        try {
            s = new Socket();
            System.out.println("연결 요청한다.");
            //클라이언트가 서버에 연결요청할 때
            s.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("연결 성공!");

            byte[]b=null;
            String msg=null;

            OutputStream os = s.getOutputStream();
            msg = "hi Server";
            b=msg.getBytes("UTF-8");
            //문자열을 바이트로 변경해서 전송

            os.write(b);
            System.out.println("데이터보내기 성공");




            InputStream in = s.getInputStream();
//            DataInputStream dis = new DataInputStream(in);
//            System.out.println(dis.readUTF());
            b=new byte[100];
            int r=in.read(b);

            msg=new String(b,0,r,"UTF-8");
            System.out.println("데이터 받기 성공");

            in.close();
            os.close();
            s.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
