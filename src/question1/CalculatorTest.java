package question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import question1.controllers.Calculation;
import question1.models.Number;
import question1.services.MinusStrategy;
import question1.services.PlusStrategy;
import question1.services.Strategy;

public class CalculatorTest {

    @Test
    public void testStrategyIntance() {
        assertTrue(new PlusStrategy() instanceof Strategy);
        assertTrue(new MinusStrategy() instanceof Strategy);
    }

    @Test
    public void testCalculationByClicking() {
        Calculation calculation = new Calculation();
        calculation.calcul();
        calculation.getView().getjButton1().doClick();
        calculation.getView().getjButtonPlus().doClick();
        assertEquals(1, calculation.getNumber().getValue());

        calculation.getView().getjButton5().doClick();
        calculation.getView().getjButtonEqual().doClick();

        assertEquals("6", calculation.getView().getJLabelResult().getText());
    }

    @Test
    public void testPlusStrategy() {
        Calculation calculation = new Calculation();
        calculation.calcul();
        calculation.setStrategy(new PlusStrategy());
        Number result = calculation.doCalculation(null, 42, calculation.getView().getJLabel(), calculation.getView().getJLabelResult());
        assertEquals(42, result.getValue());
    }

    @Test
    public void testCalculationByStrategy() {
        Calculation calculation = new Calculation();
        calculation.calcul();
        Number number = new Number();
        number.setValue(6);
        calculation.setStrategy(new MinusStrategy());
        Number result = calculation.doCalculation(number, 3, calculation.getView().getJLabel(), calculation.getView().getJLabelResult());
        assertEquals(3, result.getValue());
    }

    @Test
    public void testInputResultLabel() {
        Calculation calculation = new Calculation();
        calculation.calcul();
        Number number = new Number();
        number.setValue(6);
        calculation.setStrategy(new MinusStrategy());
        Number result = calculation.doCalculation(number, 3, calculation.getView().getJLabel(), calculation.getView().getJLabelResult());
        assertEquals("", calculation.getView().getJLabel().getText());
        assertEquals("3", calculation.getView().getJLabelResult().getText());
    }
}
