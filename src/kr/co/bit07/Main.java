package kr.co.bit07;



import java.util.Scanner;

class PhoneNum{
    String name;
    String phone;

    PhoneNum(String name, String phone){
        this.name=name;
        this.phone=phone;
    }
    void show(){
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phone);
    }
}

class School extends PhoneNum{
    String major;

    School(String name, String phone, String major){
        super(name,phone);
        this.major=major;
    }
    @Override
    void show(){
        super.show();   //System.out.println("이름 : " + name);
                        //System.out.println("번호 : " + phone);
        System.out.println("전공 : " + major);
    }
}
class Worker extends PhoneNum{
    String grade;

    Worker(String name, String phone, String grade){
        super(name,phone);
        this.grade=grade;
    }
    @Override
    void show(){
        super.show();

        System.out.println("직급 : " + grade);
    }
}
class Arr{
    PhoneNum[] ary; //객체 배열
    int n;

    Arr(int n){ //초기화 작업
        ary=new PhoneNum[n];    //PhoneNum[] ary = new PhoneNum[5]
        n=0;
    }
    void add(PhoneNum p){
        ary[n++] = p;   //친구 추가
    }
    void friend(char ch){
        Scanner s = new Scanner(System.in);

        System.out.println("이름 : ");    // 홍길동
        String name = s.next();
        System.out.println("번호 : ");    //010-1111-2222
        String num = s.next();

        switch (ch){
            case 'A':
                System.out.println("전공");
                String major = s.next();
                add(new School(name,num,major));
                break;
            case 'B':
                System.out.println("직급");
                String grade = s.next();
                add(new Worker(name,num,grade));
                break;
        }
    }
    void all(){
        for(int i=0; i<n; i++){
            ary[i].show();

        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Arr ar = new Arr(5);
        //객체 생성

        while (true){// 무한 루프 = true
            System.out.println("A. 학교 친구");
            System.out.println("B. 직장 동료");
            System.out.println("C. 종료");
            System.out.println("D. 출력");

            System.out.println("문자 입력");
            char c = s.next().charAt(0);

            switch (c){
                case 'A':   //문자 A를 입력했으면
                    ar.friend(c);
                    break;
                case 'B':   //문자 B를 입력했으면
                    ar.friend(c);
                    break;
                case 'C':   //문자 C를 입력했으면
                    System.out.println("종료");
                    return;
                case 'D':   //문자 D를 입력했으면
                    ar.all();
            }
        }
    }
}
