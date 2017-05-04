import java.awt.event.*;
import javax.swing.*;

public class Welcome_Screen {
	JFrame frame = new JFrame("DBMS");
	JLabel label;
	JButton shop, exit;
	
	Welcome_Screen()
	{
		label = new JLabel("Welcome To Amazon..");
		shop = new JButton("Shop");
		exit = new JButton("Exit");
		
		frame.setSize(1000,600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setVisible(true);
		frame.add(label);
		frame.add(shop);
		frame.add(exit);
		label.setBounds(425,150,250,50);
		shop.setBounds(470,280,80,30);
		exit.setBounds(470,350,80,30);
		
		shop.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new Shop();
				frame.dispose();
            }
        });
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
            }
        });
	}
}