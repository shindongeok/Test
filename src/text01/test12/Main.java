package text01.test12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Map<Integer, Double> m = new HashMap<>();

        m.put(12,96.0);
        m.put(13,76.0);
        m.put(11,80.0);

        Set<Map.Entry<Integer,Double>> s = m.entrySet();

        for(Map.Entry<Integer,Double> m1: s){
            System.out.println(m1.getKey());
            System.out.println(m1.getValue());
        }
    }
}
