package good.anyway;

import java.util.ArrayList;
import java.util.List;

public class Value {
    private int value = 0;
    private final List<ValueListener> listeners;

    public Value(int value) {
        this.value = value;
        this.listeners = new ArrayList<>();
    }

    public void setValue(int value) {
        this.value = value;
        notifyToListners();
    }

    private void notifyToListners() {
        for (ValueListener listener: listeners) {
            listener.valueChanged(new ValueChangeEvent(this));
        }
    }
    public int getValue() {
        return this.value;
    }

    public void addValueListener(ValueListener listener) {
        this.listeners.add(listener);
    }
}
