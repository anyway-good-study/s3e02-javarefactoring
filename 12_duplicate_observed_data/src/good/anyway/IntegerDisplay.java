package good.anyway;

import java.awt.*;
import java.awt.event.*;

public class IntegerDisplay extends Frame implements ActionListener, ValueListener {
    private final Label octalLabel = new Label("0");
    private final Label decimalLabel = new Label("0");
    private final Label hexadecimalLebel = new Label("0");
    private final Button incrementButton = new Button("+");
    private final Button decrementButton = new Button("-");

    private final Graph graphCircle = Graph.createGraph(Graph.CIRCLE, 100, 100);
    private final Graph graphRectangle = Graph.createGraph(Graph.RECTANGLE, 100, 50);

    private Value value = new Value(0);

    public IntegerDisplay() {
        super("IntegerDisplay");

        Panel panel = new Panel(new GridLayout(4, 2));
        panel.add(new Label("Octal:"));
        panel.add(octalLabel);
        panel.add(new Label("Decimal:"));
        panel.add(decimalLabel);
        panel.add(new Label("Hexadecimal:"));
        panel.add(hexadecimalLebel);
        panel.add(incrementButton);
        panel.add(decrementButton);

        add(panel, BorderLayout.NORTH);
        add(graphCircle, BorderLayout.CENTER);
        add(graphRectangle, BorderLayout.SOUTH);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);

        this.value.addValueListener(this);

        value.addValueListener(graphCircle);
        value.addValueListener(graphRectangle);

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
    }

    public void valueChanged(ValueChangeEvent e) {
        if (e.getSource() == value) {
            this.octalLabel.setText(Integer.toString(this.value.getValue(), 8));
            this.decimalLabel.setText(Integer.toString(this.value.getValue(), 10));
            this.hexadecimalLebel.setText(Integer.toString(this.value.getValue(), 16));
        }
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
