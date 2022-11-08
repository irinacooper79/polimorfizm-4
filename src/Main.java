import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transport.Car;
import Transport.Bus;
import Transport.Truck;
import Transport.Transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car ("Kia", "Rio",1.6f);
        DriverB DriverB = new DriverB("Меладзе Валерий", 5, car);
        System.out.println(DriverB);

        Bus volgabus = new Bus ("Volgabus", "Дельта 12", 1.7f);
        Bus zonda = new Bus("Zonda", "YCK6116HGL3", 2.5f);
        Bus daewoo = new Bus("Daewoo", "BC212MA", 3.0f);
        Bus gazelle = new Bus("Газель", "Next A63R42", 2.0f);

        Car kia = new Car("Kia", "Rio", 1.6f);
        Car honda = new Car("Honda", "CR-V", 2.0f);
        Car hyundai = new Car("Hyundai", "Creta", 1.8f);
        Car toyota = new Car("Toyota", "Camry", 3.0f);

        Truck pazik = new Truck("Паз", "Вектор", 3.7f);
        Truck kavz = new Truck("КАВЗ", "4239", 2.5f);
        Truck gaz = new Truck("ГАЗ", "3308 Садко", 2.5f);
        Truck gazon = new Truck("ГАЗон", "Next", 3.7f);

        System.out.println(volgabus);
        System.out.println(toyota);
        System.out.println(pazik);
        honda.startMovement();

        honda.pitStop();
        honda.bestLapTime();
        System.out.println();
        honda.maxSpeed();
        System.out.println();

        pazik.pitStop();
        pazik.bestLapTime();
        System.out.println();
        pazik.maxSpeed();
        System.out.println();

        volgabus.pitStop();
        volgabus.bestLapTime();
        System.out.println();
        volgabus.maxSpeed();
        System.out.println();
    }
}