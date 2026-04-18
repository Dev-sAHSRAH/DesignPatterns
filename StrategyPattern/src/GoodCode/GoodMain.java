package GoodCode;

public class GoodMain {
    public static void main(String[] args) {
        Vehicle obj1 = new SportsVehicle();
        obj1.drive();

        Vehicle obj2 = new PassengerVehicle();
        obj2.drive();
    }
}
