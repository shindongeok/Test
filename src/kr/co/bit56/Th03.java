package kr.co.bit56;

class Music extends Thread{
    String name;

    Music(String n){
        name=n;
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(name);
            try {
                sleep(1000);
            }catch (Exception e){}

        }
    }
}
class Movie implements Runnable{
    String name;

    Movie(String n){
        name=n;
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(name);

        }
    }
}
public class Th03 {
    public static void main(String[] args) {

        Music m = new Music("음악 재생");
        m.start();

        Movie m1 = new Movie("영화 재생");
        Thread t = new Thread(m1);
        t.start();

        try {
            m.join();
            t.join();
        }catch (Exception e){}
    }
}
