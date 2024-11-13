package text01.j111304;

class Total{
    int sum;
    Total(){
        sum=0;
    }
    void total(int n){
        sum+=n;
    }
    int get(){
        return sum;
    }
}

class AThread extends Thread{
    Total t;
    int a;
    int b;

    AThread(Total t, int a, int b){
        this.t=t;
        this.a=a;
        this.b=b;
    }
    @Override
    public synchronized void run(){
        for(int i=a; i<=b; i++){
            t.total(i);
        }
        System.out.println(t.get());
    }


}
public class Main {
    public static void main(String[] args) {
        Total t =new Total();
        AThread a =new AThread(t,1,50);   //1275
        AThread b =new AThread(t,51,100);
        a.start();
        b.start();

        try {
            a.join();   //main스레드가 기다리도록 한다.
            b.join();
        }catch (Exception e){
        }
    }
}
