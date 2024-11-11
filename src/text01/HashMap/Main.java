package text01.HashMap;

import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap<Integer, String> h = new HashMap<>();
        Scanner s = new Scanner(System.in);


        for(int i=0; i<3; i++) {
            System.out.println("나이 : ");
            int b = s.nextInt();
            System.out.println("이름 : ");
            String a = s.next();
            h.put(b, a);

        }
        System.out.println(h);
        Set<Integer> b2 = h.keySet();   // 12,
        Iterator<Integer> it = b2.iterator();

        int max = 0;
        while (it.hasNext()){
            Integer b = it.next();
            if(max < b){
                max=b;
            }
        }
        String str = h.get(max);
        System.out.println("나이가장 많은 사람 " + str );
    }
}
