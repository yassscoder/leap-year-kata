public class LeapYear {
    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
