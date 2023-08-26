package Logging;

public class HighLevelLogger extends Logger{

    @Override
    public void log(String x, int level) {
        if (level == 3){
            System.out.print("Level Error -> ");
            System.out.println(x);
        } else {
            nextLogger.log(x, level);
        }
    }
    
}
