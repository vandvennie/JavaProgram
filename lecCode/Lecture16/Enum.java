public class Enum {
    public static boolean isWeekend(DayOfWeek day) {
        return day == DayOfWeek.Saturday || day == DayOfWeek.Sunday;
    }

    public static int typicalSpeed(Transport transport) {
        switch (transport) {
            case BUS:
                return 50;
            case TRAIN:
                return 100;
            case FERRY:
                return 20;
            case TRAM:
                return 30;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.Monday;
        System.out.println(isWeekend(day));
        System.out.println(isWeekend(DayOfWeek.Saturday));

        System.out.println(typicalSpeed(Transport.BUS));
        System.out.println(typicalSpeed(Transport.TRAIN));
    }
}