import javax.swing.*;
import java.awt.*;

public class FileEx extends JFrame
{
public FileEx()
{
String filePath = "table.txt";
try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(filePath)))
{
String line;
while((line = br.readLine()) != null)
{
String[] values = line.split(",");
for(String value : values)
{
JLabel l1 = new JLabel(value);
add(l1);
}
setLayout(new GridLayout(0, values.length));
}
}
catch(java.io.IOException e)
{
e.printStackTrace();
}
setTitle("File Reader");
setSize(400, 300);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
}
public static void main(String s[])
{
new FileEx().setVisible(true);
}
}