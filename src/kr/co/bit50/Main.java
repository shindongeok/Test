package kr.co.bit50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Vector<Integer> v =new Vector<>();
        v.add(2);
        v.add(4);
        v.add(5);
        v.add(100);

        Iterator<Integer> it = v.iterator();    //iterator
        while (it.hasNext()){
            Integer n = it.next();  // 하나의 값씩 가져와서 n에 넣어준다.
            System.out.println(n);
        }
        int sum=0;
        it=v.iterator();
        while (it.hasNext()){
            Integer n  = it.next();
            sum+=n;
        }
        System.out.println(sum);

    }
}
