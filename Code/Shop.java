import javax.swing.*;
import java.awt.event.*;

public class Shop {
	JFrame frame = new JFrame("DBMS");
	JLabel txt,q1;
	JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,exit,btnrvw,btninv,btncust,addinv,addcust,addrvw;
	JLabel f1,f2,f3,f4,f5,f6,f7,f8,f9,f0;
	
	Shop()
	{
		txt = new JLabel("QUERIES");
		frame.setSize(1100,700);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(txt);
		txt.setBounds(450,30,80,20);
		f1=new JLabel("Query2");
		f2=new JLabel("Query3");
		f3=new JLabel("Query4");
		f4=new JLabel("Query5");
		f5=new JLabel("Query6");
		f6=new JLabel("Query7");
		f7=new JLabel("Query8");
		f8=new JLabel("Query9");
		f9=new JLabel("Query10");
		f0=new JLabel("Query1");
		btn1=new JButton("View");
		btn2=new JButton("View");
		btn3=new JButton("View");
		btn4=new JButton("View");
		btn5=new JButton("View");
		btn6=new JButton("View");
		btn7=new JButton("View");
		btn8=new JButton("View");
		btn9=new JButton("View");
		btn0=new JButton("View");
		exit=new JButton("EXIT");
		addinv=new JButton("Add Inventory");
		addcust=new JButton("Add Customer");
		addrvw=new JButton("Add Review");
		btninv=new JButton("View Inventory");
		btnrvw=new JButton("View Reviews");
		btncust=new JButton("View Customer");
		f0.setBounds(200,100,600,20);
		btn0.setBounds(800,100,70,20);
		f1.setBounds(200,150,600,20);
		btn1.setBounds(800,150,70,20);
		f2.setBounds(200,200,600,20);
		btn2.setBounds(800,200,70,20);
		f3.setBounds(200,250,600,20);
		btn3.setBounds(800,250,70,20);
		f4.setBounds(200,300,600,20);
		btn4.setBounds(800,300,70,20);
		f5.setBounds(200,350,600,20);
		btn5.setBounds(800,350,70,20);
		f6.setBounds(200,400,600,20);
		btn6.setBounds(800,400,70,20);
		f7.setBounds(200,450,600,20);
		btn7.setBounds(800,450,70,20);
		f8.setBounds(200,500,600,20);
		btn8.setBounds(800,500,70,20);
		f9.setBounds(200,550,600,20);
		btn9.setBounds(800,550,70,20);
		exit.setBounds(500,650,100,20);
		btncust.setBounds(50,600,150,20);
		btninv.setBounds(200,600,150,20);
		btnrvw.setBounds(350,600,150,20);
		addcust.setBounds(600,600,150,20);
		addinv.setBounds(750,600,150,20);
		addrvw.setBounds(900,600,150,20);
		frame.add(btn1);
		frame.add(f1);
		frame.add(btn2);
		frame.add(f2);
		frame.add(btn3);
		frame.add(f3);
		frame.add(btn4);
		frame.add(f4);
		frame.add(btn5);
		frame.add(f5);
		frame.add(btn6);
		frame.add(f6);
		frame.add(btn7);
		frame.add(f7);
		frame.add(btn8);
		frame.add(f8);
		frame.add(btn9);
		frame.add(f9);
		frame.add(btn0);
		frame.add(f0);
		frame.add(exit);
		frame.add(btnrvw);
		frame.add(btncust);
		frame.add(btninv);
		frame.add(addcust);
		frame.add(addinv);
		frame.add(addrvw);
		
		Insert i = new Insert();
		addinv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				i.addinventory();
			}
		});
		addcust.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				i.addcustomer();
			}
		});
		addrvw.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				i.addreview();
			}
		});
		
		query0 q=new query0();
		btnrvw.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.viewrvw();	
			}
		});
		btncust.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.viewcust();
			}
		});
		btninv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.viewinv();
			}
		});
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		btn0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query0();
			}
		});
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query1();
			}
		});
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query2();
			}
		});
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query3();
			}
		});
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query4();
			}
		});
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query5();
			}
		});
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query6();
			}
		});
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query7();
			}
		});
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				q.query8();
			}
		});
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//q.query9();
				String s="select history.order_id,order_details.delivery_date,order_details.quantity,order_details.product_id,order_details.address,review.rating,review.price from history join order_details on history.order_id=order_details.order_id join review on review.order_id=history.order_id;"; 
                new sql0(s,7);
			}
		});
	}
}