package test.p482_484;

class  InsufficientException extends Exception{
    public InsufficientException() {
    }
    public InsufficientException(String message){
        super(message);
    }
}
class Account {
    private long balance;

    public Account(){}

    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }
    public void withdraw(int money) throws InsufficientException{   //호출한 곳으로 예외 떠넘김
        if(balance < money){
            throw  new InsufficientException(("잔고 부족 : " + (money-balance)) + " 모자람");
        }
        balance -= money;
    }
}
public class Main {
    public static void main(String[] args){
        Account account = new Account();
        //예금하기
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        //출금하기
        try{
            account.withdraw(30000);
        }catch (InsufficientException e){
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
