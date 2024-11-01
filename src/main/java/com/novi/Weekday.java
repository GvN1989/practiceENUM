package com.novi;

public enum Weekday {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public Weekday nextDay(){
            return switch (this) {
                case MONDAY -> TUESDAY;
                case TUESDAY -> WEDNESDAY;
                case WEDNESDAY -> THURSDAY;
                case THURSDAY -> FRIDAY;
                case FRIDAY -> SATURDAY;
                case SATURDAY -> SUNDAY;
                case SUNDAY -> MONDAY;
            };
        }

        public Weekday nextWorkday(){
            return switch (this) {
                case FRIDAY, SATURDAY, SUNDAY -> MONDAY;
                default -> nextDay();
            };
        }
}



