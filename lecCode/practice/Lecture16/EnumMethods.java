enum Month{
    January, February, March, April, May, June, July, August, September, October, November, December
}

public class EnumMethods {

    public static void main(String[] args) {
        for (Month m : Month.values()){
            System.out.println(m);
        }
        System.out.println(Month.October.ordinal());
        System.out.println(Month.October.name());
        System.out.println(Month.valueOf("November"));
    }
}