package good.anyway;

public class StateLogging extends State {
    @Override public int getTypeCode() {
        return LoggerWithState.STATE_LOGGING;
    }
}
