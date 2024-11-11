package kr.co.bit39;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //List interface => <>
        ArrayList<String> a = new ArrayList<>();
        a.add(new String("aa"));
        a.add("bb");
        a.add("cc");
        a.add("cs");
        for(int i=0; i<a.size(); i++){
            System.out.println(a.get(i));
        }

    }
}
