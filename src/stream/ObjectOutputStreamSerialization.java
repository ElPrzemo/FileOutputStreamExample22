package stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamSerialization
{
    public static void main(String[] args) throws IOException {

        CarObject car1 = new CarObject("Ford", "mMustang", 1970, 200, 1);
        CarObject car2 = new CarObject("Honda", "Stara ", 1973, 220, 2);
        CarObject car3 = new CarObject("Maluch", "fiat", 1200, 3000, 1);

        ObjectOutputStream out = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream("files\\ cars.dat")));
        out.writeObject(car1);
        out.writeObject(car2);
        out.writeObject(car3);
        out.flush();
        out.close();

    }
}
