package text01.test11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> h = new HashMap<>();

        h.put("computer", "컴퓨터");
        h.put("coffee", "커피");
        h.put("cream", "크림");

        //key들의 집합 생성
        Set<String> key = h.keySet();
        //Iterator객체 생성
        Iterator<String> it = key.iterator();   //computer , coffee, cream

        while (it.hasNext()){
            String k = it.next();   //computer
            String v = h.get(k);
            System.out.println(k+ " "+v);
        }
        Scanner s= new Scanner(System.in);

        for(int i=0; i<3; i++){
            System.out.println("찾을 단어? : ");
            String str = s.next();  //ket
            String str2 = h.get(str);   //값 나옴

            if(str2 ==null){
                System.out.println(str + "은 없는 단어");
            }
            else {
                System.out.println(str2);
            }
        }


    }
}
