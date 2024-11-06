package kr.co.bit18;

interface Cal{
    int total(int a, int b);
    int big(int a, int b);
}

class Calcu implements Cal{
    @Override
    public int total(int a, int b){
        return a+b;
    }
    @Override
    public int big(int a, int b){
        return (a > b ? a : b);
    }

}

public class Main {
    public static void main(String[] args){
        Cal c = new Calcu();
        System.out.println(c.total(1,3));
        System.out.println(c.big(2,6));
    }
}
