package kr.co.bit52;

import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro>{
    String a;
    int b;

    Pro(String a, int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(a +","+b);
    }
    @Override
    public int compareTo(Pro o){    //객체 특정 필드 비교하는 메소드
        if(b > o.b) //현재 객체 b 랑 매개변수로 받은 o.b값을 비교
            return 1;
        else if (b <o.b)
            return -1;
        else
            return 0;

    }
}

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet<Pro> t = new TreeSet<Pro>();
        t.add(new Pro("cc", 100));
        t.add(new Pro("aa", 123));
        t.add(new Pro("bb", 144));

        Iterator<Pro> it = t.iterator();
        while (it.hasNext()){
            it.next().show();
        }
    }
}
