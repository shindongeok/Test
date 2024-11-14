package kr.co.bit18_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Stream03 {
    public static void main(String[] args) {

        //1,2,3를 OutputStream에 저장하고싶다.
        byte[] in = {1, 2, 3, 4, 5};
        byte[] out =null;

        ByteArrayInputStream input= null;
        ByteArrayOutputStream output=null;

        output = new ByteArrayOutputStream();
        input = new ByteArrayInputStream(in);

        int r =0;
        while ((r=input.read())!=-1){   //읽어드리기
            output.write(r);            // output에 저장
        }

        //바이트 스트림을 바이트 배열로 바꿈
        out = output.toByteArray();

        // 객체를 문자열로 변환해주는 메소드 : toString()
        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(out));
    }
}
