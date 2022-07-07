package stream;

import java.io.*;

public class DataInputStreamExample {

    public static void main(String[] args)
            throws IOException {

        DataInputStream inn = null;

        try{ new DataInputStream( new BufferedInputStream(new FileInputStream( "files\\testo.txt") ));

           String str =  inn.readUTF();
           System.out.println(str);
           // inn.readShort(30000); //
           //inn.readLong(8383);  //
            //inn.readFloat((float) 1.83); //

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (inn != null) inn.close();

        }
    }
}


