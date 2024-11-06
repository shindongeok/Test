package kr.co.bit06;

class Num{
    int n;

    Num(int n){
        this.n=n;
    }
    int get(){
        return n;
    }
}
public class Main {
    public static void main(String[] args){

        Num[] ary = new Num[] {new Num(1),
                                new Num(2),
                                new Num(3)};
        //int ary[] = new int[]{1,2,3};
        //int ary[]={3,2,3};

        for(Num n:ary){
            System.out.println(n.get());
        }
    }
}
