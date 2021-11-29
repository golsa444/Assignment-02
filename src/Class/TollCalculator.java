package Class;

import Enum.TimePeriod;
import Interface.Vehicle;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class TollCalculator {


    public static void GetTollFee(Vehicle vehicle, List<LocalDateTime> dates) {

        Vehicle c = new Car();
        Vehicle mc = new MC();


        List<LocalTime> times = dates.stream().map(LocalDateTime::toLocalTime).sorted().toList();
        System.out.println(times);
        // LocalTime intervalEnd = times.get(0).plusHours(1);
        int totalFee = 0;
        int maxFee = 0;
        for (LocalTime time : times) {
            if (TimePeriod.RushHourAM.TimeRange(time) || TimePeriod.RushHourPM.TimeRange(time)) {
                totalFee = 18;
            } else {
                totalFee = 11;
            }
            maxFee += totalFee;
            System.out.println(maxFee);
        }
    }


}



