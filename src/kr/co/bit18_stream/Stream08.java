package kr.co.bit18_stream;


import java.io.*;

public class Stream08 {
    public static void main(String[] args) throws IOException {

//        DataOutputStream out=null;
//        try {
//            FileOutputStream fi = new FileOutputStream("h.txt");
//            out=new DataOutputStream(fi);
//
//
//            int a=5;
//            double b=3.2;
//            boolean c=true;
//
//            out.writeInt(a);
//            out.writeDouble(b);
//            out.writeBoolean(c);
//        }catch (Exception e){}
//        out.close();

        DataInputStream in=null;
        try {
            //파일불러와서 데이터인풋스트림으로 읽어오기
            FileInputStream fi = new FileInputStream("h.txt");
            in = new DataInputStream(fi);

            int a=in.readInt();
            double b=in.readDouble();
            boolean c=in.readBoolean();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }catch (Exception e){}
        in.close();
    }

}
