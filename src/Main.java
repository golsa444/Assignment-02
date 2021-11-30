import Class.TollCalculator;
import Class.Car;
import Class.MC;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Class.Car;
import Class.TollCalculator;
import Class.MC;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car c = new Car();
        MC mc = new MC();
        TollCalculator t = new TollCalculator();
        LocalDateTime e = LocalDateTime.of(2020, 11, 5, 7, 0, 0);
        LocalDateTime e1 = LocalDateTime.of(2020, 11, 5, 11, 0, 0);
        LocalDateTime e2 = LocalDateTime.of(2020, 11, 5, 16, 0, 0);
        LocalDateTime e3 = LocalDateTime.of(2020, 11, 5, 18, 0, 0);
        LocalDateTime e4 = LocalDateTime.of(2020, 11, 5, 20, 0, 0);

        List<LocalDateTime> list = new ArrayList<>() {
        };
        list.add(e);
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);


        // t.GetTollFee(c, list);
        t.GetTollFee(mc, list);


    }
}
