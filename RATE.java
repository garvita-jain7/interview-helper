package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class RATE implements ActionListener {					//class for rate frame

		JLabel l61,l62,l63,l64,l65,l66,l67,l68;
		JFrame frate;
		JButton bsave,back6;
		JPanel prate;
		JTextField t1,t2,t3;
		Connection con=new connection().get_connection();
		RATE(){
			RATEFRAME();
			frate.setVisible(true);	
		}
/************************************************************************************************/	
		public void RATEFRAME(){
			frate=new JFrame("RATE US!!");
			
			  l61= new JLabel("HELP  US  IMPROVE"); 
			  l61.setFont(l61.getFont ().deriveFont (40.0f));//Label Size
			  l61.setForeground(Color.white);//Font color
			  
			  l62= new JLabel("How was your experience ?"); 
			  l62.setFont(l62.getFont ().deriveFont (40.0f));//Label Size
			  l62.setForeground(Color.white);//Font color 
			  
			  l63= new JLabel("(Excellent/ Good/ Okay/ Bad/ Very Bad)"); 
			  l63.setFont(l63.getFont ().deriveFont (20.0f));//Label Size
			  l63.setForeground(Color.white);//Font color
			  
			  l64= new JLabel("How much would you like to rate us?"); 
			  l64.setFont(l64.getFont ().deriveFont (40.0f));//Label Size
			  l64.setForeground(Color.white);//Font color
			  
			  l65= new JLabel("(Out of 10)"); 
			  l65.setFont(l65.getFont ().deriveFont (20.0f));//Label Size
			  l65.setForeground(Color.white);//Font color 
			  
			  l66= new JLabel("Any Suggestions?"); 
			  l66.setFont(l66.getFont ().deriveFont (40.0f));//Label Size
			  l66.setForeground(Color.white);//Font color
			  
			  l67= new JLabel("(If nothing, please write a no)"); 
			  l67.setFont(l67.getFont ().deriveFont (20.0f));//Label Size
			  l67.setForeground(Color.white);//Font color
			  
			  l68= new JLabel("(Do not exceed 400 characters.)"); 
			  l68.setFont(l68.getFont ().deriveFont (20.0f));//Label Size
			  l68.setForeground(Color.white);//Font color 
			  
			  t1=new JTextField();t2=new JTextField();t3=new JTextField();
			  bsave= new JButton("Save...");
			  back6=new JButton("Back..");
			  
			  
			  l61.setBounds(325,20,750,60);
			  l61.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
			  l61.setForeground(Color.yellow); 
			  
			  l62.setBounds(50,90,750,40);
			  l62.setFont(new Font("Arial", Font.ITALIC, 25));
			  l62.setForeground(Color.white); 
			  
			  l63.setBounds(50,140,750,30);
			  l63.setFont(new Font("Arial", Font.ITALIC, 15));
			  l63.setForeground(Color.white); 
			  
			  l64.setBounds(50,230,750,40);
			  l64.setFont(new Font("Arial", Font.ITALIC, 25));
			  l64.setForeground(Color.white); 
			  
			  l65.setBounds(50,280,750,30);
			  l65.setFont(new Font("Arial", Font.ITALIC, 15));
			  l65.setForeground(Color.white); 
			  
			  l66.setBounds(50,370,750,40);
			  l66.setFont(new Font("Arial", Font.ITALIC, 25));
			  l66.setForeground(Color.white); 
			  
			  l67.setBounds(50,420,750,30);
			  l67.setFont(new Font("Arial", Font.ITALIC, 15));
			  l67.setForeground(Color.white); 
			  
			  l68.setBounds(50,445,750,30);
			  l68.setFont(new Font("Arial", Font.ITALIC, 15));
			  l68.setForeground(Color.white); 
			  t1.setBounds(555,105,300,50);
			  t2.setBounds(555,240,300,50);
			  t3.setBounds(555,385,300,50);
			  bsave.setBounds(750, 465, 180, 35);
			  back6.setBounds(750,510,180,35);
			  
			  frate.add(l61);frate.add(l62);frate.add(l63);frate.add(l64);
			  frate.add(l65);frate.add(l66);frate.add(l67);frate.add(l68);
			  frate.add(back6);frate.add(bsave);frate.add(t1);frate.add(t2);frate.add(t3);
			  bsave.addActionListener(this);
			  back6.addActionListener(this);
			 
			
			int Rbg = (int) (Math.random( )*256);
			int Gbg = (int)(Math.random( )*256);
			int Bbg= (int)(Math.random( )*256);
			Color bgcolor1 = new Color(65, 67, 106);
			
			
			JPanel prate=new JPanel();
			prate.setSize(1000,600);
			prate.setBackground(bgcolor1);
			frate.add(prate);
			
			frate.setSize(1000,600);
			frate.setLayout(null);
		}
/************************************************************************************************/			
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bsave) {                  //save the data to the table rating in the database
				try {
					PreparedStatement stmt=con.prepareStatement("insert into rating values(?,?,?)");
					stmt.setString(1, t1.getText());
					stmt.setInt(2, Integer.parseInt(t2.getText()));
					stmt.setString(3, t3.getText());
					stmt.executeUpdate();
					
				} catch (SQLException e1) {e1.printStackTrace();JOptionPane.showMessageDialog(null, "....");}
				
			}
	/************************************************************************************************/			
			else if(e.getSource()==back6) {
				frate.setVisible(false);		//make rate page invisible
				new DP_MP();
			}
	/************************************************************************************************/
			
		}

}



