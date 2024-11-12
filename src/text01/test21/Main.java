package text01.test21;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args){
        //1. ArrayList에“one”,”two”,”three”를저장한다.
        //저장후 Iterator로반복한후(while) “three”라는단어가보이면(comepareTo함수사용) 삭제해라.

/*
        ArrayList<String> str = new ArrayList<>();

        str.add("one");
        str.add("two");
        str.add("three");

        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            String n = it.next();
            if (n.compareTo("three") == 0){
               it.remove();
            }
        }
        System.out.println(str);*/

        //2. HashMap에 (1,”one”),(2,”two”),(3,”three”)를저장하여키, 값을다출력한다.
        //출력후, 1을입력하면 one, 2를입력하면 two, 3을입력하면 three가출력될수있게끔코드를작성해라.
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        Set<Integer> key = map.keySet(); //키값 집합
        Iterator<Integer> it = key.iterator();

        while (it.hasNext()){
            int n = it.next();
            String k = map.get(n);
            System.out.println(n + "," + k);


        }
        Scanner s = new Scanner(System.in);
        System.out.println("키 입력 : ");
        int a = s.nextInt();
        if(map.containsKey(a)){
            String k = map.get(a);
            System.out.println("매핑된 값 : "+k);
        }else {
            System.out.println("매핑된 값이 없음");
        }

      /*  for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/



    }
}
