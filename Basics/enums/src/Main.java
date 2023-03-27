import enums.Continents;
import enums.Days;

/**
 * Main class
 *
 * @author Alex T.H.
 * @version v0.1.4
 * @since 20.0.0 2023-03-27
 */
public class Main {
    public static void main(String[] args) {

//        System.out.println(daysOfWeek(1));

        System.out.println(Continents.AMERICA.getPaises());
        System.out.println(Continents.AFRICA);

    }

    private static Days daysOfWeek(int day){
        return switch (day){
            case 1 -> Days.MONDAY;
            case 2 -> Days.TUESDAY;
            case 3 -> Days.WEDNESDAY;
            case 4 -> Days.THURSDAY;
            case 5 -> Days.FRIDAY;
            case 6 -> Days.SATURDAY;
            case 7 -> Days.SUNDAY;
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
    }
}