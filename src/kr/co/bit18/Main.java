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
/*
lnterface를 상속받은 Calcu클래스를 작성해라.
Main()에서 a,b에 대해 적절한 값을 설정해라*/
        Cal c = new Calcu();
        System.out.println(c.total(1,3));   //a부터b까지의 합 리턴
        System.out.println(c.big(2,6));     //a,b중 큰 값 리턴
    }
}
