package kr.co.bit18_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Stream15_test {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("test01.txt");

        int n;
        while ((n=f.read())!=-1){
            System.out.println((char)n);
        }
    }
}
