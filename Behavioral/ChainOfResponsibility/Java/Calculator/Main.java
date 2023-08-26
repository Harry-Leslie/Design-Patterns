package Calculator;

public class Main {
    public static void main(String[] args) {
        CalculatorHandler calculatorHandler = new AdditionHandler();
        CalculatorHandler sCalculatorHandler = new SubtractionHandler();

        calculatorHandler.setNextHandler(sCalculatorHandler);
        System.out.println(calculatorHandler.calculate("-", 5, 3));
    }
}
