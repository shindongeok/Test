package test.c19_07;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        ServerSocket ser = null;

        try {
            ser = new ServerSocket(9999);
            System.out.println("서버 기다림..");
        }catch (Exception e){
            e.printStackTrace();
            return;
        }
        while (true){
            Socket socket = null;
            try {
                if(ser!=null){
                    socket=ser.accept();
                    System.out.println("클라이언트 연결 성공");
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }

}
