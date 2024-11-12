package test.c1509;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("blue",96);
        map.put("hong",86);
        map.put("white",92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        Set<String> key = map.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String k = it.next();
            Integer v = map.get(k); //값
//            System.out.println(v);
            totalScore += v;
        }

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();

      for(Map.Entry<String,Integer>  a  :entrySet){
          int n=a.getValue();
          if(n >maxScore){
              maxScore = n;
              name = a.getKey();
          }
      }
        System.out.println("평균 점수: " +totalScore/ key.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디 : "+name);
    }
}
