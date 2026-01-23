package codegnan.designpatterns.structural.adapter.logger;
public class LoggerAdapter implements Logger {

    private final LegacyLogger legacyLogger;

    public LoggerAdapter(LegacyLogger legacyLogger) {
        this.legacyLogger = legacyLogger;
    }

    @Override
    public void log(String message) {
        legacyLogger.writeLog(message);
    }
}