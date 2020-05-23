package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class INTERVIEW implements ActionListener {				//class for interview frame
	TableColumnModel columnModel;
	JLabel l21, l22, l23 ;
	JTable t;
	int num;
	JFrame fint;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,back2;
	JPanel pint;
	Connection con=new connection().get_connection();
	INTERVIEW(){
		INTERVIEWFRAME();
		fint.setVisible(true);									//making interview frame visible
	}
/************************************************************************************************/	
	public void INTERVIEWFRAME(){
		fint=new JFrame("INTERVIEW");
		
		l21= new JLabel("COMPANY WISE:");
		l21.setFont (l21.getFont ().deriveFont (32.0f));//Label Size
		l21.setForeground(Color.white);//Font color
		l22= new JLabel("BRANCH WISE:");
		l22.setFont (l22.getFont ().deriveFont (32.0f));//Label Size
		l22.setForeground(Color.white);//Font color
		l23= new JLabel("MISCELLANEOUS:");
		l23.setFont (l23.getFont ().deriveFont (32.0f));//Label Size
		l23.setForeground(Color.white);//Font color
		
		b1=new JButton("Amazon");
		b2=new JButton("Dell");
		b3=new JButton("Goldman Sachs");
		b4=new JButton("Microsoft");
		b5=new JButton("Samsung");
		b6=new JButton("CS/IT");
		b7=new JButton("E&TC");
		b8=new JButton("Behavioral");
		b9=new JButton("Guesstimate");
		b10=new JButton("Stress Interview");
		back2=new JButton("Back..");
		
		String Data[][]={};		//2D String Array
		String Col[]={"Choice","Sr. No.","Questions"};
		model = new DefaultTableModel(Data,Col);
		t=new JTable(model);
		
		columnModel = t.getColumnModel();				//Set The Column Width
		columnModel.getColumn(0).setPreferredWidth(100);
		columnModel.getColumn(1).setPreferredWidth(50);
		columnModel.getColumn(2).setPreferredWidth(715);
		
		t.setFont(new Font("Arial", Font.PLAIN, 10)); //Set the Font size of Table
		t.setRowHeight(30);		
		
		t.setBounds(60, 350, 865, 280 );
		l21.setBounds(20,20,400,30);
		l21.setForeground(Color.white);
		l22.setBounds(20,125,400,30);
		l22.setForeground(Color.white);
		l23.setBounds(20,230,400,30);
		l23.setForeground(Color.white);
		b1.setBounds(60,70,160,35);
		int Rb1 = (int) (Math.random( )*256);
		int Gb1 = (int)(Math.random( )*256);
		int Bb1= (int)(Math.random( )*256);
		Color buttoncolor1 = new Color(246, 70, 104);	
		b1.setBackground(buttoncolor1);
		b2.setBounds(236,70,160,35);
		b2.setBackground(buttoncolor1);
		b3.setBounds(412,70,160,35);
		b3.setBackground(buttoncolor1);
		b4.setBounds(588,70,160,35);
		b4.setBackground(buttoncolor1);
		b5.setBounds(764,70,160,35);
		b5.setBackground(buttoncolor1);
		b6.setBounds(200,175,250,35);
		b6.setBackground(buttoncolor1);
		b7.setBounds(550,175,250,35);
		b7.setBackground(buttoncolor1);
		b8.setBounds(80,280,250,35);
		b8.setBackground(buttoncolor1);
		b9.setBounds(360,280,250,35);
		b9.setBackground(buttoncolor1);
		b10.setBounds(640,280,250,35);
		b10.setBackground(buttoncolor1);
		back2.setBounds(650,650,180,35);
		
		fint.add(t);fint.add(l21);fint.add(l22);fint.add(l23);fint.add(back2);
		fint.add(b1);fint.add(b2);fint.add(b3);fint.add(b4);fint.add(b5);
		fint.add(b6);fint.add(b7);fint.add(b8);fint.add(b9);fint.add(b10);
		
		b1.addActionListener(this);b2.addActionListener(this);
		b3.addActionListener(this);b4.addActionListener(this);
		b5.addActionListener(this);b6.addActionListener(this);
		b7.addActionListener(this);b8.addActionListener(this);
		b9.addActionListener(this);b10.addActionListener(this);
		back2.addActionListener(this);
		
		int Rbg = (int) (Math.random( )*256);
		int Gbg = (int)(Math.random( )*256);
		int Bbg= (int)(Math.random( )*256);
		Color bgcolor1 = new Color(65, 67, 106);
		
		
		JPanel pint=new JPanel();
		pint.setSize(1000,750);
		pint.setBackground(bgcolor1);
		fint.add(pint);
		
		fint.setSize(1000,750);
		fint.setLayout(null);
	}
/************************************************************************************************/		
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1)		//Response of Amazon Button Click
		{
			num=1;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b2)		//Response of dell Button Click
		{
			num=2;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b3)		//Response of Goldman Sachs Button Click
		{
			num=3;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b4)		//Response of Microsoft Button Click
		{
			num=4;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b5)		//Response of Samsung Button Click
		{
			num=5;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b6)		//Response of CS/IT Button Click
		{
			num=6;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b7)		//Response of E&TC Button Click
		{
			num=7;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b8)		//Response of Behavioral Button Click
		{
			num=8;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b9)		//Response of Guesstimate Button Click
		{
			num=9;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}
/************************************************************************************************/
		else if(e.getSource()==b10)		//Response of Stress interview Button Click
		{
			num=10;
			try {
				display();
			} catch (SQLException e1) {e1.printStackTrace();}
		}

/************************************************************************************************/
		else if(e.getSource()==back2) {
			fint.setVisible(false);		//make interview page invisible
			new DP_MP();
		}
/************************************************************************************************/
	}
DefaultTableModel model;
/************************************************************************************************/	
	public void display() throws SQLException
	{
		if(num==1) {
		try {
			model.setRowCount(0);
			PreparedStatement load = con.prepareStatement("select companyname, srno, Question from company where number=1");
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
		else if(num==2) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select companyname, srno, Question from company where number=2");
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
		else if(num==3) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select companyname, srno, Question from company where number=3");
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
		else if(num==4) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select companyname, srno, Question from company where number=4");
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
		else if(num==5) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select companyname, srno, Question from company where number=5");
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
		else if(num==6) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select branchname, srno, Question from branch where number=6");
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
		else if(num==7) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select branchname, srno, Question from branch where number=7");
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
		else if(num==8) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, Question from miscellaneous where number=8");
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
		else if(num==9) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, Question from miscellaneous where number=9");
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
		else if(num==10) {
			try {
				model.setRowCount(0);
				PreparedStatement load = con.prepareStatement("select point, srno, Question from miscellaneous where number=10");
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
