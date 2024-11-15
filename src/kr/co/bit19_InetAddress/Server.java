package kr.co.bit19_InetAddress;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ServerSocket ss = null;

        try {
            ss = new ServerSocket(9998);
            System.out.println("서버 기다림...");
        } catch (Exception e) {
            e.printStackTrace();
            return; //서버 소켓 생성 실패시 종료.
        }
        while (true){
            Socket socket =null;
            try {
                if(ss!=null){
                    socket=ss.accept(); //연결수락
                    System.out.println("클라이언트와 연결 성공");

                    //클라이언트가 전송한 메세지 받기
                    InputStream in=socket.getInputStream();
                    DataInputStream dis = new DataInputStream(in);

                    String msg = dis.readUTF();
                    System.out.println(msg);

                    //클라이언트한테 메세지 전송

                    OutputStream out = socket.getOutputStream();
                    DataOutputStream dos = new DataOutputStream(out);
                    dos.writeUTF( "[echoo]" +msg);

                    dos.close();
                    dis.close();
                    System.out.println("소켓 닫기");


                }
            }catch (IOException e){
                throw  new RuntimeException(e);
            }finally {
                {
                    if(socket!=null && !socket.isClosed()){
                        try {
                            socket.close();
                        }catch (IOException e){
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        }

    }
}
