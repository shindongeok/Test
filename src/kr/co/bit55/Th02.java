package kr.co.bit55;



class Th implements Runnable{
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
                Thread.sleep(1000); //Thread클래스에서 불러와야함.
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
public class Th02 {
    public static void main(String[] args) {
        Th t = new Th("스레드1");
        Th t2 = new Th("스레드2");

        Thread th= new Thread(t);
        Thread th2=new Thread(t2);
        th.start();  //스레드가 작동 시작(JVM에 의해 스케쥴되기 시작함)
        th2.start();
    }
}
