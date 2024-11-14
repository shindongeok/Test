package kr.co.bit18_stream;

import java.io.*;

public class FileOutputStream01 {
    public static void main(String[] args) throws IOException {

        //3. FileOutputStream을 이용하여 byte[]배열
        // 속에 들어있는 바이너리 값을 fi.txt파일에 저장해라. (byte b[]={1,2,3,4,5}; 로초기화)
        //3.1 저장한 후 값을 읽어와서 출력해라.

//        ByteArrayInputStream in =null; //읽기
//        FileOutputStream out=null; //파일생성
//
//        try {
//            byte[] b= new byte[]{1,2,3,4,5};
//
//            in=new ByteArrayInputStream(b);
//            out = new FileOutputStream("fi.txt"); //파일 생성
//            int r= -1;
//            while ((r=in.read())!=-1){
//                out.write(r);
//            }
//        }catch (Exception e){}
//        out.close();
//        in.close();
//
//        FileInputStream in1 = null;
//        ByteArrayOutputStream out1 =null;
//
//        try {
//            in1=new FileInputStream("fi.txt");
//            out1=new ByteArrayOutputStream();
//
//            int r=-1;
//            while ((r=in.read())!=-1){
//                out1.write(r);
//            }
//
//            byte[] b =out1.toByteArray();
//            for(int i=0; i<b.length; i++){
//                System.out.println(b[i]);
//            }
//        }catch (Exception e){}
//        in.close();
//        out.close();

//        byte b[]={1,2,3,4,5};
//        FileOutputStream out = new FileOutputStream("f.txt");
//        out.write(b);
//        out.close();




    }
}
