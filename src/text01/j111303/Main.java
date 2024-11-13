package text01.j111303;

class Timer extends Thread{
//    String name;

//    Timer(String n){
//        name=n;
//    }
    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(i);
            try {
                sleep(1000);
            }catch (Exception e){}
        }

    }
}
public class Main {
    public static void main(String[] args) {

            Timer t = new Timer();
            t.start();
    }
}
