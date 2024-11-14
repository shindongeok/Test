package kr.co.bit18_stream;

class MovieThread extends Thread{
    String nn;

    @Override
    public  void run(){

        for(int i=0; i<3; i++){
            System.out.println("영화를 재생합니다.");
            try {
                Thread.sleep(5000);
            }catch (Exception e){}
        }
    }
}
class MusicThread implements Runnable{



    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(5000);
            }catch (Exception e){}
        }

    }
}
public class Stream09 {
    public static void main(String[] args) {
            Thread th1=new MovieThread();
            th1.start();

//            MusicThread m= new MusicThread();
            Thread th2=new Thread(new MusicThread());
            th2.start();
    }
}
