package text01.test19;

class Gen<T>{
    T t1;
    T t2;

    Gen(T t1, T t2 ){
        this.t1=t1;
        this.t2=t2;
    }

    T one(){
        return t1;
    }

    T two(){
        return t2;
    }


    boolean three(){
        if(t1.equals(t2)){
            return true;
        }
        else {
            return false;
        }
    }
}
public class Main {
    public static void main(String[] args){
        //2. 다음 main()을 보고 Gen클래스를 만들어라.
        Gen<String> g=new Gen<String>("seoul","busan");

        System.out.println(g.one()); //seoul 출력
        System.out.println(g.two()); //busan 출력
        System.out.println(g.three()); //false 출력 (두 문자열 비교)
    }
}
