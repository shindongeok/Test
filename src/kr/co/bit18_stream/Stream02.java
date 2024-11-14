package kr.co.bit18_stream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Stream02 {
    public static void main(String[] args) throws IOException {

        //g.dat에 있는 파일을 읽어와서 콘솔에 출력
        FileInputStream in = null;
        ByteArrayOutputStream out=null;

        try {
            in= new FileInputStream("g.dat");
            //g,det파일 읽어오기
            out=new ByteArrayOutputStream();
            //바이트배열에 저장하겠다.

            int r=-1;
            while ((r=in.read())!=-1){
                out.write(r);
            }
            //바이트배열 객체로 변환하겠다.
            //스트림에 저장된 데이터를 바이트배열로 변환
            byte[] b = out.toByteArray();
            for(int i=0; i<b.length; i++){
                System.out.println(b[i]);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        out.close();
        in.close();

    }
}
