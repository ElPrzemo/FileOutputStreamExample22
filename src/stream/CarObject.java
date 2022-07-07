package stream;

import java.io.Serializable;





    public class CarObject implements Serializable {
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

        public String toString() {
            return "CarObject{name='" + this.name + "', manufacturer='" + this.manufacturer + "', productionYear=" + this.productionYear + ", topSpeed=" + this.topSpeed + ", id=" + this.id + "}";
        }
    }

