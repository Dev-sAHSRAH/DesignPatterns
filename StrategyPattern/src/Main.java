import BadCode.PassengerVehicle;
import BadCode.SportsVehicle;
import BadCode.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle obj1 = new SportsVehicle();
        obj1.drive();

        Vehicle obj2 = new PassengerVehicle();
        obj2.drive();
    }
}