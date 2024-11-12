package text01.test26;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){

        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name=null;
        int maxScore = 0;
        int totalScore = 0;


        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> keyV = iterator.next();
            int i = keyV.getValue();
            totalScore +=i;
            if(i > maxScore){
                maxScore =i;
                name = keyV.getKey();
            }
        }

        /*for (Map.Entry<String,Integer> a : entrySet){

            int e = a.getValue();
            if(e > maxScore){
                maxScore = e;
                name = a.getKey();
            }
        }*/
        System.out.println(name);
        System.out.println(maxScore);
        System.out.println(totalScore/ map.entrySet().size());
    }
}
