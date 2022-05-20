import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testDaysInYear() {
        final int expected = 365;
        final int actual = Main.daysInYear(2022);
        Assertions.assertEquals(expected, actual);
    }
}