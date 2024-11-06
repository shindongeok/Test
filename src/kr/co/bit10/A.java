package kr.co.bit10;

public interface A {

    //상수필드( public static final 생략가능)
    public static final int NUMBER=10;
    //추상메소드( public abstract 생략가능)
    public abstract void call();
    public  default void pr(){
        System.out.println("aa");
    }
}
