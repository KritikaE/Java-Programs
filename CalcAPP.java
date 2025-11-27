//program to calculator - with number and operation button - like how it looks in a calculator app

import java.awt.*;
import java.awt.event.*;

public class CalcAPP extends Frame implements ActionListener{

Button num_btn[];
Button ops_btn[];
Button equals;

TextField result;
String op="";
int a,b,c;

public CalcAPP()
{

num_btn = new Button[10]; //10 numbers

Panel p1 = new Panel();

p1.setLayout(new GridLayout(4,4)); //10 nums + 5 operations + 1 =

//set num_btn
for(int i=0; i<10; i++){
num_btn[i]=new Button(String.valueOf(i));
num_btn[i].addActionListener(this);
p1.add(num_btn[i]);
}

//set ops_btn
ops_btn = new  Button[5];
ops_btn[0]=new Button("+");
ops_btn[1]=new Button("-");
ops_btn[2]=new Button("*");
ops_btn[3]=new Button("/");
ops_btn[4]=new Button("%");


for(int i=0; i<5; i++){
ops_btn[i].addActionListener(this);
p1.add(ops_btn[i]);}

equals=new Button("=");
equals.addActionListener(this);
p1.add(equals);

result = new TextField(20);
Panel p2 = new Panel();
p2.setLayout(new BorderLayout());
p2.add(result, BorderLayout.NORTH);

setLayout(new BorderLayout());
add(p2, BorderLayout.NORTH);
add(p1, BorderLayout.CENTER);}

public void actionPerformed(ActionEvent e){
String cmd=e.getActionCommand();

if(cmd.charAt(0)>='0' && cmd.charAt(0)<='9'){
result.setText(result.getText()+cmd);
}
else if(cmd.equals("=")==false){
op=cmd;
a=Integer.parseInt(result.getText());
result.setText("");
}
else{
b=Integer.parseInt(result.getText());
if(op.equals("+"))
	c=a+b;
if(op.equals("-"))
	c=a-b;
if(op.equals("*"))
	c=a*b;
if(op.equals("/"))
	c=a/b;
if(op.equals("%"))
	c=a%b;
result.setText(String.valueOf(c)); 
}
}

public static void main(String args[]){
CalcAPP c1 = new CalcAPP();
c1.setSize(500,500);
c1.setTitle("Calculator");
c1.setVisible(true);
}

} 