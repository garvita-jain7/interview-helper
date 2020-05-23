package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class SENIOR implements ActionListener {

		TableColumnModel columnModel;
		JLabel l71;
		JTable t;
		int num;
		JFrame fsen;
		JButton b20,b21,back7;
		JPanel psen;
		DefaultTableModel model;
		Connection con=new connection().get_connection();
		SENIOR(){
			SENIORFRAME();
			fsen.setVisible(true);
			}
/************************************************************************************************/	
		public void SENIORFRAME(){
			fsen=new JFrame("SENIOR SECTION");
	    	
	    	l71= new JLabel("Select your choice: "); 
			l71.setFont(l71.getFont ().deriveFont (40.0f));//Label Size
			l71.setForeground(Color.white);//Font color 
			b20=new JButton("See the ratings"); 
			b21=new JButton("Add questions");  
			back7=new JButton("Back..");
			
			l71.setBounds(125,10,750,50);
			l71.setFont(new Font("Arial", Font.ITALIC, 30));
			
			b20.setBounds(125,70,250,50); 
			int Rb1 = (int)(Math.random( )*256);
			int Gb1 = (int)(Math.random( )*256); 
			int Bb1 = (int)(Math.random( )*256); 
			Color buttoncolor1 = new Color(246, 70, 104);
			b20.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
			b20.setForeground(Color.white);
			b20.setBackground(buttoncolor1);
			b21.setBounds(125,140,250,50);
			b21.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
			b21.setForeground(Color.white);
			b21.setBackground(buttoncolor1);
			back7.setBounds(300,210,120,30);
	    	
	    	int Rbg = (int) (Math.random( )*256);
			int Gbg = (int)(Math.random( )*256);
			int Bbg= (int)(Math.random( )*256);
			Color bgcolor1 = new Color(65, 67, 106);
			fsen.add(l71);fsen.add(back7);
			fsen.add(b20);fsen.add(b21);
			
			b20.addActionListener(this);
			b21.addActionListener(this);
			back7.addActionListener(this);
			
			JPanel psen=new JPanel();
			psen.setSize(500,350);
			psen.setBackground(bgcolor1);
			fsen.add(psen);
			
			fsen.setSize(500,300);
			fsen.setLayout(null);
		}
/************************************************************************************************/			
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b20)		//Response of see the rating Button Click
			{
				new SEERATING();
				fsen.setVisible(false);	//make senior page invisible
						
			}
	/************************************************************************************************/
			else if(e.getSource()==b21)		//Response of add question Button Click
			{
				new QUESTIONS();
				fsen.setVisible(false);	//make senior page invisible
						
			}
	/************************************************************************************************/
			else if(e.getSource()==back7)		//Response of back Button Click
			{
				new DP_MP();			//back to home frame
				fsen.setVisible(false);	//make senior page invisible
						
			}
	/************************************************************************************************/
	}
}




