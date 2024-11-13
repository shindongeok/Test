package text01.j111302;

class Th implements Runnable{
    String name;

    Th(String n){
        name=n;
    }
    @Override
    public void run(){
        System.out.println(name);
    }
}
public class Main {
    public static void main(String[] args) {
        Th t=new Th("쓰레드 1");
        Thread th=new Thread(t);
        th.start();
    }
}
