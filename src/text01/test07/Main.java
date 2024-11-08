package text01.test07;

public class Main {
    public static void main(String[] args){

        System.out.println(Integer.parseInt("23"));
        //문자열 23을 정수로 변환

        System.out.println(Integer.toString(23));
        //정수 23을 문자열로 변환

        Integer i=Integer.valueOf(23);
        System.out.println(i.doubleValue()); //정수를 double로 변환

        Double d=Double.valueOf(3.14);
        System.out.println(d.toString());  //실수형 객체를 문자열로 변환

        boolean b=(5<3);
        System.out.println(Boolean.toString(b)); //false를 문자열 "false"로 변환
        System.out.println(Boolean.parseBoolean("false")); //false문자열을 기본자료형 boolean false로 변환

        Integer a=39;
        Integer a2=Integer.valueOf(32);

        int m=a;
        int n=a2.intValue();

    }
}
