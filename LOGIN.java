package Mini_project;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class LOGIN implements ActionListener {
	
		JFrame flogin;
		JPasswordField tf2;
		JTextField tf1;
		JButton b1;
		JLabel l1,l2,l3;
		LOGIN()
		{	flogin=new JFrame("Login Page");
			tf1=new JTextField();
			tf2=new JPasswordField();
			
			l1=new JLabel("User ID");
			l2=new JLabel("Password");
			l3=new JLabel();
			
			l1.setBounds(50,50,80,20);
			l2.setBounds(50,90,80,20);
			l3.setBounds(50,170,280,20);
			
			tf1.setBounds(150,50,150,20);
			tf2.setBounds(150,90,150,20);
			b1=new JButton("Login");		
			b1.setBounds(150,130,150,30);
			flogin.add(tf1);
			flogin.add(tf2);
			flogin.add(l1);
			flogin.add(l2);
			flogin.add(l3);
			b1.addActionListener(this);
			flogin.add(b1);
			flogin.setSize(400,250);
			flogin.setLayout(null);
			flogin.setVisible(true);
		}
		public void actionPerformed(ActionEvent e)
		{
			String r=tf1.getText();
			r+=new String (tf2.getPassword());
			if(r.equals("PICTPICT"))                             //user id + password
				{flogin.setVisible(false);
				new SENIOR();}
			else
			l3.setText("Try User ID: PICT, Password: SAME");
		}
}

