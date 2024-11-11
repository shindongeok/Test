package kr.co.idpw;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        HashMap h = new HashMap();
        h.put("hyejin", "123");
        h.put("shindong", "1234");
        h.put("seungmin", "1235");

        Scanner s= new Scanner(System.in);

        while (true){
            System.out.println("id, pw 입력 : ");
            String id = s.next();
            String pw = s.next();

            if(!h.containsKey(id)){ //id가 HashMap에 없는 경우.
                System.out.println("존재하지 않는 id입니다.");
                continue;   //id다시 입력함
            }
            else {  //id가 HashMap에 있을 경우
               if(!h.get(id).equals(pw)){   //비번이 틀릴경우
                   System.out.println("비번이 일치하지 않습니다.");
               }
               else {   //아이디 비번 둘다 맞을 경우
                   System.out.println("로그인");
                   break;
               }
            }


        }
    }
}
