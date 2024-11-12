package kr.co.bit50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMa {
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();

        map.put("Water", "물");
        map.put("Apple", "사과");
        map.put("Java", "자바");

        Set<String> key = map.keySet(); //key값은 중복될 수 없다.
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String str = it.next();
            String v= map.get(str);
            System.out.println(str + ", " +v);
        }

    }
}
