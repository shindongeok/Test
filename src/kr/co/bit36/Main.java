package kr.co.bit36;

class St<T>{
    int n;
    Object[] st;    //객체배열 선언

    St(){
        st = new Object[3]; //객체배열생성
        //Object[] st = new Object[3];
        n=0;
    }

    public void push(T t){
        if(n==3){
            return; // 함수 종료.
        }
        st[n]=t;
        n++;
    }
    public T pop(){
        if(n==0){
            return null;    // 스택이 비어있어 꺼낼수 없음
        }
        n--;
        return  (T)st[n];   //다운캐스팅 타입 구체화
    }
}

public class Main {
    public static void main(String[] args){

        St<String> s = new St<String>();
        s.push("Java"); //st[0]= "Java"
        s.push("db");   //st[1]= "db"
        s.push("react"); //st[2]= "react"

        for(int i=0; i<3; i++){
            System.out.println(s.pop());
        }


        St<Integer> s2 = new St<Integer>();
        s2.push(1); //박싱 Integer i = 1;
        s2.push(2);
        s2.push(3);

        for(int i=0; i<3; i++){
            System.out.println(s2.pop());
        }



    }
}
