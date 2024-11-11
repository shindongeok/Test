package text01.test16;

class Member{
    String name;
    int age;
    Member(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }

}
public class HashSetExample02 {
    public static void main(String[] args){

    }
}
