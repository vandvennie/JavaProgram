enum DayOfWeek {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}


public class EnumMethods {
    public static void main(String[] args) {
        // Go through all the days of the week
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        int dayNumber = DayOfWeek.Tuesday.ordinal();
        String dayName = DayOfWeek.Tuesday.name();
        DayOfWeek day = DayOfWeek.valueOf("Tuesday");
        System.out.println(dayNumber);
        System.out.println(dayName);
        System.out.println(day);
    }
}