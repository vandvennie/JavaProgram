public abstract class Enum {
   public enum DayOfWeek{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
   }

    static boolean isWeekend(DayOfWeek today){
        return (today == DayOfWeek.Saturday || today == DayOfWeek.Sunday);
    }

    public enum Transport{
        BUS, TRAIN, FERRY, TRAM
    }
    static int typicalSpeed(Transport tra){
        switch (tra) {
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
    
        System.out.println(isWeekend(DayOfWeek.Monday));
        System.out.println(isWeekend(DayOfWeek.Sunday));
        System.out.println(typicalSpeed(Transport.BUS));
    }
}