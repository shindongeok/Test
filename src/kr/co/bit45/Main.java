package kr.co.bit45;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Num{
    int n;

    Num(int n){
        this.n=n;
    }
    @Override
    public String toString(){
        return n+"";
    }
    @Override
    public int hashCode(){
        return n;
    }

    @Override
    public boolean equals(Object obj){
        Num num = (Num) obj;
        if(num.n==n){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args){

        Set<Num> h = new HashSet<Num>();
        h.add(new Num(1));
        h.add(new Num(2));
        h.add(new Num(1));
        h.add(new Num(2));

        Iterator<Num> iterator =h.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
