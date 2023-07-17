package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
//        Create a program that will consume a year and a month (validation is required)
//        and will print amount of days in this month considering also if a year is leap
//        or not.(prints amount of days or else "invalid date", negative years are not accepted)

        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;

            default:
                System.out.println("invalid date");
                break;
        }

    }
}
