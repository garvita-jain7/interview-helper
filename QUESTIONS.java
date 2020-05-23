package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class QUESTIONS implements ActionListener {

		JLabel l91,l92,l93,l94,l95;
		JFrame fiq;
		JButton bsave,back9;
		JPanel piq;
		JTextField t1,t2,t3,t4;
		Connection con=new connection().get_connection();
		QUESTIONS(){
			QUESTIONSFRAME();
			fiq.setVisible(true);	
		}
/************************************************************************************************/	
		public void QUESTIONSFRAME(){
			fiq=new JFrame("RATE US!!");
			
			  l91= new JLabel("INSERT QUESTION"); 
			  l91.setFont(l91.getFont ().deriveFont (40.0f));//Label Size
			  l91.setForeground(Color.white);//Font color
			  
			  l92= new JLabel("Company Code"); 
			  l92.setFont(l92.getFont ().deriveFont (40.0f));//Label Size
			  l92.setForeground(Color.white);//Font color 
			  
			  l93= new JLabel("Company Name"); 
			  l93.setFont(l93.getFont ().deriveFont (20.0f));//Label Size
			  l93.setForeground(Color.white);//Font color
			  
			  l94= new JLabel("Sr. No."); 
			  l94.setFont(l94.getFont ().deriveFont (40.0f));//Label Size
			  l94.setForeground(Color.white);//Font color
			  
			  l95= new JLabel("Question"); 
			  l95.setFont(l95.getFont ().deriveFont (20.0f));//Label Size
			  l95.setForeground(Color.white);//Font color 
			  
			  t1=new JTextField();t2=new JTextField();t3=new JTextField();t4=new JTextField();
			  bsave= new JButton("Save...");
			  back9=new JButton("Back..");
			  
			  
			  l91.setBounds(325,20,750,60);
			  l91.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
			  l91.setForeground(Color.yellow); 
			  
			  l92.setBounds(50,95,750,40);
			  l92.setFont(new Font("Arial", Font.ITALIC, 25));
			  l92.setForeground(Color.white); 
			  
			  l93.setBounds(50,185,750,40);
			  l93.setFont(new Font("Arial", Font.ITALIC, 25));
			  l93.setForeground(Color.white); 
			  
			  l94.setBounds(50,275,750,40);
			  l94.setFont(new Font("Arial", Font.ITALIC, 25));
			  l94.setForeground(Color.white); 
			  
			  l95.setBounds(50,365,750,40);
			  l95.setFont(new Font("Arial", Font.ITALIC, 25));
			  l95.setForeground(Color.white); 
			  
			  t1.setBounds(555,95,300,50);
			  t2.setBounds(555,185,300,50);
			  t3.setBounds(555,275,300,50);
			  t4.setBounds(555,365,300,50);
			  bsave.setBounds(750, 465, 180, 35);
			  back9.setBounds(750,510,180,35);
			  
			  fiq.add(l91);fiq.add(l92);fiq.add(l93);fiq.add(l94);fiq.add(l95);
			  fiq.add(back9);fiq.add(bsave);fiq.add(t1);fiq.add(t2);fiq.add(t3);fiq.add(t4);
			  bsave.addActionListener(this);
			  back9.addActionListener(this);
			 
			
			int Rbg = (int) (Math.random( )*256);
			int Gbg = (int)(Math.random( )*256);
			int Bbg= (int)(Math.random( )*256);
			Color bgcolor1 = new Color(65, 67, 106);
			
			
			JPanel piq=new JPanel();
			piq.setSize(1000,600);
			piq.setBackground(bgcolor1);
			fiq.add(piq);
			
			fiq.setSize(1000,600);
			fiq.setLayout(null);
		}
/************************************************************************************************/			
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==bsave) {                //save data to the table company in database
				try {
					PreparedStatement stmt=con.prepareStatement("insert into company values(?,?,?,?)");
					stmt.setInt(1, Integer.parseInt(t1.getText()));
					stmt.setString(2, t2.getText());
					stmt.setInt(3, Integer.parseInt(t3.getText()));
					stmt.setString(4, t4.getText());
					stmt.executeUpdate();
					
				} catch (SQLException e1) {e1.printStackTrace();JOptionPane.showMessageDialog(null, "Please enter new questions.");}
				
			}
	/************************************************************************************************/			
			else if(e.getSource()==back9) {
				fiq.setVisible(false);		//make question page invisible
				new DP_MP();				//make home frame visible by calling the class DP_MP
			}
	/************************************************************************************************/
			
		}

}



