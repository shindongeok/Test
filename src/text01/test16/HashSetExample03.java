package text01.test16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample03 {
    public static void main(String[] args){
        //HashSet 컬렉션 생성
        Set<String> str1 =new HashSet<String>();

        str1.add("Java");
        str1.add("JDBC");
        str1.add("JSP");
        str1.add("Spring");

        //객체를 하나씩 가져와서 처리
        Iterator<String> it = str1.iterator();
        while (it.hasNext()){
            String sum = it.next();
            System.out.println(sum);
            if (sum.equals("JSP")){
                //가져온 객체를 컬렉션에서 제거
                it.remove();
            }
        }
        System.out.println();

        //객체 제거
        str1.remove("JDBC");
        str1.remove("Spring");

        //객체를 하나씩 가져와서 처리
        for(String sum : str1){
            System.out.println(sum);
        }

    }
}
