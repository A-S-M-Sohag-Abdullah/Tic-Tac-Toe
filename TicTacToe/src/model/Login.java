package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Login extends Home{
	public String username ;
	public Login() {
		super();
		//variable initialization;
		name = new JLabel("Name : ");
		namenotselected = new JLabel("Set player name first!!!");
		rbtnimg1 = new JLabel(crossimg);
		rbtnimg2 = new JLabel(circleimg);
		namebox = new JTextField();
		gobtn = new JButton("GO !!");
		backtohome = new JButton("Back");
		choice1 = new JRadioButton();
		choice2 = new JRadioButton();
		bg.add(choice1);
		bg.add(choice2);
		
		//login panel settings
		loginpanel.setSize(400,400);
		loginpanel.setLayout(null);
		loginpanel.setBackground(Color.WHITE);
		backtohome.setBounds(10, 10, 70, 20);
		backtohome.setBackground(Color.RED);
		
		namenotselected.setBounds(125, 60, 200, 30);
		namenotselected.setForeground(Color.RED);
		
		name.setBounds(100, 110, 50, 15);
		namebox.setBounds(150, 108, 120, 20);
		namebox.setBackground(Color.lightGray);
		namebox.setForeground(Color.YELLOW);
		choice1.setBounds(135, 160, 20, 20);
		rbtnimg1.setBounds(155, 160, 20, 20);
		choice1.setSelected(true);
		choice2.setBounds(180, 160, 20, 20);
		rbtnimg2.setBounds(200, 155, 30, 30);		
		gobtn.setBounds(135, 250, 100, 30);
		gobtn.setBackground(Color.GREEN);
		
		
		panelcont.add(loginpanel,"2");
		
		//login panel contents adding
		loginpanel.add(backtohome);
		loginpanel.add(name);
		loginpanel.add(namebox);
		loginpanel.add(choice1);
		loginpanel.add(choice2);
		loginpanel.add(rbtnimg1);
		loginpanel.add(rbtnimg2);
		loginpanel.add(gobtn);
		loginpanel.add(namenotselected);
		namenotselected.setVisible(false);
		
		gobtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(choice1.isSelected())
					userchoice = "cross";
				else if(choice2.isSelected())
				{
					userchoice = "circle"; 
					randomchoice(positions);
				}
				
			 username = namebox.getText();
				//System.out.println(username);
				if(!(username.equals("")))
				{
					cl.show(panelcont, "3");
				}
				else
				{
					namenotselected.setVisible(true);
				}
			}
		});
		
		backtohome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panelcont, "1");
			}
		});
	}
	public void randomchoice(ArrayList<Integer> pos) {
			
		
			//System.out.println(pos.size());
			int length = pos.size();
			if (length<1)
				return;
			int randnum = randpos.nextInt(length);
			int num = pos.get(randnum);
			
			
			if(num==1)
			{
				b1.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox1);
				else
					playpanel.add(circleimgbox1);
				System.out.println(num);
				winarr[0] = 1;
			}
			if(num==2)
			{
				b2.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox2);
				else
					playpanel.add(circleimgbox2);
				System.out.println(num);
				winarr[1] = 1;
			}
			if(num==3)
			{
				b3.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox3);
				else
					playpanel.add(circleimgbox3);
				System.out.println(num);
				winarr[2] = 1;
			}
			if(num==4)
			{
				b4.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox4);
				else
					playpanel.add(circleimgbox4);
				System.out.println(num);
				winarr[3] = 1;
			}
			if(num==5)
			{
				b5.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox5);
				else
					playpanel.add(circleimgbox5);
				System.out.println(num);
				winarr[4] = 1;
			}
			if(num==6)
			{
				b6.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox6);
				else
					playpanel.add(circleimgbox6);
				System.out.println(num);
				winarr[5] = 1;
			}
			if(num==7)
			{
				b7.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox7);
				else
					playpanel.add(circleimgbox7);
				System.out.println(num);
				winarr[6] = 1;
			}
			if(num==8)
			{
				b8.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox8);
				else
					playpanel.add(circleimgbox8);
				System.out.println(num);
				winarr[7] = 1;
			}
			if(num==9)
			{
				b9.setVisible(false);
				if(userchoice.equals("circle"))
					playpanel.add(crossimgbox9);
				else
					playpanel.add(circleimgbox9);
				System.out.println(num);
				winarr[8] = 1;
			}
			positions.remove(positions.indexOf(num));
			System.out.println(positions);
		}
}
