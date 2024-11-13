package kr.co.bit57;

class Share{
    synchronized void pr(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));    //문자 하나씩 출력.
        }
        System.out.println();
    }
}

class Th extends Thread{
    Share s;
    String[] str;

    Th(Share s, String[] str){
        this.s=s;
        this.str=str;
    }

    @Override
    public void run(){
        for(int i=0; i<str.length; i++){
            s.pr(str[i]);
        }
    }

}
public class Th04 {
    public static void main(String[] args) {

        Share s = new Share();  //객체 생성
        String[] eng={"java", "study", "db", "spring", "cloud"};
        String[] kor={"자바", "공부", "디비", "스프링", "클라우드"};

        Th t1 = new Th(s, eng);
        Thread t2 = new Th(s,kor);

        t1.start();
        t2.start();
    }
}
