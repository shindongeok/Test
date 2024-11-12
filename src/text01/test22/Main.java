package text01.test22;

import java.util.HashSet;
import java.util.Iterator;


class Num{
    int a;

    Num(int a){
        this.a=a;
    }

    @Override
    public String toString(){
        return a+" ";
    }

    @Override
    public int hashCode(){
        return a;
    }
    @Override
    public boolean equals(Object obj){
        Num num = (Num)obj;
        if(num.a == a){
            return true;
        }
        else
            return false;
    }
}
public class Main {
    public static void main(String[] args){

        HashSet<Num> h = new HashSet<Num>();

        h.add(new Num(30));
        h.add(new Num(40));
        h.add(new Num(50));
        h.add(new Num(50));

        Iterator<Num> it = h.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
