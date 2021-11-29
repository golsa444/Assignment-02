import Class.TollCalculator;
import Class.Car;
import Class.MC;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println(f);

        // write your code here
        //LocalTime s = LocalTime.now();
        //System.out.println(getTime(s));
        // boolean s = TimePeriod.Normal.TimeRange();
        // System.out.println(s);


       /* Car c = new Car(TimePeriod.RushHourAM);
        int g = c.CalculateFee();
        System.out.println(g);

        MC c1 = new MC();
        int g1 =  c1.CalculateFee();
        System.out.println(g1);

        TollCalculator t = new TollCalculator();
        int f = t.getTotalFee(c1);
        System.out.println(f);*/


        /*TollCalculator t = new TollCalculator();
        Car v = new Car();
        MC m = new MC();
        List<LocalTime> s = t.getTimes();

        //System.out.println(s);
        Integer[] x = new Integer[24];

        int car = c.CalculateFee();*/
        // System.out.println(car);
        Car c = new Car();
        MC c1 = new MC();
        TollCalculator t = new TollCalculator();
        LocalDateTime e = LocalDateTime.of(2020, 11, 5, 7, 0, 0);
        LocalDateTime e1 = LocalDateTime.of(2020, 11, 5, 8, 30, 0);
        LocalDateTime e2 = LocalDateTime.of(2020, 11, 5, 11, 30, 0);
        LocalDateTime e3 = LocalDateTime.of(2020, 11, 5, 8, 40, 0);

        List<LocalDateTime> list = new ArrayList<>() {
        };
        list.add(e);
        list.add(e1);
        list.add(e2);
        list.add(e3);

        t.GetTollFee(c, list);


    }
}
