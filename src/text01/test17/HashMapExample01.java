package text01.test17;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Set;

public class HashMapExample01 {
    public static void main(String[] args){
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        //객체 저장
        map.put("길동", 20);
        map.put("용권", 50);
        map.put("길동", 30);
        map.put("억이", 40);
        //객체 수
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        //키로 값얻기
        String key = "길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);

        System.out.println();
        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet(); //키의 집합
        Iterator<String> it = keySet.iterator();

        while (it.hasNext()){
            String k = it.next();
            Integer v = map.get(k);
            System.out.println(k + ": " + v);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Map.Entry<String,Integer>> entSet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entIt = entSet.iterator();
        while (entIt.hasNext()){
            Map.Entry<String, Integer> entry = entIt.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+":"+v);
        }
        System.out.println();
        map.remove("길동");
        System.out.println("총 Entry 수 : " + map.size());
    }
}
