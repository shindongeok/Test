package test.t05;

import java.util.HashSet;

class Student{
    private String studentNum;

    public  Student(String studentNum){
        this.studentNum = studentNum;
    }

    public String getStudentNum(){
        return studentNum;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student t) {
            if (studentNum.equals(t.getStudentNum())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode(){
        return studentNum.hashCode();
    }

}
public class Main {
    public static void main(String[] args){
        HashSet<Student> hashSet = new HashSet<Student>();

        hashSet.add(new Student("1"));
        hashSet.add(new Student("1"));
        hashSet.add(new Student("2"));

        System.out.println("저장된 student 수 : " + hashSet.size());
    }
}
