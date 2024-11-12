package kr.co.bit48;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //컬렉션 : 가변 개수의 객체들의 저장소
        List<Integer> li = new ArrayList<>();

        li.add(5);
        li.add(4);
        li.add(-1);

        li.add(2, 100);

        System.out.println("객체 수 : " + li.size());
        System.out.println();
        int sum = 0;
        for(int i=0;i<li.size();i++){
            int n = li.get(i);  //int n = Integer
            System.out.println(n);
            sum+=n;
        }
        System.out.println();
        System.out.println(sum);

    }
}
