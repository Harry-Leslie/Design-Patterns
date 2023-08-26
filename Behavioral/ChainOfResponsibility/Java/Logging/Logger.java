package Logging;

public abstract class Logger {
    Logger nextLogger;

    public abstract void log(String x, int level);

    public Logger setNextLogger(Logger logger){
        this.nextLogger=logger;
        return logger;
    }
}
