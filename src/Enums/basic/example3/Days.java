package Enums.basic.example3;

public class Days {
    public enum WeekDays {
        MONDAY("Start of the week, time to work"),
        TUESDAY("Tuesday with energy"),
        WEDNESDAY("Wednesday, almost Thursday"),
        THURSDAY("Thursday, almost Friday"),
        FRIDAY("Finally Friday"),
        SATURDAY("Chill Saturday"),
        SUNDAY("Relaxing Sunday");
        private final String info;

        @Override
        public String toString() {
            return info;
        }
        WeekDays(String info) {
            this.info = info;
        }
    }
    public static void main(String[] args) {
        for (WeekDays d : WeekDays.values()) {
            System.out.println(d);
        }
    }
}
