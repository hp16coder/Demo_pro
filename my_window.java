package com.pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;





public class my_window extends JFrame

{
	private JLabel heading;
	private JLabel clockLabel;
	
	private Font font=new Font("", Font.BOLD, 32);
	
	my_window()
	{
		int x,y;
		super.setTitle("My first Digital clock");
		super.setSize(600, 600);
		
		super.setLocation(600, 600);
		this.createGUI();
		this.startClock();
		super.setVisible(true);
			
	}
      
	public void createGUI()
	
	{
		//gui
		heading=new JLabel("My Digital Clock");
		
		clockLabel = new JLabel("clock");
		
		heading.setFont(font);
		clockLabel.setFont(font);
		
		this.setLayout(new GridLayout(2, 1));
		this.add(heading);
		this.add(clockLabel);
			
		
	}
	
	public void startClock()
	{
	  Timer timer = new Timer(1000, new ActionListener(){
		  
		public void actionPerformed(ActionEvent e){
			//String dateTime=new Date().toString();
			String dateTime=new Date().toLocaleString();
		   
		   clockLabel.setText(dateTime);
		}
		
	  });	
	  timer.start();
	 
	 
}
		 
	
} 

