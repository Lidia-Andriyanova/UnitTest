package dz.first.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    public static void main(String[] args) {

        assertThat(Calculator.calculatingDiscount(100.0, 20)).isEqualTo(80.0);

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-100, 20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments: purchaseAmount and discountAmount must be non-negative");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments: purchaseAmount and discountAmount must be non-negative");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(-100, -20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments: purchaseAmount and discountAmount must be non-negative");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 0))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Division by zero is not possible");

        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 100))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Discount amount of more than 100 percent is not possible");
    }
}
