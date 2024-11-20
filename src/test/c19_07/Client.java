package test.c19_07;

import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket = new Socket("127.0.0.1", 9999);
            System.out.println("연결성공!");
            Scanner s = new Scanner(System.in);
        }catch (Exception e){
            throw new RuntimeException();
        }

//        System.out.println("[상품 목록]");
//        System.out.println("-------------------------------------------------------------");
//        System.out.println("no         name                         pric        stock    ");
//        System.out.println("-------------------------------------------------------------");
//        System.out.println("-------------------------------------------------------------");
//        System.out.println("메뉴 1.Create : 2.Update : 3.Delete : 4.Exit");
//        System.out.print("선택 : ");
//        while (true){
//            int a = s.nextInt();
//            if(a == 1){
//
//            }
//        }

    }
}
