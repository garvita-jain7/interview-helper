package Mini_project;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class DP_MP implements ActionListener {               //class DP_MP FOR THE FIRST FRAME
	Connection con;
	JLabel l11,l12,l13,l14,l15;
	JFrame fmain;
	JButton badmin, bint, bres, bgd, btips, brate, bexit;
	JPanel j;
	DP_MP(){
		HomeFrame();		//initialize Home Page, make it visible
		fmain.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==badmin)		//Response of admin Button Click
		{
			new LOGIN();				//class for login page
			fmain.setVisible(false);	//make home page invisible
					
		}
/************************************************************************************************/
		else if(e.getSource()==bint)		//Response of interview Button Click
		{
			new INTERVIEW();
			fmain.setVisible(false);	//make home page invisible
					
		}
/************************************************************************************************/
		else if(e.getSource()==bres)		//Response of resume Button Click
		{
			new RESUME();
			fmain.setVisible(false);	//make home page invisible
					
		}
/************************************************************************************************/
		else if(e.getSource()==bgd)		//Response of group discussion Button Click
		{
			new GD();
			fmain.setVisible(false);	//make home page invisible
					
		}
/************************************************************************************************/
		else if(e.getSource()==btips)		//Response of tips Button Click
		{
			new TIPS();
			fmain.setVisible(false);	//make home page invisible
					
		}
/************************************************************************************************/
		else if(e.getSource()==brate)		//Response of rate Button Click
		{
			new RATE();
			fmain.setVisible(false);	//make home page invisible
					
		}
/************************************************************************************************/
		else if(e.getSource()==bexit)		//Response of Exit Button
		{ 
			System.exit(0);
	
		}
	}
	
/************************************************************************************************/		
		public static void main(String[] args) 
		{
			Connection con=new connection().get_connection();         //callind the connection class
			DP_MP obj = new DP_MP();
		}
/************************************************************************************************/	
		void HomeFrame()
		{
			fmain=new JFrame("INTERVIEW HELPER");
			l11=new JLabel("Welcome to Interview Helper");
			l11.setFont (l11.getFont ().deriveFont (32.0f));              //Label Size
			l11.setForeground(Color.white);                               //Font color
			l12=new JLabel("Your one stop destination for all interview needs!");
			l12.setFont (l12.getFont ().deriveFont (12.0f));
			l12.setForeground(Color.white);
			l13=new JLabel("By: DWEEJA PATHAK, GARVITA JAIN, GUNJAN MANE");
			l13.setFont (l13.getFont ().deriveFont (18.0f));
			l13.setForeground(Color.white);
			l14=new JLabel("Choose option");
			l14.setForeground(Color.LIGHT_GRAY);
			l15=new JLabel("Status Message:");
			l15.setForeground(Color.LIGHT_GRAY);
			badmin=new JButton("ADMIN");
			bint=new JButton("INTERVIEW");
			bres=new JButton("RESUME");
			bgd=new JButton("GROUP DISCUSSION");
			btips=new JButton("TIPS");
			brate=new JButton("RATE US!!");
			bexit=new JButton("Exit");
					
			l11.setBounds(140,50,500,50);                              //setting bounds for labels, buttons
			l12.setBounds(210,90,500,50);
			l13.setBounds(120,130,500,50);
			l14.setBounds(360,180,250,50);
			l15.setBounds(260,180,150,50);
			badmin.setBounds(580,15,80,25);
			badmin.setBackground(Color.white);						//background color
			bint.setBounds(250,250,200,60);
			bint.setBackground(Color.orange);
			bres.setBounds(250,320,200,60);
			bres.setBackground(Color.ORANGE);
			bgd.setBounds(250,390,200,60);
			bgd.setBackground(Color.ORANGE);
			btips.setBounds(250,460,200,60);
			btips.setBackground(Color.ORANGE);
			brate.setBounds(250,530,200,60);
			brate.setBackground(Color.YELLOW);
			bexit.setBounds(250,600,200,60);
			bexit.setBackground(Color.YELLOW);
			
			
			fmain.add(l11);fmain.add(l12);fmain.add(l13);fmain.add(l14);			//adding the labels and buttons to the frame
			fmain.add(l15);fmain.add(badmin);fmain.add(bint);fmain.add(bres);
			fmain.add(bgd);fmain.add(btips);fmain.add(brate);fmain.add(bexit);
					
			badmin.addActionListener(this);											
			bint.addActionListener(this);bres.addActionListener(this);
			bgd.addActionListener(this);btips.addActionListener(this);
			brate.addActionListener(this);bexit.addActionListener(this);
			
			int Rr = (int) (Math.random( )*256);							//defining a new color using rgb color code
			int Gr = (int)(Math.random( )*256);
			int Br= (int)(Math.random( )*256);
			Color randomColor = new Color(25, 54, 74);
			j=new JPanel();
			j.setSize(700,750);
			fmain.add(j);
			j.setBackground(randomColor);
				
			fmain.setSize(700,750);											//size of the frame
			fmain.setLayout(null);
			fmain.setVisible(true);											//frame is visible
		
		}
/************************************************************************************************/	
	}
