package kr.co.bit32;
interface Person{
    String work();
}
class Worker implements Person{
    @Override
    public String work(){
        return "일한다";
    }
}
class Student implements Person{
    @Override
    public String work(){
        return "공부한다.";
    }
}
public class Main {
    static void pr(Person p){
        System.out.println(p.work());

    }
    public static void main(String[] args){
        pr(new Worker());   //일한다.
        pr(new Student()); //공부한다.
    }
}
