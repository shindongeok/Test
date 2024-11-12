package kr.co.bitGame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person{
    private String name;
    private int id;

    Person(String n, int i){
        name=n;
        id=i;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object obj){
        Person p = (Person) obj;
        if(p.getId()==this.id && p.getName().equals(this.name)){
            return true;
        }
        else {
            return false;
        }
    }
}
class Game{

    ArrayList<Person>  a= new ArrayList<>(5);

    Scanner s=new Scanner(System.in);

    Game(){ //초기화
        a.add(new Person("도현", 123));   //[0]
        a.add(new Person("하형", 456));   //[1]
        a.add(new Person("왕휘", 789));   //[2]
        a.add(new Person("다훈", 112));   //[3]
    }
    void in(){
        while (true){
            System.out.println("이름 , id입력");
            String name = s.next();

            if(name.equals("stop")){
                break;
            }
            int id=s.nextInt();
            Person pp = new Person(name,id);    // Person클래스 객체 생성

            if(a.contains(pp)){ //리스트에 있는 객체인지 아닌지 여부 확인
                System.out.println(pp.getName() + "은 이미 리스트에 있다.");
            }
            else {
                a.add(pp);  // 없는 객체라면 추가
            }
        }
    }
    void out(){
        while (true){
            Random r = new Random();
            int n=r.nextInt(a.size());
            // 0~4사이의 난수 발생시켜서 n에 저장
            Person p=a.get(n);   //인덱스 ArrayList에서 get()는 인덱스 값
            String str = p.getName();

            System.out.println("인덱스" +n);
            System.out.println(str+"의 id는?");   //str의 id는?
            int id= p.getId();  //789

            Scanner s = new Scanner(System.in);

            int id2=s.nextInt();

            if(id2==-1){
                break;
            }
            if (id2 == id) {
                System.out.println("정답");
            }
        }
    }
    void end(){
        System.out.println("종료");
        System.exit(0); //현재 실행하고있는 프로세스 강제 종료
    }
}
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Game g=new Game();
        while (true){
            System.out.println("1,2,3");
            int select = s.nextInt();

            switch (select){
                case 1:
                    g.in();
                    break;
                case 2:
                    g.out();
                    break;
                case 3:
                    g.end();
                    break;
            }
        }
    }
}
