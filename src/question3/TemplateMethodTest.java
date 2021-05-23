package question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemplateMethodTest {
    @Test
    public void testDelegation() {
        Collection<Integer> integers = new ConcreteList<>();

        integers.add(33);
        integers.add(42);

        assertEquals(2, integers.size());

        Collection<Integer> integers2 = new ConcreteList<>();
        integers2.add(5);
        integers2.add(10);

        integers.add(integers2);
        assertEquals(4, integers.size());

        integers.retirer(42);
        assertEquals(3, integers.size());
    }
}
