package text01.test05;

class Number{
    static void pr(int x){
        System.out.println(x);
    }
     void show(double y){
        System.out.println(y);
    }
}

public class Main {
    public static void main(String[] args){
        Number n=new Number();
        Number.pr(100);
        n.show(3.14);

    }
}
