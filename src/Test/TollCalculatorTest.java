package Test;

import Enum.TimePeriod;
import Interface.Vehicle;
import Class.Car;
import Class.MC;
import Class.TollCalculator;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class TollCalculatorTest {

    Vehicle car = new Car();
    Vehicle mc = new MC();
    TollCalculator t = new TollCalculator();

    @Test
    public void testGetTollFee() {
        LocalDateTime e3 = LocalDateTime.of(2033, 11, 5, 7, 0, 0);
        LocalDateTime e4 = LocalDateTime.of(2033, 11, 5, 10, 0, 0);
        LocalDateTime e5 = LocalDateTime.of(2033, 11, 5, 15, 0, 0);
        LocalDateTime e6 = LocalDateTime.of(2033, 11, 5, 16, 30, 0);
        LocalDateTime e7 = LocalDateTime.of(2033, 11, 5, 16, 30, 0);
        LocalDate d = LocalDate.now();
        List<LocalDateTime> list = new ArrayList<>() {
        };
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);

        t.GetTollFee(car, list, d);
        //t.GetTollFee(mc, list);
    }

    @Test
    public void testCalculateFeeCar() {
        int fee = 11;
        int x = car.CalculateFee();
        Assert.assertEquals(fee, x);
    }

    @Test
    public void testCalculateFeeMC() {
        int fee = 8;
        int x = 18;
        int y = mc.CalculateFee();
        Assert.assertEquals(fee, y);
        Assert.assertNotEquals(x, y);
    }

    @Test
    public void testTimeRangeRushHourAM() {
        LocalTime time = LocalTime.of(7, 0);
        boolean x = TimePeriod.RushHourAM.TimeRange(time);
        Assert.assertTrue(x);

    }

    @Test
    public void testTimeRangeRushHourPM() {
        LocalTime time = LocalTime.of(18, 0);
        boolean x = TimePeriod.RushHourAM.TimeRange(time);
        Assert.assertFalse(x);

    }

    @Test
    public void testVehicleTypeCar() {
        String c = "Car";
        String x = "Bus";
        String a = car.GetVehicleType();
        Assert.assertEquals(c, a);
        Assert.assertNotEquals(x, a);

    }

    @Test
    public void testVehicleTypeCMC() {
        String c = "MC";
        String x = "Truck";
        String a = mc.GetVehicleType();
        Assert.assertEquals(c, a);
        Assert.assertNotEquals(x, a);

    }

}