package kr.co.bit44;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(53);
        list.add(4);
        list.add(3);

        Iterator<Integer> it =list.iterator();
        while (it.hasNext()){
            int n = it.next();  //다음 데이터를 n에 대입
            System.out.println(n);
        }
    }
}
