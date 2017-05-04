import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class query0 {
    JFrame frame;
    JLabel heading,h1,h2,label1,label2;
    JTextField t1,t2;
    JButton b1;
    public void query0()
    {
    	frame = new JFrame("Query1");
        frame.setSize(450,230);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(50,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("(items/supplier_id/supplier_name)");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,250,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        h2=new JLabel("Price     <");
        t2=new JTextField();
        h2.setBounds(50,130,80,20);
        t2.setBounds(150,130,250,20);
        b1=new JButton("View");
        b1.setBounds(150,180,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                String s="Select "+s1+",price,product_id From inventory Where price < "+s2+";";
                new sql0(s,3);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(h2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.setVisible(true);

    }
    
    public void query1()
    {
    	frame = new JFrame("Query2");
    	frame.setSize(450,230);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(50,30,250,20);
        h1=new JLabel("Criteria");
        label1 = new JLabel("price/product_id/order_id");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,250,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        h2=new JLabel("Rating     >");
        t2=new JTextField();
        h2.setBounds(50,130,80,20);
        t2.setBounds(150,130,250,20);
        b1=new JButton("View");
        b1.setBounds(150,180,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                String s="Select "+s1+" From review Where rating > "+s2+";";
                new sql0(s,1);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(h2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query2()
    {
    	frame = new JFrame("Query3");
    	frame.setSize(650,180);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("order_date/delivery_date/quantity/product_id/order_id/address");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,500,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        b1=new JButton("View");
        b1.setBounds(150,130,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s="Select "+s1+" From order_details;";
                new sql0(s,1);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(t1);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query3()
    {
    	frame = new JFrame("Query4");
    	frame.setSize(500,260);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria 1");
        label1=new JLabel("name/dob/email/uname/password/address");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,300,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        h2=new JLabel("Criteria 2");
        label2=new JLabel("rating/price/product_id/order_id");
        label2.setForeground(Color.LIGHT_GRAY);
        t2=new JTextField();
        h2.setBounds(50,130,80,20);
        label2.setBounds(150,150,250,20);
        t2.setBounds(150,130,250,20);
        b1=new JButton("View");
        b1.setBounds(180,190,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                String s="Select c."+s1+",r."+s2+" From customer as c,review as r Where c.order_id=r.order_id;";
                new sql0(s,2);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(h2);
        frame.add(label2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query4()
    {
    	frame = new JFrame("Query5");
    	frame.setSize(450,180);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("order_id/delivery_date/product_id");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,250,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        b1=new JButton("View");
        b1.setBounds(150,130,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s="Select * From history;";
                new sql0(s,3);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(t1);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query5()
    {
    	frame = new JFrame("Query6");
    	frame.setSize(550,210);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("items/price/product_id/supplier_id/supplier_name");
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,350,20);
        label1.setForeground(Color.LIGHT_GRAY);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        b1=new JButton("View");
        b1.setBounds(150,140,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s="Select * From inventory Order by "+s1+";";
                new sql0(s,5);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(t1);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query6()
    {
    	frame = new JFrame("Query7");
    	frame.setSize(580,260);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("name/dob/email/uname/password/address/order_id");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,400,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        h2=new JLabel("Count     >");
        t2=new JTextField();
        h2.setBounds(50,130,80,20);
        t2.setBounds(150,130,250,20);
        b1=new JButton("View");
        b1.setBounds(180,190,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=t2.getText();
                String s="Select "+s1+" From customer group by uname Having COUNT(*)> "+s2+" ;"; 
                new sql0(s,1);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(h2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query7()
    {
    	frame = new JFrame("Query8");
    	frame.setSize(500,190);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("name/dob/email/uname/password/address");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,400,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        b1=new JButton("View");
        b1.setBounds(150,140,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s="Select c."+s1+",review.rating,review.price,review.order_id From customer as c Inner Join review On c.order_id=review.order_id ;"; 
                new sql0(s,4);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(t1);
        frame.add(b1);
        frame.setVisible(true);
    }
    
    public void query8()
    {
    	frame = new JFrame("Query9");
    	frame.setSize(550,190);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(100,30,250,20);
        h1=new JLabel("Criteria");
        label1=new JLabel("name/dob/email/uname/password/address/order_id");
        label1.setForeground(Color.LIGHT_GRAY);
        t1=new JTextField();
        h1.setBounds(50,80,80,20);
        label1.setBounds(150,100,400,20);
        t1.setBounds(150,80,250,20);
        t1.setColumns(10);
        b1=new JButton("View");
        b1.setBounds(150,140,100,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s="Select c."+s1+",order_details.order_date,order_details.delivery_date,order_details.product_id,shipping.type from customer as c Join order_details ON c.order_id=order_details.order_id Join shipping On shipping.order_id=c.order_id;"; 
                new sql0(s,5);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(h1);
        frame.add(label1);
        frame.add(t1);
        frame.add(b1);
        frame.setVisible(true);
    }
    /*
    public void query9()
    {
    	frame = new JFrame("Query10");
    	frame.setSize(800,400);
        frame.setLayout(null);
        heading=new JLabel(" FILTER OUT ON WHAT CRITERIA");
        heading.setBounds(200,50,300,60);
        h1=new JLabel("Criteria");
        t1=new JTextField();
        h1.setBounds(100,100,160,30);
        t1.setBounds(180,100,160,30);
        t1.setColumns(10);
        h2=new JLabel("Value");
        t2=new JTextField();
        h2.setBounds(100,200,160,30);
        t2.setBounds(180,200,160,30);
        b1=new JButton("View");
        b1.setBounds(200,300,70,20);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //String s1=t1.getText();
                //String s2=t2.getText();
                String s="select history.order_id,order_details.delivery_date,order_details.quantity,order_details.product_id,order_details.address,review.rating,review.price from history join order_details on history.order_id=order_details.order_id join review on review.order_id=history.order_id;"; 
                new sql0(s,7);
                frame.dispose();
            }
        });
        frame.add(heading);
        frame.add(b1);
        frame.setVisible(true);
    }*/
    
    public void viewrvw()
    {
    	String s="Select * From review;";
        new sql0(s,4);
    }
    public void viewinv()
    {
    	String s="Select * From inventory;";
        new sql0(s,4);
    }
    public void viewcust()
    {
    	String s="Select * From customer;";
        new sql0(s,6);
    }
    
}