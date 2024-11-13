package kr.co.bit64;


import java.util.Random;
class Account{
    int money = 3000;

    synchronized void deposit(int n){
        money+=n;
        System.out.println( money);
    }
    synchronized void withdraw(int n) {
        if (money >= n) {
            money -= n;
            System.out.println(money);
        } else {
            System.out.println("잔고 부족");
        }
    }
        public int show(){
            return money;
        }
}

class Bank implements Runnable {
    Account account;
    Random r = new Random();

    Bank(Account account){
        this.account= account;
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            int n=r.nextInt(1000)+1;
            System.out.println("난수발생" + n);
            if (r.nextBoolean()){   //true, false를 무작위로 반환함
                account.deposit(n);
            }
            else {
                account.withdraw(n);
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}


public class AggregateExamlpe {
    public static void main(String[] args) {

        Account account = new Account();    //공유 계좌

        //3개의 스레드
        Thread t1 = new Thread(new Bank(account), "홍길동");
        Thread t2 = new Thread(new Bank(account), "신동억");
        Thread t3 = new Thread(new Bank(account), "박길동");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){}
        System.out.println(account.show());
    }
}
