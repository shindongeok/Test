package kr.co.bit38;

class Food{
    void show(){
        System.out.println("음식");
    }
}
class Pizza extends Food{
    void show(){
        super.show();   //"음식"  출력
        System.out.println("피자");
    }
}
class Fo<T>{
    T t;
    void in(T t){
        this.t=t;

    }
    T out(){
        return t;
    }
}
public class Main {
    static void pr(Fo<? extends Food> f){
        Food fo = f.out();
        fo.show();
    }
    public static void main(String[] args){

        Fo<Food> f = new Fo<Food>();

        //Food f2 = new Food();
        //f2.in(f2);
        f.in(new Food());   //"음식" 출력
        pr(f);  //Fo<? extends Food> f = f

        Fo<Pizza> f2 = new Fo<Pizza>();
        f2.in(new Pizza());     //"피자" 출력
        pr(f2); //Fo<Pizza> f=f

    }
}
