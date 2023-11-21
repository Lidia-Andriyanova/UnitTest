package dz.first.Calculator;

public class Calculator {

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        // Метод должен возвращать сумму покупки со скидкой

        if (purchaseAmount < 0 || discountAmount < 0) {
            throw new ArithmeticException("Invalid arguments: purchaseAmount and discountAmount must be non-negative");
        }
        else if (discountAmount == 0) {
            throw new ArithmeticException("Division by zero is not possible");
        }
        else if (discountAmount >= 100) {
            throw new ArithmeticException("Discount amount of more than 100 percent is not possible");
        }
        double discount = purchaseAmount * discountAmount / 100;
        return purchaseAmount - discount;
    }
 }