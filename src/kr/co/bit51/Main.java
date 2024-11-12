package kr.co.bit51;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        TreeSet<Integer> grade=new TreeSet<>();
        grade.add(30);
        grade.add(100);
        grade.add(50);


        Integer i;
        i=grade.first();    //제일 낮은
        System.out.println(i);

        i=grade.last();     //제일 높은
        System.out.println(i);

        i=grade.lower(80);  //주어진 객체 바로 아래
        System.out.println(i);

        i=grade.higher(80); //주어진 객체 바로 위
        System.out.println(i);
    }
}
