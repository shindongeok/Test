package kr.co.bit54;

class Th extends Thread{
    String name;

    Th(String n){
        name=n;
    }
    @Override
    public void run(){
        // 스레드를 실행할 코드
        for(int i=0; i<10; i++){
            System.out.println(name);
            try {
                sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
public class Main {
    public static void main(String[] args) {

        Th t = new Th("스레드1");
        Th t2 = new Th("스레드2");

        t.start();  //스레드가 작동 시작(JVM에 의해 스케쥴되기 시작함)
        t2.start();
    }
}
