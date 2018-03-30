package good.anyway;

public class StateStopped extends State {
    @Override public int getTypeCode() {
        return LoggerWithState.STATE_STOPPED;
    }
}
