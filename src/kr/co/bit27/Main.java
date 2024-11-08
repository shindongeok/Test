package kr.co.bit27;
//toString!!
public class Main {
    public static void main(String[] args){

        //StringBuffer
        //문자의 개수에 따라 버퍼 크기를 자동으로 저절할 수 있다.
        //문자열이 길거나 무자열 작업이 많은 겨우
        StringBuffer sb= new StringBuffer("Java");

        sb.append("is very good");
        //맨 끝에 추가
        sb.insert(0,"A ");
        sb.replace(2,6,"Html ");
        System.out.println(sb);

    }
}
