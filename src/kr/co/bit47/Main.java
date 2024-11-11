package kr.co.bit47;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //
       /* HashMap<Integer, String> h = new HashMap<>();
        h.put(1, "억이");
        h.put(2, "길동");

        //key를 기준으로 출력
        System.out.println(h.get(1));
        System.out.println(h.get(2));*/

        HashMap<String,String> h= new HashMap<>();
        h.put("물", "water");
        h.put("커피", "coffee");
        h.put("티", "tea");

        Set<String> keys = h.keySet();  //물, 커피 ,티
        Iterator<String> it = keys.iterator();  //key을 반복해서 반복객체에 저장

        while (it.hasNext()){
            String a= it.next();    //key
            String b= h.get(a);     //key에 맞는 값
            System.out.println(a+","+b);
        }
    }

}
