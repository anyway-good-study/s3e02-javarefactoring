package good.anyway;

import java.awt.*;
import java.awt.event.*;

public class IntegerDisplay extends Frame implements ActionListener {
    private final Label octalLabel = new Label("0");
    private final Label decimalLabel = new Label("0");
    private final Label hexadecimalLebel = new Label("0");
    private final Button incrementButton = new Button("+");
    private final Button decrementButton = new Button("-");

    private Value value = new Value(0);

    public IntegerDisplay() {
        super("IntegerDisplay");

        setLayout(new GridLayout(4, 2));
        add(new Label("Octal:"));
        add(octalLabel);
        add(new Label("Decimal:"));
        add(decimalLabel);
        add(new Label("Hexadecimal:"));
        add(hexadecimalLebel);
        add(incrementButton);
        add(decrementButton);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        pack();
        setVisible(true);
    }

    public void setValue(int value) {
        this.value.setValue(value);
        this.octalLabel.setText(Integer.toString(this.value.getValue(), 8));
        this.decimalLabel.setText(Integer.toString(this.value.getValue(), 10));
        this.hexadecimalLebel.setText(Integer.toString(this.value.getValue(), 16));

    }

    public void valueChanged(ValueChangeEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            setValue(this.value.getValue() + 1);
        } else if (e.getSource() == decrementButton) {
            setValue(this.value.getValue() -1);
        }
    }
}
