package kr.co.bit40;

import java.util.ArrayList;

class Profile{
    String id;
    int age;

    Profile(String id, int age){
        this.id=id;
        this.age=age;
    }
}

public class Main {
    public static void main(String[] args){

        ArrayList<Profile> a = new ArrayList<>();
        a.add(new Profile("A",1));  //[0]
        a.add(new Profile("B",2));  //[1]
        a.add(new Profile("C",3));  //[2]

        for(int i=0; i<a.size(); i++){
            Profile p = a.get(i);
            System.out.println(p.id + "," + p.age);
        }

    }
}
