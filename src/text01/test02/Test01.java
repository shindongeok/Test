package text01.test02;

class Person{

}
class Student extends Person {

}
class Entertainer extends Person {

}
class Singer extends Person {

}
public class Test01 {
    static void pr(Person p){

    }
    public static void main(String[] args){
        pr(new Student());
        pr(new Entertainer());
        pr(new Singer());

    }
}
