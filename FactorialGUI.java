import java.awt.*;
import java.awt.event.*;

public class FactorialGUI {

    Frame f;
    TextField input, output;
    Button compute;

    public FactorialGUI() {

        f = new Frame("Factorial Calculator");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());

        input = new TextField(10);
        output = new TextField(10);
        output.setEditable(false);

        compute = new Button("Compute");

        f.add(new Label("Enter Number:"));
        f.add(input);
        f.add(compute);
        f.add(new Label("Factorial:"));
        f.add(output);

        // Button Action
        compute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(input.getText());
                    int fact = 1;

                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }

                    output.setText(String.valueOf(fact));

                } catch (Exception ex) {
                    output.setText("Invalid Input");
                }
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FactorialGUI();
    }
}
