package kr.co.bit65;


class Share{
    int sum=0;

    public void add(){
        int n=sum;
        Thread.yield(); //현재 스레드에게 양보하겠다.
        n+=10;
        sum=n;
        System.out.println(Thread.currentThread().getName() +", " +sum);
    }
}
class Student extends Thread{
    Share share;
    Student(String name,Share share){
        super(name);
        this.share=share;
    }

    @Override
    public synchronized void run(){ //공유메소드
        for(int i=0; i<5; i++){
           share.add();
        }

    }
}
public class Thread_test {
    public static void main(String[] args) {
        Share s =new Share();
        Thread t1 = new Student("a",s);
        Thread t2 = new Student("b",s);
        t1.start();
        t2.start();
    }
}
