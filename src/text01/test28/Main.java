package text01.test28;

import java.util.HashMap;
import java.util.Scanner;

class Person{
    String name;
    int id;


    Person(String name, int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString(){
        return name+","+id;
    }



}
public class Main {
    public static void main(String[] args) {
        //1. 이름과 id를입력받아 Person클래스작성하고입력한값다출력해라.(객체배열의개수는 3개)

        //1.2 1번에이어다음과같은실행결과가나오도록코드를추가해라. (Person객체배열사용해라.)

        Person[] person = new Person[3];    //객체를 저장할 객체배열 생성
        Scanner s = new Scanner(System.in);

        HashMap<String, Integer> h = new HashMap<>();
        for(int i=0; i< person.length; i++) {
            System.out.println("이름, id입력: ");
            String name = s.next();
            int id = s.nextInt();
            person[i] = new Person(name, id);
            System.out.println(person[i]);

            h.put(name,id);
        }
        while (true){
            System.out.println("이름뭐냐");
            String c = s.next();

            if(h.containsKey(c)){
                System.out.println(h.get(c));
            }
            else if(c.equals("stop")){
                break;
            }else {
                System.out.println("이름없다.");
            }
        }

    }
}
