package kr.co.bit53;
//스레드 객체생성
class Th implements Runnable{
    String name;

    Th(String name){
        this.name=name;
    }
    //p.605
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name);
            try {
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
    }
}
public class Main {
    public static void main(String[] args){

        Th t = new Th("스레드1");  //스레드 객체 생성
        Thread thread=new Thread(t);
        thread.start();  //public void run 실행됨.
        // 스레드 시작 -> run 실행 -> jvm에 의해 스케쥴링 되기 시작함
//        Runnable task=new th("스레드1");
//        Thread thread=new Thread(task);




    }
}
