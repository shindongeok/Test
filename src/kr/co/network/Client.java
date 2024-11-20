package kr.co.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
// 스레드 이용 멀티 채팅 만들기
public class Client {
    public static void main(String[] args) {
        //두개의 스레드를 이용해서 동작시키기
        try {
            //서버에 소캣 연결 시도
            Socket socket = new Socket("127.0.0.1", 9999);
            Scanner s = new Scanner(System.in);
            System.out.println("name : " );
            String name = s.nextLine();

            //각각 스레드는 메세지를 동시에 송수신 할 수 있게 하기 위해
            //서버로 부터 메세지를 보냄(보내는용)
            Thread sender = new Thread(new ClientSender(socket,name));
            //서버로 부터 메세지 받음(수신용)
            Thread receiver = new Thread(new ClientReciver(socket));

            sender.start();
            receiver.start();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    //inner class
    //메세지를 서버로 보내는 클래스
    static class ClientSender extends Thread{
        Socket socket;
        String name;
        //서버로 데이터를 보내기 위한 출력 스트림
        DataOutputStream outputStream;


        ClientSender(Socket socket, String name){
            this.socket = socket;
            this.name=name;
            try{
                outputStream=new DataOutputStream(
                        socket.getOutputStream());
            }catch (IOException e){
                throw new RuntimeException();
            }
        }
        //데이터 보내는 작업
        @Override
        public void run(){  //스레드 실행(start)될 때 호출 된다.
            Scanner s = new Scanner(System.in);
            try {
                if(outputStream!=null) outputStream.writeUTF(name);
                while (outputStream!=null){
                    String msg=s.nextLine();
                    if(msg.equals("quit"))
                        break;
                    outputStream.writeUTF(("["+name+"]"+msg));
                }
                outputStream.close();
                socket.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }

        }
    }
    static class ClientReciver extends Thread{  //서버로부터 데이터를 수신하는 역할
        Socket socket;
        DataInputStream inputStream;    //서버로부터 데이터를 읽기 위한 입력스트림

        ClientReciver(Socket socket){
            this.socket = socket;
            try{
                inputStream= new DataInputStream(
                        socket.getInputStream());
            }catch (IOException e){
                throw new RuntimeException();
            }
        }
        @Override
        public void run(){
            while (inputStream!=null){
                try {
                    System.out.println(inputStream.readUTF());
                    //서버로부터 메세지를 계속 읽어서 콘솔에 출력
                }catch (Exception e){
                    e.printStackTrace();
                    break;
                }
            }
            try {
                inputStream.close();
                socket.close();
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }
    }
}
