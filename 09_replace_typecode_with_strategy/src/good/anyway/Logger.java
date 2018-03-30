package good.anyway;

public class Logger {
    public static final int STATE_STOPPED = 0;
    public static final int STATE_LOGGING = 1;

    private int _state;

    public Logger() {
        _state = STATE_STOPPED;
    }

    public void start() {
        switch (_state) {
        case STATE_STOPPED:
            System.out.println("start!");
            _state = STATE_LOGGING;
            break;
        case STATE_LOGGING:
            break;
        default:
            System.out.println("???? - "+_state);
        }
    }

    public void stop() {
        switch (_state) {
        case STATE_STOPPED:
            break;
        case STATE_LOGGING:
            System.out.println("stop!");
            _state = STATE_STOPPED;
            break;
        default:
            System.out.println("default - " + _state);
        }
    }

    public void log(String info) {
        switch (_state) {
        case STATE_STOPPED:
            System.out.println(info + " - stopped");
            break;
        case STATE_LOGGING:
            System.out.println(info + " - logging");
            break;
        default:
            System.out.println(info + " - " + _state);
        }
    }
}
