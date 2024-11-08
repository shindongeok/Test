package kr.co.bit34;

public class Main {
    public static void main(String[] args){

/*        String str="";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<=100; i++){
            sb.append(i);
        }
        str=sb.toString(); //객체sb를 문자열로 변환
        System.out.println(str);*/

        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1.equals(obj2));
        System.out.println(obj3.equals(obj4));
        // Integer 범위 차이이다.
        //127 ~ -128까지
    }
}
