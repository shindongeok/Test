package kr.co.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Server {
    HashMap clientMap;

    Server(){
        //연결된 클라이언트 정보 저장하기 위해
        clientMap=new HashMap<>();
        //key: 이름, value: 메세지
        //동기화된 맵으로 초기화 - 멀티 스레드 환경에서도 안전하게 접근가능
        //p.867
        Collections.synchronizedMap(clientMap);
    }

    public void start(){
        //클라이언트 연결을 기다리는 상태
        ServerSocket serverSocket = null;
        Socket socket=null;

        try {
            //9999포트에서 클라이언트 연결 기다림
            serverSocket =new ServerSocket(9999);
            System.out.println("server start!!");

            while (true){
                //클라이언트 요청을 수락해서
                socket=serverSocket.accept();
                System.out.println(socket.getInetAddress() +" : "+
                        socket.getPort()+" connected");

                ServerReceiver serverReceiver = new ServerReceiver(socket);
                serverReceiver.start();
                //각각의 클라이언트 통신 독립적으로 처리하기 위해 스레드 생성
            }
        }catch (Exception e ){
            throw new RuntimeException();
        }
    }
    //모든 클라이언트에게 메세지를 전송하는 기능
    void sendAll(String msg){
        //각각 클라이언트 맵의 모든 값을 순차적으로 돌면서
        //각각의 클라이언트의 정보들을 가져온다(이름, 메세지)
        Iterator iterator = clientMap.keySet().iterator();  // key값만 반복하다.
        while (iterator.hasNext()){
            try {
            DataOutputStream outputStream =
                    //메세지갖고오기(키와 매핑되어지는 값 가져오기
                    (DataOutputStream) clientMap.get(iterator.next());
            outputStream.writeUTF(msg); // 메세지를 전송한다.

            }catch (Exception e){
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
        new Server().start();
    }

    public class ServerReceiver extends Thread{
        //클라이언트에게 데이터를 보내는 스트림
        DataOutputStream outputStream;
        //클라이언트로부터 데이터를 읽는 스트림
        DataInputStream inputStream;
        Socket socket;

        ServerReceiver(Socket socket){
            //각각의 클라이언트들을 독립적으로 처리하기 위해 만든 스레드
            this.socket=socket;
            try{
                inputStream = new DataInputStream(socket.getInputStream());
                outputStream = new DataOutputStream(socket.getOutputStream());
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        @Override
        public void run(){
            String name="";
            try{
                name=inputStream.readUTF(); //클라이언트가 보내온 이름 읽는다.
                if(clientMap.get(name)!=null){
                    outputStream.writeUTF("already exit name : "+name);
                    outputStream.writeUTF("please reconnect");
                    System.out.println(socket.getInetAddress()+" : " +
                            socket.getPort()+ " disconnect!!!");
                    inputStream.close();
                    outputStream.close();
                    socket.close();
                    socket=null;
                }
                else {  //동일한 이름이 아니라면(해시맵에 이름이 없다면)
                    //모든 클라이언트들한테 ~~ 들어왔어
                    sendAll(name + "come in");
                    // 해당 클라이언트를 맵에 추가
                    clientMap.put(name, outputStream);
                    while (inputStream!=null){
                        //클라이언트가 보낸 메세지를 읽어와서 다른 모든 클라이언트들
                        //한테 전송(브로드캐스트)
                        sendAll(inputStream.readUTF());
                    }
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            finally {
                if(socket!=null){   //예외 발생시 or 연결종료되면
                    sendAll(name+" exit!"); //모든 클라이언트한테
                    clientMap.remove(name); //해당 클라이언트 삭제
                    System.out.println(socket.getInetAddress()+ " : " +
                            socket.getPort()+ " disconnect!!!!");
                }
            }
        }

    }
}
