package kr.co.bit30;

import java.util.Scanner;

class Profile{
    String name,id;

    Profile(String name, String id){
        this.name=name;
        this.id=id;
    }

    String getname(){
        return name;
    }

    String getid(){
        return id;
    }


}
//A. main() Prob1: main()에서인원수를입력받아인원수를
// Profile에대한 객체배열개수로설정한다.
// 이름과아이디도입력받아객체배열에저장한후출력해라.
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("인원수를 입력하세요 : ");
        int a = s.nextInt();

        Profile p[] = new Profile[a]; //Profile 에 대한 객체배열개수 설정

        String name ="";
        String id = "";

        for(int i=0; i< p.length; i++) {
            System.out.println("이름을 입력해주세요 : ");
            name = s.next();
            System.out.println("id를 입려해주세요 : ");
            id = s.next();

            p[i]= new Profile(name,id);
        }
        for(Profile pro : p){
            System.out.println(pro.getname() + "," + pro.getid());
        }






    }
}
