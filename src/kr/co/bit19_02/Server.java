package kr.co.bit19_02;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // 서버쪽
        ServerSocket ser = null;

        try {
            ser = new ServerSocket(); //서버소캣 생성
            ser.bind(new InetSocketAddress("localhost", 5001));
            //2. 서버소켓과 소켓이 연결될 ip주소와 포트번호
            while (true) {
                System.out.println("연결되기를 기다린다.");

                //3.연결요청을 수락하면서 소켓을 생성한다.
                Socket so = ser.accept();

                byte[]b=null;
                String msg=null;

                InputStream in = so.getInputStream();
                b=new byte[100];
                int r=in.read(b);
                //메시지 바이트 배열 읽는다.

                //바이트 배열을 문자열로 바꾼다
                msg =new String(b, 0,r,"UTF-8");
                System.out.println("데이터 받기 성공");

                //Hi Clint라고 보내기
                OutputStream os = so.getOutputStream();
                msg="Hi Client";
                b=msg.getBytes("UTF-8");

                os.write(b);
                System.out.println("데이터 보내기 성공");
                os.close();
                in.close();
                ser.close();


            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
