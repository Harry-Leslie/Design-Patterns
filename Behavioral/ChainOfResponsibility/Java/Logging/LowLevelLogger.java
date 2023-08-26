package Logging;

public class LowLevelLogger extends Logger{

    @Override
    public void log(String x, int level) {
        if (level == 1){
            System.out.print("Level Info -> ");
            System.out.println(x);
        } else {
            nextLogger.log(x, level);
        }
    }
    
}
