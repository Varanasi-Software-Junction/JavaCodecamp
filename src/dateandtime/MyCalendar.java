package dateandtime;

public class MyCalendar {

    static String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    public static void printCalendar(int month, int year) {
        int noofdays = 10, startday = 0/*2=Mon*/;
        for (int i = 0; i <= days.length - 1; i++) {
            System.out.printf("%5s", days[i]);
        }
        System.out.println();
        for (int i = 1; i <= startday; i++) {
            System.out.printf("%5s", "");
        }
        for (int i = 1; i <= noofdays; i++) {
            if ((i + startday - 1) % 7 == 0) {
                System.out.println();
            }
            System.out.printf("%5s", i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printCalendar(8, 2022);
    }
}
