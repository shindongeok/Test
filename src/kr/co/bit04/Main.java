package kr.co.bit04;

abstract class Ca{
    abstract int add(int a, int b);
    abstract double avg(int a[]);
}
class Cal extends Ca{
    @Override
    int add(int a, int b){
        return a + b;
    }

    @Override
    double avg(int a[]){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        return (double) sum/a.length;
    }
}
public class Main {
    public static void main(String[] args){

        Cal c =new Cal();
        System.out.println(c.add(3,7)); //두수합
        System.out.println(c.avg(new int[] {1,2,3}));   //1,2,3 평균
    }
}
