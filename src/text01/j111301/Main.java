package text01.j111301;
interface Cal{
    int total(int a, int b); //a부터 b까지의 합 리턴
    int big(int a, int b);//a,b중 큰 값 리턴
}

class Calcu implements Cal {
    @Override
    public int total(int a, int b) {
        int sum = 0;
        for (int i= a; i<=b; i++) {
           sum += i;
        }
        return sum;


    }
    @Override
    public int big(int a, int b){
       if(a>b){
           return a;
       }else {
           return b;
       }
    }
}
public class Main {
    public static void main(String[] args) {
        //1. Interface를 상속받은 Calcu클래스를 작성해라.
        // Main()에서 a,b에 대해 적절한 값을 설정해라.
        Calcu c = new Calcu();

        System.out.println(c.total(1,3));
        System.out.println(c.big(3,5));
    }
}
