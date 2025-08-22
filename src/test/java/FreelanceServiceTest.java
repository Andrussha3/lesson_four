
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.FreelanceService;

public class FreelanceServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"


    })
    public void shouldCalculateForFirstExample(int expected, int income, int expenses, int threshold) {
        FreelanceService service = new FreelanceService();

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }

}