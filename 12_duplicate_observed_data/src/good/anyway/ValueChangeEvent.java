package good.anyway;

public class ValueChangeEvent {
    private final Value source;

    public ValueChangeEvent(Value source) {
        this.source = source;
    }

    public Value getSource() {
        return source;
    }
}
