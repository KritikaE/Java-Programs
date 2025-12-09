import java.awt.*;
import java.awt.event.*;

public class TrafficLightAWT {

    Frame f;
    Label msg;
    Checkbox red, yellow, green;
    CheckboxGroup group;

    public TrafficLightAWT() {

        f = new Frame("Traffic Light");
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());

        msg = new Label("");
        msg.setFont(new Font("Arial", Font.BOLD, 20));
        f.add(msg);

        group = new CheckboxGroup();
        red = new Checkbox("Red", group, false);
        yellow = new Checkbox("Yellow", group, false);
        green = new Checkbox("Green", group, false);

        f.add(red);
        f.add(yellow);
        f.add(green);


        red.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                msg.setText("STOP");
                msg.setForeground(Color.RED);
            }
        });

        yellow.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                msg.setText("READY");
                msg.setForeground(Color.ORANGE);
            }
        });

        green.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                msg.setText("GO");
                msg.setForeground(Color.GREEN);
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

    public static void main(String[] args) {
        new TrafficLightAWT();   // main only creates object
    }
}
