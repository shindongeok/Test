package text01.test06;

public class Main {
    public static void main(String[] args){
        String str1 = "Java";
        String str2 = "C++";

        int r = str1.compareTo(str2);   //사전순
        // str1<str2
        if(r==0){
            System.out.println("같다");
        }
        else if(r<0){   //사전에 먼저 나오면 음수리턴
            System.out.println("Java가 C++보다 작다");
        }
        //a b c d  : a가 먼저 나온다는건 사전순으로 a가 작다는것이다
        else {  //r>0  //str1>str2  //사전에 나중에 나오면 양수리턴
            System.out.println("C++가 Java보다 크다");
        }
    }
}
