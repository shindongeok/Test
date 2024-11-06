package kr.co.bit15;


interface Po{

    void pr(int x, String y);
    void pr(String y);
}

class Point implements Po{

    @Override
    public void pr(int x, String y){
        System.out.println(y+"책은" + x +"원입니다.");
    }
    @Override
    public void pr(String y){
        System.out.println(y);
    }

}
public class Main {
    public static void main(String[] args){
        Po p=new Point();

        p.pr(30000,"java");
        p.pr("python");
    }
}
