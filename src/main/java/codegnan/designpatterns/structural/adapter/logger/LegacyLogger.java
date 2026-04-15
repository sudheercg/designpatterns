package codegnan.designpatterns.structural.adapter.logger;
public class LegacyLogger {
    public void writeLog(String msg) {
        System.out.println("LEGACY LOG: " + msg);
    }
}