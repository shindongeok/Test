package text01.test20;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // Map만들어 이름, 나이저장해서 이름과 일치하는 나이출력해라.
        Map<String, Integer> map = new HashMap<>();

        map.put("신", 11);
        map.put("동", 12);
        map.put("억", 13);

        Set<String> key = map.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String a = it.next();
            Integer b = map.get(a);
            System.out.println(a+":"+b);
        }
    }
}
