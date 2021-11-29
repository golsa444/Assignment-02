package Class;

import Enum.TimePeriod;
import Interface.Vehicle;

public class Car implements Vehicle {
    @Override
    public int CalculateFee() {
        return 11;
    }

    @Override
    public String GetVehicleType() {

        return "Car";
    }
}
