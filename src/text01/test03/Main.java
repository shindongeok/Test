package text01.test03;

class Circle{
    int a;

    Circle(int a){
        this.a=a;
    }

    @Override
    public boolean equals(Object obj){
        Circle b = (Circle) obj;
        if(a == b.a){
            return true;
        }
            return false;

    }

}
public class Main {
    public static void main(String[] args){
        Circle a=new Circle(30);
        Circle b=new Circle(30);

        System.out.println("반지름"+a);
        System.out.println("반지름"+b);

        if(a.equals(b)) {
            System.out.println("같은 원");
        }
        else {
            System.out.println("다른 원");
        }
    }
}
