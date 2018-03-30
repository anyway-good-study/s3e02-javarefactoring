package good.anyway;

public class LoggerWithState extends Logger {
    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;
    private State _state;
    public LoggerWithState() {
        setState(STATE_STOPPED);
    }
    public int getState() {
        return _state.getTypeCode();
    }
    public void setState(int state) {
        switch (state) {
            case STATE_STOPPED:
                _state = new StateStopped();
                break;
            case STATE_LOGGING:
                _state = new StateLogging();
                break;
            default:
                System.out.println("???? - " + state);
        }
    }
    public void start() {
        switch (getState()) {
            case STATE_STOPPED:
                System.out.println("start!");
                setState(STATE_LOGGING);
                break;
            case STATE_LOGGING:
                break;
            default:
                System.out.println("default - "+getState());
        }
    }
    public void stop() {
        switch (getState()) {
            case STATE_STOPPED:
                break;
            case STATE_LOGGING:
                System.out.println("stop!");
                setState(STATE_STOPPED);
                break;
            default:
                System.out.println("default - " + getState());
        }
    }
    public void log(String info) {
        switch (getState()) {
            case STATE_STOPPED:
                System.out.println(info + " - stopped");
                break;
            case STATE_LOGGING:
                System.out.println(info + " - logging");
                break;
            default:
                System.out.println(info + " - " + getState());
        }
    }
}
