package kr.co.bit58;

class Th extends Thread{

    Th(int n){
        setPriority(n);
    }
    @Override
    public void run(){
        System.out.println(getPriority());
        //스레드 우선순위 알아냄
    }
}
public class Th05 {
    public static void main(String[] args) {

        Th t1 = new Th(Thread.MAX_PRIORITY);
        Th t2 = new Th(Thread.MIN_PRIORITY);
        Th t3 = new Th(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
