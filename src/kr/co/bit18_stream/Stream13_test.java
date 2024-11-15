package kr.co.bit18_stream;


import java.io.*;

public class Stream13_test {
    public static void main(String[] args) throws IOException {
        //Hi
        //파일 생성
        FileWriter fw = new FileWriter("test01.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hi");
        bw.newLine();
        bw.write("저는 자바를 좋아하고 잘합니다");
        bw.newLine();
        bw.write("앞으로 더 열심히 공부할 것입니다");
        bw.close();







    }
}
