package typinghomework;

public class Programme_4_NumbersOfDaysInMonth {
    public static void main(String[] args) {
        //Leap year 4 outputs
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println("--------------------------------------------------");

        //5 outputs to get days in a month
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    // Checking is it leap year
    public static boolean isLeapYear(int years) {
        boolean b;
        if (years <= 1 || years >= 9999) {
            b = false;
        } else {
            b = years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
        }
        return b;
    }

    // Calculating the days of the month depends on year
    public static int getDaysInMonth(int month, int year) {
        int days = 0;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
        }
        return days;
    }
}





