package Calculator;

public abstract class CalculatorHandler{

    CalculatorHandler calculatorHandler;

    public abstract Integer calculate(String opp, Integer a, Integer b);

    public void setNextHandler(CalculatorHandler handler){
        this.calculatorHandler = handler;
    }
}
