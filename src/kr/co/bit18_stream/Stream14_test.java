package kr.co.bit18_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Stream14_test {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        String name;
        String id;

        BufferedWriter bf= new BufferedWriter(new FileWriter("test02.txt"));

        while (true){
            name = s.next();
            if(name.compareTo("그만")!=0){
                bf.write(name + " ");

            }
            else {
                break;
            }
            id=s.next();
            if(id.compareTo("그만")!=0){
                bf.write(id+ " ");
            }else {
                break;
            }

        }
        s.close();
        bf.close();

    }
}
