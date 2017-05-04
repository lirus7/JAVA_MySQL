import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Insert {
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6,l7,label1,label2;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b;
	Insertquery iq = new Insertquery();
	
	public void addinventory()
	{
		frame = new JFrame("Insert Inventory");
		frame.setSize(450,330);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		l1 = new JLabel("No of Items");
		l2 = new JLabel("Price");
		l3 = new JLabel("Product ID (int)");
		l4 = new JLabel("Supplier ID (int)");
		l5 = new JLabel("Supplier Name");
		label1 = new JLabel("* All fields are required.");
		label2 = new JLabel("Insert \"NULL\" if field is empty.");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		b = new JButton("Insert");
		
		frame.add(l1);
		l1.setBounds(50,50,150,20);
		frame.add(t1);
		t1.setBounds(200,50,200,20);
		frame.add(l2);
		l2.setBounds(50,80,150,20);
		frame.add(t2);
		t2.setBounds(200,80,200,20);
		frame.add(l3);
		l3.setBounds(50,110,150,20);
		frame.add(t3);
		t3.setBounds(200,110,200,20);
		frame.add(l4);
		l4.setBounds(50,140,150,20);
		frame.add(t4);
		t4.setBounds(200,140,200,20);
		frame.add(l5);
		l5.setBounds(50,170,150,20);
		frame.add(t5);
		t5.setBounds(200,170,200,20);
		
		frame.add(label1);
		label1.setForeground(Color.RED);
		label1.setBounds(150,210,300,20);
		frame.add(label2);
		label2.setBounds(130,230,300,20);
		label2.setForeground(Color.RED);
		frame.add(b);
		b.setBounds(175,270,100,20);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				iq.insertinv(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()),t5.getText());
				frame.dispose();
			}
		});
	}
	
	public void addcustomer()
	{
		frame = new JFrame("Insert Customer");
		frame.setSize(450,390);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		l1 = new JLabel("Name");
		l2 = new JLabel("Date of Birth");
		l3 = new JLabel("Email");
		l4 = new JLabel("Username");
		l5 = new JLabel("Password");
		l6 = new JLabel("Address");
		l7 = new JLabel("Order ID (int)");
		label1 = new JLabel("* All fields are required.");
		label2 = new JLabel("Insert \"NULL\" if field is empty.");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		b = new JButton("Insert");
		
		frame.add(l1);
		l1.setBounds(50,50,150,20);
		frame.add(t1);
		t1.setBounds(200,50,200,20);
		frame.add(l2);
		l2.setBounds(50,80,150,20);
		frame.add(t2);
		t2.setBounds(200,80,200,20);
		frame.add(l3);
		l3.setBounds(50,110,150,20);
		frame.add(t3);
		t3.setBounds(200,110,200,20);
		frame.add(l4);
		l4.setBounds(50,140,150,20);
		frame.add(t4);
		t4.setBounds(200,140,200,20);
		frame.add(l5);
		l5.setBounds(50,170,150,20);
		frame.add(t5);
		t5.setBounds(200,170,200,20);
		frame.add(l6);
		l6.setBounds(50,200,150,20);
		frame.add(t6);
		t6.setBounds(200,200,200,20);
		frame.add(l7);
		l7.setBounds(50,230,150,20);
		frame.add(t7);
		t7.setBounds(200,230,200,20);
		
		frame.add(label1);
		label1.setForeground(Color.RED);
		label1.setBounds(150,270,300,20);
		frame.add(label2);
		label2.setBounds(130,290,300,20);
		label2.setForeground(Color.RED);
		frame.add(b);
		b.setBounds(175,330,100,20);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				iq.insertcust(t1.getText(),t2.getText(),t3.getText(),t4.getText(),t5.getText(),t6.getText(),Integer.parseInt(t7.getText()));
				frame.dispose();
			}
		});
	}
	
	public void addreview()
	{
		frame = new JFrame("Insert Review");
		frame.setSize(450,320);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setResizable(false);
		l1 = new JLabel("Rating");
		l2 = new JLabel("Price");
		l3 = new JLabel("Product ID (int)");
		l4 = new JLabel("Order ID (int)");
		label1 = new JLabel("* All fields are required.");
		label2 = new JLabel("Insert \"NULL\" if field is empty.");
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		b = new JButton("Insert");
		
		frame.add(l1);
		l1.setBounds(50,50,150,20);
		frame.add(t1);
		t1.setBounds(200,50,200,20);
		frame.add(l2);
		l2.setBounds(50,80,150,20);
		frame.add(t2);
		t2.setBounds(200,80,200,20);
		frame.add(l3);
		l3.setBounds(50,110,150,20);
		frame.add(t3);
		t3.setBounds(200,110,200,20);
		frame.add(l4);
		l4.setBounds(50,140,150,20);
		frame.add(t4);
		t4.setBounds(200,140,200,20);
		
		frame.add(label1);
		label1.setForeground(Color.RED);
		label1.setBounds(150,180,300,20);
		frame.add(label2);
		label2.setBounds(130,200,300,20);
		label2.setForeground(Color.RED);
		frame.add(b);
		b.setBounds(175,260,100,20);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				iq.insertrvw(Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),Integer.parseInt(t3.getText()),Integer.parseInt(t4.getText()));
				frame.dispose();
			}
		});
	}
}
