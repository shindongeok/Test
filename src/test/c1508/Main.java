package test.c1508;

import java.util.HashSet;
import java.util.Set;

class Student{
    int studentNum;
    String name;

    Student(int studentNum, String name){
        this.studentNum=studentNum;
        this.name=name;
    }

    @Override
    public int hashCode(){
        return studentNum;
    }
    @Override
    public boolean equals(Object obj){
        Student s = (Student) obj;
        if(s.studentNum == studentNum){
            return true;
        }
        else {
            return false;
        }
    }

}
public class Main {
    public static void main(String[] args){
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1,"홍길동"));
        set.add(new Student(2,"신용권"));
        set.add(new Student(1,"조민우"));

        System.out.println("저장된 객체 수: " + set.size());
        for(Student s : set){
            System.out.println(s.studentNum + ":"+s.name);
        }
    }
}
