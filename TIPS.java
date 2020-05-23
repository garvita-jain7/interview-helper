package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class TIPS implements ActionListener{									//classfor rate frame

	TableColumnModel columnModel;
	JLabel l51;
	JTable t;
	int num;
	JFrame ftips;
	JButton b16,b17,b18,b19,back5;
	JPanel ptips;
	DefaultTableModel model;
	Connection con=new connection().get_connection();
	TIPS(){
		TIPSFRAME();
		ftips.setVisible(true);
	}
/************************************************************************************************/	
	public void TIPSFRAME(){
		ftips=new JFrame("HELPFUL TIPS");
    	
    	l51= new JLabel("HELPFUL TIPS"); 
		l51.setFont(l51.getFont ().deriveFont (40.0f));//Label Size
		l51.setForeground(Color.white);//Font color 
		b16=new JButton("Interview Tips"); 
		b17=new JButton("Body Language Tips"); 
		b18=new JButton("Common Mistakes"); 
		b19=new JButton("Confidence Building");
		back5=new JButton("Back..");
		
		String Data[][]={}; //2D String Array
		String Col[]={"Choice","Sr. No.","Details"};
		model = new DefaultTableModel(Data,Col); t=new JTable(model);
		 
		columnModel = t.getColumnModel(); //Set The Column Width
		columnModel.getColumn(0).setPreferredWidth(100);
		columnModel.getColumn(1).setPreferredWidth(50);
		columnModel.getColumn(2).setPreferredWidth(715);
		  
		t.setFont(new Font("Arial", Font.PLAIN, 10)); //Set the Font size of Table
		t.setRowHeight(30);
		
		t.setBounds(60, 220, 865, 190 );
		l51.setBounds(385,20,750,60);
		l51.setFont(new Font("Arial", Font.ITALIC, 30));
		
		b16.setBounds(140,80,300,50); 
		int Rb1 = (int)(Math.random( )*256); 
		int Gb1 = (int)(Math.random( )*256); 
		int Bb1 = (int)(Math.random( )*256); 
		Color buttoncolor1 = new Color(246, 70, 104);
		b16.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
		b16.setForeground(Color.white);
		b16.setBackground(buttoncolor1);
		
		b17.setBounds(525,80,300,50);
		b17.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
		b17.setForeground(Color.white);
		b17.setBackground(buttoncolor1);
		
		b18.setBounds(140,150,300,50); 
		b18.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
		b18.setForeground(Color.white);
		b18.setBackground(buttoncolor1);
		
		b19.setBounds(525,150,300,50);
		b19.setFont(new Font("Arial", Font.ROMAN_BASELINE, 21));
		b19.setForeground(Color.white);
		b19.setBackground(buttoncolor1);
		back5.setBounds(680,425,180,35);
    	
    	int Rbg = (int) (Math.random( )*256);
		int Gbg = (int)(Math.random( )*256);
		int Bbg= (int)(Math.random( )*256);
		Color bgcolor1 = new Color(65, 67, 106);
		ftips.add(t);ftips.add(l51);ftips.add(back5);
		ftips.add(b16);ftips.add(b17);ftips.add(b18);ftips.add(b19);
		
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		back5.addActionListener(this);
		
		JPanel ptips=new JPanel();
		ptips.setSize(1000,650);
		ptips.setBackground(bgcolor1);
		ftips.add(ptips);
		
		ftips.setSize(1000,510);
		ftips.setLayout(null);
	}
/************************************************************************************************/		
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b16)		//Response of interview tips Button Click
		{
			num=16;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}

/************************************************************************************************/
		else if(e.getSource()==b17)		//Response of body language tips Button Click
		{
			num=17;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}

/************************************************************************************************/
		else if(e.getSource()==b18)		//Response of common mistakes Button Click
		{
			num=18;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}

/************************************************************************************************/
		else if(e.getSource()==b19)		//Response of confidence building Button Click
		{
			num=19;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}

/************************************************************************************************/
		else if(e.getSource()==back5)		//Response of back button of resume page
		{
			ftips.setVisible(false);		//make tips page invisible
			new DP_MP();		
		}
/************************************************************************************************/
	}
/************************************************************************************************/		
	public void display() throws SQLException
	{
		if(num==16) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, tips from interviewtips");
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
		else if(num==17) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, tips from bodylanguagetips");
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
		else if(num==18) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, tips from commonmistakes");
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
		else if(num==19) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, tips from confidencetips");
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
