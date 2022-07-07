package stream;

import java.io.*;

public class DataOutputStreamExample {
    public static void main(String[] args)
    throws IOException {

            DataOutputStream out = null;

            try{ new DataOutputStream( new BufferedOutputStream(new FileOutputStream( "files\\testo.txt") ));

                out.writeUTF("testowy strumień binarny");
                out.writeShort(30000);
                out.writeLong(8383);
                out.writeFloat((float) 1.83);

                out.flush();


            }catch (IOException e){
                e.printStackTrace();
            }finally {
              if (out != null) out.close();

            }
    }
}

