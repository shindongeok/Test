package test.c1510;

import java.util.TreeSet;

class Student implements Comparable<Student>{
    String id;
    int score;

    Student(String id, int score){
        this.id=id;
        this.score=score;
    }
    @Override
    public int compareTo(Student o){
        if (score<o.score) return -1;
        else if(score == o.score) return 0;
        else  return 1;
    }

}
public class Main {
    public static void main(String[] args){
        TreeSet<Student> treeSet = new TreeSet<Student>();
        treeSet.add(new Student("blue", 96));
        treeSet.add(new Student("hong", 86));
        treeSet.add(new Student("white", 92));

        Student student = treeSet.last();
        System.out.println("최고점수 : " + student.score);
        System.out.println("최고 점수를 받은 아이디: " + student.id);
    }
}
