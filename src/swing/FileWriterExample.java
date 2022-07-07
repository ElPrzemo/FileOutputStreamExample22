package swing;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {

        String str = "Test Óśłńćńńńńńńń";

        char chars [] = str.toCharArray();

        FileWriter fw = null;

        try { fw = new FileWriter("files\\fileWritterTest.txt");

            for (char c : chars) {
                fw.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();

        }finally {
            if(fw != null) fw.close();

        }




    }

    public static class JTabbedPaneExample {
    }
}
