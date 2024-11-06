package kr.co.bit11;
class Pizza implements Food{
    @Override
    public  String name(){
        return "피자";
    }
}

class Steak implements Food{
    @Override
    public  String name(){
        return "스테이크";
    }
}

public class Main {
    static void pr(Food f){     //Food f=new Pizza();
        System.out.println(f.name());
    }
    public static void main(String[] args){

        pr(new Pizza()); //함수 호출
        pr(new Steak());
    }
}
