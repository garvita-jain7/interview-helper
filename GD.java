package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class GD implements ActionListener {								//class for gd frame

		TableColumnModel columnModel;
		JLabel l41;
		JTable t;
		int num;
		JFrame fgd;
		JButton b14,b15,back4;
		JPanel pgd;
		DefaultTableModel model;
		Connection con=new connection().get_connection();
		GD(){
			GDFRAME();
			fgd.setVisible(true);
			}
/************************************************************************************************/	
		public void GDFRAME(){
			fgd=new JFrame("GROUP DISCUSSION");
	    	
	    	l41= new JLabel("GROUP DISCUSSION"); 
			l41.setFont(l41.getFont ().deriveFont (40.0f));//Label Size
			l41.setForeground(Color.white);//Font color 
			b14=new JButton("Current Topics"); 
			b15=new JButton("Tips");  
			back4=new JButton("Back..");
			
			String Data[][]={}; //2D String Array
			String Col[]={"Choice","Sr. No.","Details"};
			model = new DefaultTableModel(Data,Col); t=new JTable(model);
			 
			columnModel = t.getColumnModel(); //Set The Column Width
			columnModel.getColumn(0).setPreferredWidth(100);
			columnModel.getColumn(1).setPreferredWidth(50);
			columnModel.getColumn(2).setPreferredWidth(715);
			  
			t.setFont(new Font("Arial", Font.PLAIN, 10)); //Set the Font size of Table
			t.setRowHeight(30);
			
			t.setBounds(60, 220, 865, 330 );
			l41.setBounds(315,20,750,60);
			l41.setFont(new Font("Arial", Font.ITALIC, 30));
			
			b14.setBounds(320,80,300,50); 
			int Rb1 = (int)(Math.random( )*256);
			int Gb1 = (int)(Math.random( )*256); 
			int Bb1 = (int)(Math.random( )*256); 
			Color buttoncolor1 = new Color(246, 70, 104);
			b14.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
			b14.setForeground(Color.white);
			b14.setBackground(buttoncolor1);
			b15.setBounds(320,150,300,50);
			b15.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
			b15.setForeground(Color.white);
			b15.setBackground(buttoncolor1);
			back4.setBounds(680,565,180,35);
	    	
	    	int Rbg = (int) (Math.random( )*256);
			int Gbg = (int)(Math.random( )*256);
			int Bbg= (int)(Math.random( )*256);
			Color bgcolor1 = new Color(65, 67, 106);
			fgd.add(t);fgd.add(l41);fgd.add(back4);
			fgd.add(b14);fgd.add(b15);
			
			b14.addActionListener(this);
			b15.addActionListener(this);
			back4.addActionListener(this);
			
			JPanel pgd=new JPanel();
			pgd.setSize(1000,650);
			pgd.setBackground(bgcolor1);
			fgd.add(pgd);
			
			fgd.setSize(1000,650);
			fgd.setLayout(null);
		}
/************************************************************************************************/			
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==b14)		//Response of current topics button Click
			{
				num=14;
				try {
					display();
				} catch (SQLException e1) {e1.printStackTrace();}
			}

	/************************************************************************************************/
			else if(e.getSource()==b15)		//Response of tips Button Click
			{
				num=15;
				try {
					display();
				} catch (SQLException e1) {e1.printStackTrace();}
			}

	/************************************************************************************************/
			else if(e.getSource()==back4)		//Response of back button of gd page
			{
				fgd.setVisible(false);		//make GD page invisible
				new DP_MP();		
			}
	/************************************************************************************************/
		}
/************************************************************************************************/			
		public void display() throws SQLException
		{
			if(num==14) {
				try {
					model.setRowCount(0);
					PreparedStatement load = con.prepareStatement("select point, srno, topics from currenttopics");
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
			else if(num==15) {
				try {
					model.setRowCount(0);
					PreparedStatement load = con.prepareStatement("select point, srno, tips from tips");
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




