package kr.co.bit59;
// Cook 클래스 공유객체 역할
class Cook { // 요리쓰레드
    String food;
    boolean send = false;

    void set(String f) {
        food = f; // 초기화 코드
        send = true;
        // synchronized void pr()
        synchronized (this) {
            notifyAll(); // Cook객체를 기다리는 모든 스레드 깨움
        }
    }


    String get() {
        if (send == false) { // 음식 도착안했으면
            try {
                synchronized (this) {
                    wait(); //요리준비될때까지 대기상태로 들어감
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return food;
    }
}
class Chef extends Thread { // 요리사
    Cook c;

    Chef(Cook c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.set("음식");
    }
}

class Custumer extends Thread {
    Cook c;

    Custumer(Cook c) {
        this.c = c;
    }

    public void run() {
        System.out.println(c.get());
    }
}

public class Th06 {
    public static void main(String[] args) {
        Cook co = new Cook();
        Custumer c1 = new Custumer(co);
        Custumer c2 = new Custumer(co);
        Chef c3 = new Chef(co);

        try {
            c1.start();
            c2.start(); //손님 대기
            Thread.sleep(1000); //1초후
            c3.start(); //

            c1.join();
            c2.join();
            c3.join();
        } catch (Exception e) {

        }
    }
}
