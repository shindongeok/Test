package text01.test16;

import java.util.HashSet;
import java.util.Set;

class Member{
    String name;
    int age;
    Member(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof  Member target){
            return target.name.equals(name) && (target.age == age);
        }
        else {
            return false;
        }
    }
}
public class HashSetExample02 {
    public static void main(String[] args){
        //HashSet 컬렉션 생성
        Set<Member> set = new HashSet<Member>();

        //Member  객체 저장
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        //저장된 객체수 출력.
        System.out.println("저장된 객체수는 : " + set.size());
    }
}
