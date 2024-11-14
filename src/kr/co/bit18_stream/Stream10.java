package kr.co.bit18_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stream10 {
    public static void main(String[] args)throws IOException {

        InputStreamReader rd = new InputStreamReader(System.in);
        // 바이트 입력스트림 -> 문자 입력스트림

        FileWriter out=null;
        int r;
        try {
            out=new FileWriter("tt.txt");
            while ((r=rd.read())!=-1){
                out.write(r);
            }
            rd.close();
            out.close();
        }catch (Exception e){}

    }
}
