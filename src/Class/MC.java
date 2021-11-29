package Class;

import Enum.TimePeriod;
import Interface.Vehicle;

public class MC implements Vehicle {
    @Override
    public int CalculateFee() {
        return 8;
    }

    @Override
    public String GetVehicleType() {

        return "MC";
    }
}
