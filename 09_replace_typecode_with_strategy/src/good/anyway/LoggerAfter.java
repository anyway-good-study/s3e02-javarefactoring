package good.anyway;

public class LoggerAfter extends Logger{
    private enum State {
        STOPPED {
            @Override public void start() {
                System.out.println("start!");
            }
            @Override public void stop() {}
            @Override public void log(String info) {
                System.out.println(info + " - stopped");
            }
        },

        LOGGING {
            @Override public void start() {}
            @Override public void stop() {
                System.out.println("stop!");
            }
            @Override public void log(String info) {
                System.out.println(info + " - logging");
            }
        };

        public abstract void start();
        public abstract void stop();
        public abstract void log(String info);
    }

    private State _state;

    public LoggerAfter() {
        setState(State.STOPPED);
    }

    public void setState(State state) {
        _state = state;
    }

    public void start() {
        _state.start();
        setState(State.LOGGING);
    }

    public void stop() {
        _state.stop();
        setState(State.STOPPED);
    }

    public void log(String info) {
        _state.log(info);
    }
}
