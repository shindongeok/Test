package kr.co.bit18_stream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stream05 {
    public static void main(String[] args) throws IOException {

        //a.txt에 저장된 문자를 읽어와서 출력
        char ary[] = new char[10];
        int r;

        //파일에 저장한 문자를 읽어들여서
        FileReader in = new FileReader("a.txt");
        r=in.read(ary, 0 ,ary.length);
        //배열의 길이 만큼 저장

        for(int i=0;i<r; i++){
            System.out.println(ary[i]);
        }

//        char a ='S';
//        char b ='W';
//
//        //파일 생성
//        FileWriter out =new FileWriter("a.txt");
//
//        out.write(a);
//        out.write(b);
//        out.close();
    }
}
