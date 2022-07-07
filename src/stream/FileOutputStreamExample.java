package stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws IOException {


        char chars[] = {'q', 'w', 'e', 'r', 't'};
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("test.txt");
            for (char c: chars){
                out.write(c);
            }

        } catch (IOException e){
            e.printStackTrace();
        }finally {
            if(out != null);out.close();

        }
    }
}
