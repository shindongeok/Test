package test.p675;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(Person o){
        if(age<o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;
    }
}
public class Main {
    public static void main(String[] args){
        //TreeSet컬렉션 생성
        TreeSet<Person> treeSet = new TreeSet<Person>();

        //객체 저장
        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        //객체 하나씩 가져오기
        for(Person person : treeSet){
            System.out.println(person.name + ":"+person.age);
        }
    }
}
