package Logging;

public class LoggerAPI {
    Logger logger;
    LoggerAPI(){
        this.logger = new LowLevelLogger();
        MediumLevelLogger M_ = new MediumLevelLogger();
        HighLevelLogger H_ = new HighLevelLogger();
        this.logger.setNextLogger(M_);
        M_.setNextLogger(H_);
    }

    public void log(String x, int level){
        this.logger.log(x, level);
    }
}
