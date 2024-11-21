import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.RestCalculate;

public class RestCalculateTest {

    @Test
    public void RestOfTheYear() {
        RestCalculate service = new RestCalculate();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
}
