package kr.co.bit23;

import java.util.Scanner;

class Rectangle{
    private int width;
    private int height;

    public void setWidth(int width){
        //필드값 초기화
        this.width=width;
    }
    public void setHeight(int height){
        this.height =height;
    }

    int show(){
        return width*height;
    }

}
public class Main {
    public static void main(String[] args){
        //다음을 보고 코드를 작성해라.
        //1- A. 클래스 Prob1: Rectangle
        //필드는 int 형 너비 (width)와 높이 (height)가 있고,
        // 모두private으로 선언하라.
        // 생성자는 구현하지 말고 메소드는 클래스에서 필요한 내용을 판단하여구현하라.
        //2- B. 클래스 Prob2: Rectangle 클래스를이용하는 응용프로그램
        //Main 메소드에서 키보드에서 사각형의 너비와 높이 값을 입력받는다.
        // 키보드 입력값이 int 가 아닌 경우 예외처리를 하고,
        // 유효한 값이 입력될 때까지계속 입력받게 한다.
        //키보드 입력값이 유효한 값인 경우
        // 해당 내용을 갖는 Rectangle 객체를 만들고 화면에생성한
        // Rectangle 객체의 면적을 출력하고 프로그램을 종료한다.
        Scanner s = new Scanner(System.in);

        int width = 0;
        int height = 0;


        while (true){
            try{
                System.out.println("너비값 : ");
                width = s.nextInt();
                System.out.println("높이값 : ");
                height = s.nextInt();
                break;
            }catch (Exception e){
                System.out.println("정수를 입력하세요.");
                s.next();
                continue;
            }
        }
        Rectangle rec = new Rectangle();
        //초기화
        rec.setWidth(width);
        rec.setHeight(height);
        System.out.println(rec.show());
    }
}
