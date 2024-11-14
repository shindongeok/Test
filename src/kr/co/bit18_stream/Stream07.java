package kr.co.bit18_stream;

import java.io.*;

public class Stream07 {
    public static void main(String[] args) throws IOException{

        BufferedReader bu = null;   //입력하기 위한 문자형 입력 스트림
        PrintWriter pr =null;   //출력하기 위한 문자형 출력 스트림

        try {
            // 입력하기 위한 인풋스트림리더에 System.in 사용
            InputStreamReader in = new InputStreamReader(System.in);
            bu = new BufferedReader(in);

            FileWriter fw = new FileWriter("d.txt");

            pr = new PrintWriter(fw);

            String str=null;
            while ((str=bu.readLine())!=null){
                pr.print(str);
            }
            bu.close();
        }catch (Exception e){}
            finally {
                pr.close();

        }

    }
}
