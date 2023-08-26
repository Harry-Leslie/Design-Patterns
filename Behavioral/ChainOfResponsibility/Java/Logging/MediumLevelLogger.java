package Logging;

public class MediumLevelLogger extends Logger {

    @Override
    public void log(String x, int level) {
        if (level == 2){
            System.out.print("Level Main -> ");
            System.out.println(x);
        } else {
            nextLogger.log(x, level);
        }
    }
    
}
