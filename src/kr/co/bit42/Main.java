package kr.co.bit42;

import java.util.Vector;

public class Main {
    public static void main(String[] args){
        Vector<Integer> v = new Vector<>();
        v.add(4);   //[1]
        v.add(4);   //[2]
        v.add(6);   //[3]
        v.add(0, 20);   //인텍스 0에 20을 넣겠다

        System.out.println("벡터의 개수 : " + v.size());

        for(int i=0; i<v.size(); i++){
            int j=v.get(i);
            System.out.println(j);
        }
    }
}
