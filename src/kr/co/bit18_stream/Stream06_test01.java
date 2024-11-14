package kr.co.bit18_stream;

import java.io.*;
import java.util.StringTokenizer;

public class Stream06_test01 {
    public static void main(String[] args) throws IOException {

        //성능 향상 스트림
        //단독 파일 생성 불가
//        FileWriter fw = new FileWriter("b.txt");
//        BufferedWriter out = new BufferedWriter(fw);
//
//        out.write("안녕!");
//        out.newLine();
//        out.write("오늘은 금요일이면 좋겠다.");
//        out.newLine();
//        out.write("ehrflqakstp@...");
//        out.close();

//        FileReader fw = new FileReader("b.txt");
//        BufferedReader out = new BufferedReader(fw);

//        BufferedReader in = new BufferedReader(new FileReader("b.txt"));
//        String str ;
//
//        while (true){
//            try {
//                str= in.readLine();
//                if(str==null){
//                    break;
//                }
//                System.out.println(str);
//            }catch (IOException e){
//                throw new RuntimeException(e);
//            }
//        }
//        in.close();

        //파일 생성
//        FileWriter fw = new FileWriter("Sample.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//
//        bw.write("저는 자바를 좋아합니다");
//        bw.close();

        //(String [] 배열로 초기화해서 for문으로 읽기)

        FileReader fw = new FileReader("Sample.txt");
        BufferedReader bw = new BufferedReader(fw);
        StringTokenizer st = new StringTokenizer(bw.readLine(), " ");
        String[] s=new String[3];

        for(int i=0; i<s.length; i++){
            s[i]=st.nextToken();
        }
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }

    }
}
