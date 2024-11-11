package text01.test15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args){
        //ArrayList컬렉션 객체 생성
        List<String> list = new ArrayList<>();

        //LinkedList컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        long startTime; //시작 시간
        long endTime;   //끝 시간

        //ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            list.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간: ", (endTime-startTime));

        //LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간: ", (endTime-startTime));
    }
}
