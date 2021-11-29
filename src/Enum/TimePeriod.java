package Enum;

import java.time.LocalTime;

public enum TimePeriod {
    RushHourAM {
        @Override
        public boolean TimeRange(LocalTime time) {
            LocalTime start = LocalTime.parse("06:59");
            LocalTime end = LocalTime.parse("09:01");
            //LocalTime s = LocalTime.of(7, 00);
            return time.isAfter(start) && time.isBefore(end) ? true : false;
        }
    },
    RushHourPM {
        @Override
        public boolean TimeRange(LocalTime time) {
            LocalTime start = LocalTime.parse("15:59");
            LocalTime end = LocalTime.parse("18:01");
            //LocalTime s = LocalTime.now();
            return time.isAfter(start) && time.isBefore(end) ? true : false;

        }
    };
   /* Normal {
        @Override
        public boolean TimeRange() {
            LocalTime start = LocalTime.MAX;
            LocalTime end = LocalTime.MIN;

            LocalTime s = LocalTime.now();
            return s.isBefore(start) && s.isAfter(end) && !RushHourAM.TimeRange() && !RushHourPM.TimeRange() ? true : false;

        }
    };*/

    public abstract boolean TimeRange(LocalTime time);
}
