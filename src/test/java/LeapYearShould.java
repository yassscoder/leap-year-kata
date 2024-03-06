import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearShould {
    @ParameterizedTest
    @DisplayName("return false")
    @ValueSource(ints = {1997, 1999, 2001, 2003})
    public void return_false(int year) {
        assertEquals(false, LeapYear.isLeap(year));
    }

    @ParameterizedTest
    @DisplayName("return true")
    @ValueSource(ints = {1996, 2020, 2024})
    public void return_true(int year) {
        assertEquals(true, LeapYear.isLeap(year));
    }

    @Test
    void return_true_divisible_400() {
        assertEquals(true, LeapYear.isLeap(1600));
    }

}