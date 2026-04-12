import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame implements ActionListener{

	TextField t1,t2,t3;// reference
	Button b1,b2,b3,b4,b5,b6;
	Label l1,l2,l3;
	int a,b,c;
	String s1,s2,s3;

	MyFrame(String str)
	{
		t1=new TextField(20);// initialization
		t2=new TextField(20);
		t3=new TextField(20);

		b1=new Button("Add");
		b2=new Button("Subtract");
		b3=new Button("Multiply");
		b4=new Button("Division");
		b5=new Button("Modulus");
		b6=new Button("Exit");

		l1=new Label("Enter first number");
		l2=new Label("Enter second number");
		l3=new Label("Output");

		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==b1){
				s1=t1.getText();
				s2=t2.getText();
				a=Integer.parseInt(s1);
				b=Integer.parseInt(s2);
				c=a+b;
				s3=""+c;
				t3.setText(s3);
			}
		}
}
class TestFrame{
	public static void main(String ar[]){
		MyFrame obj=new MyFrame("Calculator");
		obj.setSize(500,500);
		obj.setVisible(true);
		obj.setLayout(new FlowLayout());
	}
}