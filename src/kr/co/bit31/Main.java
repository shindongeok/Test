package kr.co.bit31;

abstract class Profile{
    abstract void add(String name, String id);
    abstract String check(String id);
}

class Person{
    String name,id;

    Person(String n, String i){
        name =n;
        id=i;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
class per extends Profile{
    Person[] ary;  //객체 배열 선언
    int n;

    per(int n){//생성자
        ary=new Person[n];//배열 생성하고있음
    }

    void add(String name, String id){
        ary[n] =new Person(name, id);   //객체 생성 코드
        n++;
    }
    String check(String id){
        for(int i=0; i<n; i++){
            if(id.compareTo(ary[i].getId())==0){
                return ary[i].getName();
            }
        }
        return null;
    }

}

public class Main {
    public static void main(String[] args){

        Profile p= new per(5); //up
        p.add("길동1", "124");
        p.add("길동2", "125");
        p.add("길동3", "126");


        System.out.println(p.check("124"));
        System.out.println(p.check("125"));
        System.out.println(p.check("126"));
    }
}
