package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class SEERATING implements ActionListener {

		TableColumnModel columnModel;
		JLabel l81;
		JTable t;
		int num;
		JFrame fsr;
		JButton back8;
		JPanel psr;
		DefaultTableModel model;
		Connection con=new connection().get_connection();
		SEERATING(){
			SEERATINGFRAME();
			fsr.setVisible(true);
			try {
				display();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
/************************************************************************************************/	
		public void SEERATINGFRAME(){
			fsr=new JFrame("SEE THE RATING");
	    	
	    	l81= new JLabel("SEE THE RATING..."); 
			l81.setFont(l81.getFont ().deriveFont (40.0f));//Label Size
			l81.setForeground(Color.white);//Font color  
			back8=new JButton("Back..");
			
			String Data[][]={}; //2D String Array
			String Col[]={"Choice","Sr. No.","Details"};
			model = new DefaultTableModel(Data,Col); t=new JTable(model);
			 
			columnModel = t.getColumnModel(); //Set The Column Width
			columnModel.getColumn(0).setPreferredWidth(100);
			columnModel.getColumn(1).setPreferredWidth(50);
			columnModel.getColumn(2).setPreferredWidth(715);
			  
			t.setFont(new Font("Arial", Font.PLAIN, 10)); //Set the Font size of Table
			t.setRowHeight(30);
			
			t.setBounds(60, 75, 865, 330 );
			l81.setBounds(315,20,750,60);
			l81.setFont(new Font("Arial", Font.ITALIC, 30));
			
			back8.setBounds(680,415,180,35);
	    	
	    	int Rbg = (int) (Math.random( )*256);
			int Gbg = (int)(Math.random( )*256);
			int Bbg= (int)(Math.random( )*256);
			Color bgcolor1 = new Color(65, 67, 106);
			fsr.add(t);fsr.add(l81);fsr.add(back8);
			
			back8.addActionListener(this);
			
			JPanel psr=new JPanel();
			psr.setSize(1000,500);
			psr.setBackground(bgcolor1);
			fsr.add(psr);
			
			fsr.setSize(1000,500);
			fsr.setLayout(null);
		}
/************************************************************************************************/			
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==back8)		//Response of back button of see the rating page
			{
				fsr.setVisible(false);		//make see the rating page invisible
				new SENIOR();		
			}
	
		 }
/************************************************************************************************/			
		public void display() throws SQLException
		{
				try {                   //showing the ratings saved in database
					model.setRowCount(0);
					PreparedStatement load = con.prepareStatement("select experience, rating,suggestions from rating");
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
		
/************************************************************************************************/			
}




