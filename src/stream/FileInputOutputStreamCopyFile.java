package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class FileInputOutputStreamCopyFile {
    public static void main(String[] args) throws IOException {


            FileInputStream in = null;
            FileOutputStream out = null;


            try {
                in = new FileInputStream("test.txt");
                out = new FileOutputStream("copy.txt");

                int num = 0;
                while ((num = in.read()) !=-1){
                    out.write(num);
                }

        } catch (IOException e ){
                e.printStackTrace();
            }finally {
                if(in != null)in.close();
                if(out != null)out.close();

            }
            }

    public static class CarObject implements Serializable {

        public String name;
        public String manufacturer;
        public int productionYear;
        public int topSpeed;
        public transient int id;

        public CarObject(String name, String manufacturer, int productionYear, int topSpeed, int id) {
            this.name = name;
            this.manufacturer = manufacturer;
            this.productionYear = productionYear;
            this.topSpeed = topSpeed;
            this.id = id;
        }

        @Override
        public String toString() {
            return "stream.FileInputOutputStreamCopyFile.CarObject{" +
                    "name='" + name + '\'' +
                    ", manufacturer='" + manufacturer + '\'' +
                    ", productionYear=" + productionYear +
                    ", topSpeed=" + topSpeed +
                    ", id=" + id +
                    '}';
        }
    }
}






