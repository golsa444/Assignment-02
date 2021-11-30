package Enum;

import java.time.LocalTime;

public enum TimePeriod {
    RushHourAM {
        @Override
        public boolean TimeRange(LocalTime time) {
            LocalTime start = LocalTime.parse("07:59");
            LocalTime end = LocalTime.parse("09:01");
            //LocalTime s = LocalTime.of(7, 00);
            return time.isAfter(start) && time.isBefore(end) ? true : false;
        }
    },
    RushHourPM {
        @Override
        public boolean TimeRange(LocalTime time) {
            LocalTime start = LocalTime.parse("15:59");
            LocalTime end = LocalTime.parse("16:59");
            //LocalTime s = LocalTime.now();
            return time.isAfter(start) && time.isBefore(end) ? true : false;

        }
    };

    public abstract boolean TimeRange(LocalTime time);
}
