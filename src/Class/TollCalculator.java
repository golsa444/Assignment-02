package Class;

import Enum.TimePeriod;
import Interface.Vehicle;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class TollCalculator {

    public static int GetTollFee(Vehicle vehicle, List<LocalDateTime> dates) {
        // Group dates by dayw List,LIst<LocalTime>
        // for ....
        List<LocalTime> times = dates.stream().map(LocalDateTime::toLocalTime).sorted().toList();
        System.out.println(times);
        // LocalTime intervalEnd = times.get(0).plusHours(1);
        int totalFee = 0;
        int maxFee = 0;

        for (LocalTime time : times) {
            if (TimePeriod.RushHourAM.TimeRange(time) || TimePeriod.RushHourPM.TimeRange(time)) {
                totalFee = 18;
                System.out.println("Fee: " + totalFee);
            } else if (vehicle.GetVehicleType() == "Car") {
                totalFee = vehicle.CalculateFee();
                System.out.println("Fee: " + totalFee);
            } else if (vehicle.GetVehicleType() == "MC") {
                totalFee = vehicle.CalculateFee();
                System.out.println("Fee: " + totalFee);
            }
            int x = maxFee += totalFee;

            System.out.println("Total: " + x);
        }
        if (maxFee > 60) {
            maxFee = 60;
        }
        System.out.println("MaxFee for a Day: " + maxFee);
        return totalFee;
    }

}

    /*public static boolean checkSatSun(LocalDate ss) {
        DayOfWeek d = ss.getDayOfWeek();
        return d == DayOfWeek.SATURDAY || d == DayOfWeek.SUNDAY;
    }*/





