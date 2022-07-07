package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
    public FileInputStreamExample(String s) {
    }

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;

        try{
            in = new FileInputStream("test.txt");
            int  num = 0;
            while((num = in.read()) !=-1 )
                System.out.print((char)num);
    }catch (IOException e){
            e.printStackTrace();
        }finally
        { if(in != null) in.close();}
    }}

