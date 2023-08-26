package Calculator;

public class SubtractionHandler extends CalculatorHandler{

    @Override
    public Integer calculate(String opp, Integer a, Integer b) {
        if (opp.equals("-")){
            return a-b;
        } else if (this.calculatorHandler != null){
            return this.calculatorHandler.calculate(opp, a, b);
        }
        return null;
    }
    
}
