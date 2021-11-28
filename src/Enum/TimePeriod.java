package Enum;

import java.time.LocalTime;

public enum TimePeriod {
    RushHourAM {
        @Override
        public boolean TimeRange() {
            LocalTime start = LocalTime.parse("08:00");
            LocalTime end = LocalTime.parse("09:00");
            LocalTime s = LocalTime.now();
            return s.isAfter(start) && s.isBefore(end) ? true : false;
        }
    },
    RushHourPM {
        @Override
        public boolean TimeRange() {
            LocalTime start = LocalTime.parse("16:00");
            LocalTime end = LocalTime.parse("17:00");
            LocalTime s = LocalTime.now();
            return s.isAfter(start) && s.isBefore(end) ? true : false;

        }
    },
    Normal {
        @Override
        public boolean TimeRange() {
            LocalTime start = LocalTime.MAX;
            LocalTime end = LocalTime.MIN;
            LocalTime s = LocalTime.now();
            return s.isBefore(start) && s.isAfter(end) && !RushHourAM.TimeRange() && !RushHourPM.TimeRange() ? true : false;

        }
    };

    public abstract boolean TimeRange();
}
