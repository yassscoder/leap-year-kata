import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearShould {
    @Test
    @DisplayName("return false")
    public void return_false(){
        assertEquals(false, LeapYear.isLeap(1997));
    }

    private static class LeapYear {
        public static boolean isLeap(int year) {
            return false;
        }
    }
}
