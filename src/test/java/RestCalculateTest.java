import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.RestCalculate;

public class RestCalculateTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void RestOfTheYear(int expected, int income, int expenses, int threshold) {
        RestCalculate service = new RestCalculate();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
