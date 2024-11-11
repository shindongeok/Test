package kr.co.bit41;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ArrayList<String>  a= new ArrayList<>(3);
        Scanner s = new Scanner(System.in);

    for(int i=0; i<3; i++){
        a.add(s.next());    //입력한 문자열을 리스트에 삽입함
    }
    for(int i=0; i<a.size();i++){
        System.out.println(a.get(i));   //입력한 순서대로 출력
    }
    int max=0;

    // piano computer java
        for(int i=1; i<a.size(); i++){
            if(a.get(max).length() < a.get(i).length()){
                max=i;
            }
        }
        System.out.println("길이 제일 긴 문자열" + a.get(max));
    }
}
