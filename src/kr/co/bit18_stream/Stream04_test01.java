package kr.co.bit18_stream;



import java.io.*;

public class Stream04_test01 {
    public static void main(String[] args) throws IOException {

        //1. FileOutputStream을 이용하여 byte[] 배열 속에 들어있는 값을 test.txt파일에 저장해라.
        //byte b[]={4,6,7,8,-1,24};
        //​
        //1.2 FileInputStream을 이용하여 test.txt파일을 읽어 byte[] 속에 저장하고 화면에 출력해라.

        ByteArrayInputStream in = null;
        FileOutputStream out = null;

        try {
            byte[] b = {4, 6, 7, 8, -1, 24};
            in = new ByteArrayInputStream(b);
            out = new FileOutputStream("test.txt");

            int r =-1;
            while ((r=in.read())!=-1){
                out.write(r);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        out.close();
        in.close();

        FileInputStream on= null;
        ByteArrayOutputStream buout= null;

        try {
            on = new FileInputStream("test.txt");
            buout = new ByteArrayOutputStream();

            int r =-1;
            while ((r=on.read())!=-1){
                buout.write(r);
            }
            byte[] b=buout.toByteArray();
            for (byte by : b){
                System.out.println(by);
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        buout.close();
        on.close();


    }
}
