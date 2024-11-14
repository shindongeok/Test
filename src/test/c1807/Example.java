package test.c1807;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        String filePath = "dob.dat";

        FileReader fr = new FileReader("dob.dat");
        BufferedReader br = new BufferedReader(fr);

        int rowNumber = 1;
        String rowData;
        while (true){
            rowData = br.readLine();
            if(rowData==null)break;
            System.out.println(rowNumber + "\t"+rowData);
            rowNumber++;
        }
        br.close();
    }
}
