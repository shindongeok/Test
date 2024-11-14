package kr.co.bit18_stream;

import java.io.*;

class Stu implements Serializable {
    private String name;
    private String id;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

public class Stream11 {
    public static void main(String[] args) throws IOException {

//        ObjectOutputStream out = null;
//
//        try {
//           out= new ObjectOutputStream((new FileOutputStream("dob.dat")));
//
//           Stu s=new Stu();
//           s.setName("길동");
//           s.setId("123");
//           s.setAge(12);
//
//           //필드 3개를 직렬화
//           out.writeObject(s);
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//        out.close();

        ObjectInputStream in =new ObjectInputStream((new FileInputStream("dob.dat")));
        try {
            Stu s= (Stu)in.readObject();
            System.out.println(s.getName());
            System.out.println(s.getId());
            System.out.println(s.getAge());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
