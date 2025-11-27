import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class MouseApp extends Frame implements MouseListener
{
String str = "welcome";

public MouseApp(){
addMouseListener(this);
addWindowListener(new WindowAdapter(){
	public void WindowClosing(WindowEvent e){
	System.exit(0); }
});

setSize(400,400);
setVisible(true);
}

public void mousePressed(MouseEvent e1){
str="MOUSE IS PRESSED";
repaint();
}

public void mouseClicked(MouseEvent e2){
str="MOUSE IS CLICKED";
repaint();
}

public void mouseEntered(MouseEvent e3){
str="MOUSE IS ENTERED";
repaint();
}

public void mouseReleased(MouseEvent e4){
str="MOUSE IS RELEASED";
repaint();
}

public void mouseExited(MouseEvent e5){
str="MOUSE IS EXITED";
repaint();
}

public void paint(Graphics g){
g.setFont(new Font("Arial",Font.BOLD,20));
g.drawString(str,100,100);
}

public static void main(String args[]){
MouseApp m1= new MouseApp();
m1.setTitle("Mouse App");
}
}