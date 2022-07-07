package stream;

import java.io.*;

public class ObjectInputStreamSerialization {
    public static void main(String[] args) throws IOException {

        ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("files\\ cars.dat")));

        try {while(true){
            CarObject car = (CarObject) in.readObject();
            System.out.println(car);
        }

        } catch (EOFException e) {
            // koniec pliku, potrzebne żeby nie wywalało tego błędu

        }catch (Exception e){
            e.printStackTrace();
        }finally { if (in !=null) in.close();

        }

    }
}
