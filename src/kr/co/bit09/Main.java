package kr.co.bit09;
class Add implements  RemoteControl{
    @Override
    public int add(int a,int b){
        return a+b;
    }
    @Override
    public int add(int a){
        int sum=0;
        for(int i=0; i<=a; i++){
            sum += 1;
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args){

        Add a=new Add();
        System.out.println(a.add(1,4));
        System.out.println(a.add(10)); //1~10까지합
    }
}
