package kr.co.bit18_stream;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream01 {
    public static void main(String[] args) throws IOException {

        ByteArrayInputStream in =null; //읽어들임
        FileOutputStream out = null;    // 파일을 생성 && 값 저장

        try {
            byte[] b= new byte[]{1,2,3};
            //1,2,3 바이트 배열 읽어들임
            in=new ByteArrayInputStream(b);
            //g.dat라는 파일을 생성해서 1,2,3
            out= new FileOutputStream("g.dat");

            int r=-1;
            while ((r=in.read())!=-1){
                out.write(r);   //1,2,3을 g.dat파일에 저장
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        out.close();
        in.close();
    }
}
