package switchstatement;

public class Switch {
    enum DAYS {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        breakFast(DAYS.SUNDAY);
        breakFast(DAYS.SATURDAY);
        breakFast(DAYS.MONDAY);
        System.out.println("--JDK 14--");
        breakFast_JDK14(DAYS.SUNDAY);
        breakFast_JDK14(DAYS.SATURDAY);
        breakFast_JDK14(DAYS.MONDAY);


    }

    //Older version
    public static void breakFast(DAYS DAY) {

        switch (DAY) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's Weekend Yay !");
                System.out.println("Toast");
                break;
            case MONDAY:
                System.out.println("Poha");
                break;
            case TUESDAY:
                System.out.println("Oats");
                break;
            case WEDNESDAY:
                System.out.println("Smoothie");
                break;
            case THURSDAY:
                System.out.println("Dosa");
                break;
            case FRIDAY:
                System.out.println("Bagel");
                break;
        }

    }

    //Older version
    public static String breakFast_JDK14(DAYS DAY) {
        String breakFast = switch (DAY) {
            case SATURDAY, SUNDAY -> {
                System.out.println("It's Weekend Yay !");
                yield "Toast";
            }
            case MONDAY -> "Poha";
            case TUESDAY -> "Oats";
            case WEDNESDAY -> "Smoothie";
            case THURSDAY -> "Dosa";
            case FRIDAY -> "Bagel";
        };
        System.out.println(breakFast);
        return breakFast;

    }


}
