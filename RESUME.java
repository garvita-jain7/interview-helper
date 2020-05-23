package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class RESUME implements ActionListener {						//class for resume frame

		TableColumnModel columnModel;
		JLabel l31;
		JTable t;
		int num;
		JFrame fres;
		JButton b11,b12,b13,back3;
		JPanel pres;
		DefaultTableModel model;
		Connection con=new connection().get_connection();
		RESUME(){
			RESUMEFRAME();
			fres.setVisible(true);	
		}
/************************************************************************************************/	
		public void RESUMEFRAME(){
			fres=new JFrame("RESUME");
			
			  l31= new JLabel("SOME HELP FOR GOOD RESUME"); 
			  l31.setFont(l31.getFont ().deriveFont (40.0f));//Label Size
			  l31.setForeground(Color.white);//Font color 
			  
			  b11=new JButton("Preparing your Resume"); b12=new JButton("Use of Action Verbs"); 
			  b13=new JButton("Resume Sections");  back3=new JButton("Back..");
			  
			  String Data[][]={}; //2D String Array
			  String Col[]={"Choice","Sr. No.","Details"};
			  model = new DefaultTableModel(Data,Col); t=new JTable(model);
			  
			  columnModel = t.getColumnModel(); //Set The Column Width
			  columnModel.getColumn(0).setPreferredWidth(100);
			  columnModel.getColumn(1).setPreferredWidth(50);
			  columnModel.getColumn(2).setPreferredWidth(715);
			  
			  t.setFont(new Font("Arial", Font.PLAIN, 10)); //Set the Font size of Table
			  t.setRowHeight(30);
			  
			  t.setBounds(60, 290, 865, 305 );
			  l31.setBounds(235,20,750,60);
			  l31.setFont(new Font("Arial", Font.ITALIC, 30));
			  l31.setForeground(Color.white); 
			  b11.setBounds(320,80,300,50); 
			  int Rb1 = (int)(Math.random( )*256);
			  int Gb1 = (int)(Math.random( )*256); 
			  int Bb1 = (int)(Math.random( )*256); 
			  Color buttoncolor1 = new Color(246, 70, 104);
			  b11.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
			  b11.setForeground(Color.white);
			  b11.setBackground(buttoncolor1);
			  b12.setBounds(320,150,300,50);
			  b12.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
			  b12.setForeground(Color.white);
			  b12.setBackground(buttoncolor1); 
			  b13.setBounds(320,220,300,50);
			  b13.setFont(new Font("Arial", Font.ROMAN_BASELINE, 18));
			  b13.setForeground(Color.white);
			  b13.setBackground(buttoncolor1); 
			  back3.setBounds(680,615,180,35);
			  
			  fres.add(t);fres.add(l31);fres.add(back3);
			  fres.add(b11);fres.add(b12);fres.add(b13);
			  b11.addActionListener(this);b12.addActionListener(this);
			  b13.addActionListener(this);
			  back3.addActionListener(this);
			 
			
			int Rbg = (int) (Math.random( )*256);
			int Gbg = (int)(Math.random( )*256);
			int Bbg= (int)(Math.random( )*256);
			Color bgcolor1 = new Color(65, 67, 106);
			
			
			JPanel pres=new JPanel();
			pres.setSize(1000,700);
			pres.setBackground(bgcolor1);
			fres.add(pres);
			
			fres.setSize(1000,700);
			fres.setLayout(null);
		}
/************************************************************************************************/			
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==b11)		//Response of prepare resume Button Click
			{
				num=11;
				try {
					display();
				} catch (SQLException e1) {e1.printStackTrace();}
			}

	/************************************************************************************************/
			else if(e.getSource()==b12)		//Response of action verb Button Click
			{
				num=12;
				try {
					display();
				} catch (SQLException e1) {e1.printStackTrace();}
			}

	/************************************************************************************************/
			else if(e.getSource()==b13)		//Response of resume section Button Click
			{
				num=13;
				try {
					display();
				} catch (SQLException e1) {e1.printStackTrace();}
			}

	/************************************************************************************************/
			else if(e.getSource()==back3)		//Response of back button of resume page
			{
				fres.setVisible(false);		//make interview page invisible
				new DP_MP();		
			}
	/************************************************************************************************/
		}
/************************************************************************************************/			
		public void display() throws SQLException
		{
			if(num==11) {
				try {
					model.setRowCount(0);
					PreparedStatement load = con.prepareStatement("select point, srno, tips from  prepareresume");
					ResultSet rs = load.executeQuery();
					for(int i=0;rs.next()==true;i++)
					{  
						model.insertRow(i,new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3)});
					}
					//model.setAutoCreateRowSorter(true);
					
				
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "database loading failed");
				}
				}
			/************************************************************************************************/
			else if(num==12) {
				try {
					model.setRowCount(0);
					PreparedStatement load = con.prepareStatement("select point, srno, verbs from actionverbs");
					ResultSet rs = load.executeQuery();
					for(int i=0;rs.next()==true;i++)
					{  
						model.insertRow(i,new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3)});
					}
					//model.setAutoCreateRowSorter(true);
					
				
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "database loading failed");
				}
				}
			/************************************************************************************************/
			else if(num==13) {
				try {
					model.setRowCount(0);
					PreparedStatement load = con.prepareStatement("select point, srno, sections from resumesections");
					ResultSet rs = load.executeQuery();
					for(int i=0;rs.next()==true;i++)
					{  
						model.insertRow(i,new Object[]{rs.getString(1),rs.getInt(2),rs.getString(3)});
					}
					//model.setAutoCreateRowSorter(true);
					
				
				}catch(Exception a) {
					JOptionPane.showMessageDialog(null, "database loading failed");
				}
				}
			/************************************************************************************************/
			}
/************************************************************************************************/			
	}



