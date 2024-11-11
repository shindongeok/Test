package kr.co.bit46;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<10; i++){
            a.add((int)(Math.random()*101));
        }
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }

    }
}
