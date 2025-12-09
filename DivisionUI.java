import java.awt.*;
import java.awt.event.*;

public class DivisionUI {

    Frame f;
    TextField num1, num2, result;
    Button divide;

    public DivisionUI() {

        f = new Frame("Integer Division");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());

        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        divide = new Button("Divide");

        f.add(new Label("Num1:"));
        f.add(num1);
        f.add(new Label("Num2:"));
        f.add(num2);
        f.add(divide);
        f.add(new Label("Result:"));
        f.add(result);

        // DIVIDE BUTTON ACTION
        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(num1.getText());
                    int b = Integer.parseInt(num2.getText());

                    if (b == 0) {
                        throw new ArithmeticException("Division by Zero!");
                    }

                    int r = a / b;
                    result.setText(String.valueOf(r));

                } catch (NumberFormatException nfe) {
                    showMessage("Please enter valid integers.");
                } catch (ArithmeticException ae) {
                    showMessage("Cannot divide by zero.");
                }
            }
        });

        // window close
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.setVisible(true);
    }

    // SIMPLE MESSAGE DIALOG (AWT)
    void showMessage(String msg) {
        Dialog d = new Dialog(f, "Error", true);
        d.setLayout(new FlowLayout());
        d.setSize(250, 100);

        Label l = new Label(msg);
        Button ok = new Button("OK");

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                d.setVisible(false);
            }
        });

        d.add(l);
        d.add(ok);
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new DivisionUI();
    }
}
