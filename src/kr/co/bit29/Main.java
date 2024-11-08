package kr.co.bit29;

public class Main {
    public static void main(String[] args){

//        Integer i= new Integer(10);
        Integer i2 = 10;    //boxing(박싱)
        int i1 = i2.intValue(); //unboxing


//        Character c= new Character('a');
        Character c2= 'a';        //boxing(박싱)
        char c1 = c2.charValue();//unboxing

//        Boolean b= new Boolean(true);
        Boolean b2= true;           //boxing(박싱)
        boolean b1= b2.booleanValue();//unboxing

        Integer i11 = 100;  //boxing
        int n1 = i11+200;   //unboxing
        System.out.println(n1);

        //문자열을 기본타입으로 변환!!
        //문자열123을 정수 123으로 언박싱
        int i3 = Integer.parseInt("1234");

        //문자열 true를 boolean true로 언박싱
        boolean b3=Boolean.parseBoolean("true");

        double d2 = Double.parseDouble("1234");
        //parse~~ 반환형이 기본자료형

        int i4 = Integer.valueOf(123);
        int i5=Integer.valueOf(10)+Integer.valueOf(20);

        //valueOf 는 반환형이 객체
        System.out.println(i5);

        String s=Integer.toString(123);
        //정수형 객체 123을 문자열로 변경
        System.out.println(s);
    }
}
