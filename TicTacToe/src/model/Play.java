package model;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Play extends Login {
	public JLabel result ;
	JButton finishbtn;
	JButton replay;
	public Play() {
		super();
		initvariables();

		playpanelsetup();

		addplaybuttons();

		addplaysymbolpos();

		addwinninglines();

		fillarray();

		result = new JLabel();
		result.setBounds(150,10,200,30);
		playpanel.add(result);
		result.setVisible(false);
		finishbtn = new JButton("Exit");
		replay = new JButton("Play Again");
		finishbtn.setBounds(80, 300, 100, 30);
		finishbtn.setBackground(Color.red);
		replay.setBounds(220, 300, 100, 30);
		replay.setBackground(Color.GREEN);
		playpanel.add(finishbtn);
		playpanel.add(replay);
		finishbtn.setVisible(false);
		replay.setVisible(false);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b1.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox1);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox1);

				positions.remove(positions.indexOf(1));
				System.out.println(positions);
				winarr[0] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b2.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox2);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox2);
				positions.remove(positions.indexOf(2));
				System.out.println(positions);
				winarr[1] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b3.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox3);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox3);
				positions.remove(positions.indexOf(3));
				System.out.println(positions);
				winarr[2] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b4.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox4);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox4);
				positions.remove(positions.indexOf(4));
				System.out.println(positions);
				winarr[3] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b5.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox5);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox5);
				positions.remove(positions.indexOf(5));
				System.out.println(positions);
				winarr[4] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b6.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox6);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox6);
				positions.remove(positions.indexOf(6));
				System.out.println(positions);
				winarr[5] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b7.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox7);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox7);
				positions.remove(positions.indexOf(7));
				System.out.println(positions);
				winarr[6] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});
		b8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b8.setVisible(false);
				
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox8);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox8);
				positions.remove(positions.indexOf(8));
				System.out.println(positions);
				winarr[7] = 2;
				if(!checkIfuserwin())
					cputern();
			}

			
		});
		b9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				b9.setVisible(false);
				if (userchoice.equals("cross"))
					playpanel.add(crossimgbox9);
				if (userchoice.equals("circle"))
					playpanel.add(circleimgbox9);
				positions.remove(positions.indexOf(9));

				System.out.println(positions);
				winarr[8] = 2;
				if(!checkIfuserwin())
					cputern();
			}
		});

		replay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fillarray();
				for(int i=0; i<9;i++)
					winarr[i] = 0;
				
				b1.setVisible(true);
				b2.setVisible(true);
				b3.setVisible(true);
				b4.setVisible(true);
				b5.setVisible(true);
				b6.setVisible(true);
				b7.setVisible(true);
				b8.setVisible(true);
				b9.setVisible(true);
				
				rL1.setVisible(false);
				rL2.setVisible(false);
				rL3.setVisible(false);
				cL1.setVisible(false);
				cL2.setVisible(false);
				cL3.setVisible(false);
				cornerL1.setVisible(false);
				cornerL2.setVisible(false);
				
				playpanel.remove(crossimgbox1);
				playpanel.remove(crossimgbox2);
				playpanel.remove(crossimgbox3);
				playpanel.remove(crossimgbox4);
				playpanel.remove(crossimgbox5);
				playpanel.remove(crossimgbox6);
				playpanel.remove(crossimgbox7);
				playpanel.remove(crossimgbox8);
				playpanel.remove(crossimgbox9);
				playpanel.remove(circleimgbox1);
				playpanel.remove(circleimgbox2);
				playpanel.remove(circleimgbox3);
				playpanel.remove(circleimgbox4);
				playpanel.remove(circleimgbox5);
				playpanel.remove(circleimgbox6);
				playpanel.remove(circleimgbox7);
				playpanel.remove(circleimgbox8);
				playpanel.remove(circleimgbox9);
				
				result.setVisible(false);
				finishbtn.setVisible(false);
				replay.setVisible(false);
				
				if(userchoice.equals("circle"))
					cputern();
			}
		});
		
		finishbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public void cputern() {
		if (checkIfCpuwin()) {
			System.out.println("Cpu win executed");
			gameover("Cpu Wins");
		} else if (blockIfuserwin()) {
			System.out.println("User win block executed");
			drawcheck();
		} else {
			randomchoice(positions);
			drawcheck();
		}
			
	}
	
	public void drawcheck() {
		for(int i=0;i<winarr.length;i++)
			if(winarr[i]==0)
				return;
			gameover("Match Draw!!");
		System.out.println("match drwa");
	}

	public boolean checkIfuserwin() {
		if(winarr[0]==2 && winarr[1]==2 && winarr[3]==2)
		{
			rL1.setVisible(true);
			gameover(username + " wins");
			
			return true;
		}
		else if(winarr[3]==2 && winarr[4]==2 && winarr[5]==2)
		{
			rL2.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		else if(winarr[6]==2 && winarr[7]==2 && winarr[8]==2)
		{
			rL3.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		else if(winarr[0]==2 && winarr[3]==2 && winarr[6]==2)
		{
			cL1.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		else if(winarr[1]==2 && winarr[4]==2 && winarr[7]==2)
		{
			cL2.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		else if(winarr[2]==2 && winarr[5]==2 && winarr[8]==2)
		{
			cL3.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		else if(winarr[0]==2 && winarr[4]==2 && winarr[8]==2)
		{
			cornerL1.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		else if(winarr[2]==2 && winarr[4]==2 && winarr[6]==2)
		{
			cornerL2.setVisible(true);
			gameover(username + " wins");
			return true;
		}
		return false;
	}
	
	public void gameover(String string) {
		
		result.setText(string);
		finishbtn.setVisible(true);
		replay.setVisible(true);
		result.setVisible(true);
		System.out.println("Game over");
		b1.setVisible(false);
		b2.setVisible(false);
		b3.setVisible(false);
		b4.setVisible(false);
		b5.setVisible(false);
		b6.setVisible(false);
		b7.setVisible(false);
		b8.setVisible(false);
		b9.setVisible(false);
	}

	public boolean checkIfCpuwin() {
		
		if ((winarr[0] == 1 && winarr[1] == 1 && winarr[2] == 0)) {
			b3.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox3);
			else
				playpanel.add(crossimgbox3);
			
			rL1.setVisible(true);
			return true;
		}
		else if((winarr[0] == 1 && winarr[1] == 0 && winarr[2] == 1))
		{
			b2.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox2);
			else
				playpanel.add(crossimgbox2);
			
			rL1.setVisible(true);
			return true;
		}
		else if((winarr[0] == 0 && winarr[1] == 1 && winarr[2] == 1))
		{
			b1.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox1);
			else
				playpanel.add(crossimgbox1);
			
			rL1.setVisible(true);
			return true;
			
		}
		else if ((winarr[3] == 1 && winarr[4] == 1 && winarr[5] == 0)) {
			b6.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox6);
			else
				playpanel.add(crossimgbox6);
			
			rL2.setVisible(true);
			return true;
		}
		else if ((winarr[3] == 1 && winarr[4] == 0 && winarr[5] == 1)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			rL2.setVisible(true);
			return true;
		}
		else if ((winarr[3] == 0 && winarr[4] == 1 && winarr[5] == 1)) {
			b4.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox4);
			else
				playpanel.add(crossimgbox4);
			
			rL2.setVisible(true);
			return true;
		}
		else if ((winarr[6] == 1 && winarr[7] == 1 && winarr[8] == 0) ) {
			b9.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox9);
			else
				playpanel.add(crossimgbox9);
			
			rL3.setVisible(true);
			return true;
		}
		else if ((winarr[6] == 1 && winarr[7] == 0 && winarr[8] == 1)) {
			b8.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox8);
			else
				playpanel.add(crossimgbox8);
			
			rL3.setVisible(true);
			return true;
		}
		else if ((winarr[6] == 0 && winarr[7] == 1 && winarr[8] == 1)) {
			b7.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox7);
			else
				playpanel.add(crossimgbox7);
			rL3.setVisible(true);
			return true;
		}
		else if ((winarr[0] == 0 && winarr[3] == 1 && winarr[6] == 1)) {
			b1.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox1);
			else
				playpanel.add(crossimgbox1);
			
			cL1.setVisible(true);
			return true;
		}
		else if ((winarr[0] == 1 && winarr[3] == 0 && winarr[6] == 1)) {
			b4.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox4);
			else
				playpanel.add(crossimgbox4);
			
			cL1.setVisible(true);
			return true;
		}
		else if ((winarr[0] == 1 && winarr[3] == 1 && winarr[6] == 0)) {
			b7.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox7);
			else
				playpanel.add(crossimgbox7);
			
			cL1.setVisible(true);
			return true;
		}
		else if ((winarr[1] == 0 && winarr[4] == 1 && winarr[7] == 1)) {
			b2.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox2);
			else
				playpanel.add(crossimgbox2);
			
			cL2.setVisible(true);
			return true;
		}
		else if ((winarr[1] == 1 && winarr[4] == 0 && winarr[7] == 1)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			cL2.setVisible(true);
			return true;
		}
		else if ((winarr[1] == 1 && winarr[4] == 1 && winarr[7] == 0)) {
			b8.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox8);
			else
				playpanel.add(crossimgbox8);
			
			cL2.setVisible(true);
			return true;
		}
		else if ((winarr[2] == 0 && winarr[5] == 1 && winarr[8] == 1)) {
			b3.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox3);
			else
				playpanel.add(crossimgbox3);
			
			cL3.setVisible(true);
			return true;
		}
		else if ((winarr[2] == 1 && winarr[5] == 0 && winarr[8] == 1)) {
			b6.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox6);
			else
				playpanel.add(crossimgbox6);
			
			cL3.setVisible(true);
			return true;
		}
		else if ((winarr[2] == 1 && winarr[5] == 1 && winarr[8] == 0)) {
			b9.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox9);
			else
				playpanel.add(crossimgbox9);
			
			cL3.setVisible(true);
			return true;
		}
		else if ((winarr[0] == 0 && winarr[4] == 1 && winarr[8] == 1)) {
			b1.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox1);
			else
				playpanel.add(crossimgbox1);
			
			cornerL1.setVisible(true);
			return true;
		}
		else if ((winarr[0] == 1 && winarr[4] == 0 && winarr[8] == 1)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			cornerL1.setVisible(true);
			return true;
		}
		else if ((winarr[0] == 1 && winarr[4] == 1 && winarr[8] == 0)) {
			b9.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox9);
			else
				playpanel.add(crossimgbox9);
			
			cornerL1.setVisible(true);
			return true;
		}
		else if ((winarr[2] == 0 && winarr[4] == 1 && winarr[6] == 1)) {
			b3.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox3);
			else
				playpanel.add(crossimgbox3);
			
			cornerL2.setVisible(true);
			return true;
		}
		else if ((winarr[2] == 1 && winarr[4] == 0 && winarr[6] == 1)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			cornerL2.setVisible(true);
			return true;
		}
		else if ((winarr[2] == 1 && winarr[4] == 1 && winarr[6] == 0)) {
			b7.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox7);
			else
				playpanel.add(crossimgbox7);
			
			cornerL2.setVisible(true);
			return true;
		}
		return false;
	}

	public boolean blockIfuserwin() {
		if ((winarr[0] == 2 && winarr[1] == 2 && winarr[2] == 0)) {
			b3.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox3);
			else
				playpanel.add(crossimgbox3);
			winarr[2] = 1;
			positions.remove(positions.indexOf(3));
			return true;
		}
		if((winarr[0] == 2 && winarr[1] == 0 && winarr[2] == 2))
		{
			b2.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox2);
			else
				playpanel.add(crossimgbox2);
			
			winarr[1] = 1;
			positions.remove(positions.indexOf(2));
			return true;
		}
		if((winarr[0] == 0 && winarr[1] == 2 && winarr[2] == 2))
		{
			b1.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox1);
			else
				playpanel.add(crossimgbox1);
			winarr[0] = 1;
			positions.remove(positions.indexOf(1));
			return true;
			
		}
		if ((winarr[3] == 2 && winarr[4] == 2 && winarr[5] == 0)) {
			b6.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox6);
			else
				playpanel.add(crossimgbox6);
			
			winarr[5] = 1;
			positions.remove(positions.indexOf(6));
			return true;
		}
		if ((winarr[3] == 2 && winarr[4] == 0 && winarr[5] == 2)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			winarr[4] = 1;
			positions.remove(positions.indexOf(5));
			return true;
		}
		if ((winarr[3] == 0 && winarr[4] == 2 && winarr[5] == 2)) {
			b4.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox4);
			else
				playpanel.add(crossimgbox4);
			
			winarr[3] = 1;
			positions.remove(positions.indexOf(4));
			return true;
		}
		if ((winarr[6] == 2 && winarr[7] == 2 && winarr[8] == 0) ) {
			b9.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox9);
			else
				playpanel.add(crossimgbox9);
			
			winarr[8] = 1;
			positions.remove(positions.indexOf(9));
			return true;
		}
		if ((winarr[6] == 2 && winarr[7] == 0 && winarr[8] == 2)) {
			b8.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox8);
			else
				playpanel.add(crossimgbox8);
			
			winarr[7] = 1;
			positions.remove(positions.indexOf(8));
			return true;
		}
		if ((winarr[6] == 0 && winarr[7] == 2 && winarr[8] == 2)) {
			b7.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox7);
			else
				playpanel.add(crossimgbox7);
			winarr[6] = 1;
			positions.remove(positions.indexOf(7));
			return true;
		}
		if ((winarr[0] == 0 && winarr[3] == 2 && winarr[6] == 2)) {
			b1.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox1);
			else
				playpanel.add(crossimgbox1);
			winarr[0] = 1;
			positions.remove(positions.indexOf(1));
			return true;
		}
		if ((winarr[0] == 2 && winarr[3] == 0 && winarr[6] == 2)) {
			b4.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox4);
			else
				playpanel.add(crossimgbox4);
			
			winarr[3] = 1;
			positions.remove(positions.indexOf(4));
			return true;
		}
		if ((winarr[0] == 2 && winarr[3] == 2 && winarr[6] == 0)) {
			b7.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox7);
			else
				playpanel.add(crossimgbox7);
			
			winarr[6] = 1;
			positions.remove(positions.indexOf(7));
			return true;
		}
		if ((winarr[1] == 0 && winarr[4] == 2 && winarr[7] == 2)) {
			b2.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox2);
			else
				playpanel.add(crossimgbox2);
			winarr[1] = 1;
			positions.remove(positions.indexOf(2));
			return true;
		}
		if ((winarr[1] == 2 && winarr[4] == 0 && winarr[7] == 2)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			winarr[4] = 1;
			positions.remove(positions.indexOf(5));
			return true;
		}
		if ((winarr[1] == 2 && winarr[4] == 2 && winarr[7] == 0)) {
			b8.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox8);
			else
				playpanel.add(crossimgbox8);
			winarr[7] = 1;
			positions.remove(positions.indexOf(8));
			return true;
		}
		if ((winarr[2] == 0 && winarr[5] == 2 && winarr[8] == 2)) {
			b3.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox3);
			else
				playpanel.add(crossimgbox3);
			winarr[2] = 1;
			positions.remove(positions.indexOf(3));
			return true;
		}
		if ((winarr[2] == 2 && winarr[5] == 0 && winarr[8] == 2)) {
			b6.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox6);
			else
				playpanel.add(crossimgbox6);
			
			winarr[5] = 1;
			positions.remove(positions.indexOf(6));
			return true;
		}
		if ((winarr[2] == 2 && winarr[5] == 2  && winarr[8] == 0)) {
			b9.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox9);
			else
				playpanel.add(crossimgbox9);
			
			winarr[8] = 1;
			positions.remove(positions.indexOf(9));
			return true;
		}
		if ((winarr[0] == 0 && winarr[4] == 2 && winarr[8] == 2)) {
			b1.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox1);
			else
				playpanel.add(crossimgbox1);
			
			winarr[0] = 1;
			positions.remove(positions.indexOf(1));
			return true;
		}
		if ((winarr[0] == 2 && winarr[4] == 0 && winarr[8] == 2)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			winarr[4] = 1;
			positions.remove(positions.indexOf(5));
			return true;
		}
		if ((winarr[0] == 2 && winarr[4] == 2 && winarr[8] == 0)) {
			b9.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox9);
			else
				playpanel.add(crossimgbox9);
			winarr[8] = 1;
			positions.remove(positions.indexOf(9));
			return true;
		}
		if ((winarr[2] == 0 && winarr[4] == 2 && winarr[6] == 2)) {
			b3.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox3);
			else
				playpanel.add(crossimgbox3);
			
			winarr[2] = 1;
			positions.remove(positions.indexOf(3));
			return true;
		}
		if ((winarr[2] == 2 && winarr[4] == 0 && winarr[6] == 2)) {
			b5.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox5);
			else
				playpanel.add(crossimgbox5);
			
			winarr[4] = 1;
			positions.remove(positions.indexOf(5));
			return true;
		}
		if ((winarr[2] == 2 && winarr[4] == 2 && winarr[6] == 0)) {
			b7.setVisible(false);
			if(userchoice.equals("cross"))
				playpanel.add(circleimgbox7);
			else
				playpanel.add(crossimgbox7);
			winarr[6] = 1;
			positions.remove(positions.indexOf(7));
			return true;
		}
		return false;
	}

	public void playpanelsetup() {

		panelcont.add(playpanel, "3");
		playpanel.setSize(400, 400);
		playpanel.setLayout(null);
		playpanel.setBackground(Color.WHITE);
		gridholder.setBounds(90, 70, 200, 200);
		playpanel.add(gridholder);
	}

	private void initvariables() {

		gridholder = new JLabel(gridimg);
		rL1 = new JLabel(rowLineImg);
		rL2 = new JLabel(rowLineImg);
		rL3 = new JLabel(rowLineImg);
		cL1 = new JLabel(columLineImg);
		cL2 = new JLabel(columLineImg);
		cL3 = new JLabel(columLineImg);
		cornerL1 = new JLabel(cornerLineImg1);
		cornerL2 = new JLabel(cornerLineImg2);
		b1 = new JButton("-");
		b2 = new JButton("-");
		b3 = new JButton("-");
		b4 = new JButton("-");
		b5 = new JButton("-");
		b6 = new JButton("-");
		b7 = new JButton("-");
		b8 = new JButton("-");
		b9 = new JButton("-");
		crossimgbox1 = new JLabel(crossimg);
		crossimgbox2 = new JLabel(crossimg);
		crossimgbox3 = new JLabel(crossimg);
		crossimgbox4 = new JLabel(crossimg);
		crossimgbox5 = new JLabel(crossimg);
		crossimgbox6 = new JLabel(crossimg);
		crossimgbox7 = new JLabel(crossimg);
		crossimgbox8 = new JLabel(crossimg);
		crossimgbox9 = new JLabel(crossimg);
		circleimgbox1 = new JLabel(circleimg);
		circleimgbox2 = new JLabel(circleimg);
		circleimgbox3 = new JLabel(circleimg);
		circleimgbox4 = new JLabel(circleimg);
		circleimgbox5 = new JLabel(circleimg);
		circleimgbox6 = new JLabel(circleimg);
		circleimgbox7 = new JLabel(circleimg);
		circleimgbox8 = new JLabel(circleimg);
		circleimgbox9 = new JLabel(circleimg);
	}

	public void addwinninglines() {

		rL1.setBounds(90, 85, 200, 4);
		rL2.setBounds(90, 150, 200, 4);
		rL3.setBounds(90, 220, 200, 4);
		cL1.setBounds(118, 60, 4, 200);
		cL2.setBounds(188, 60, 4, 200);
		cL3.setBounds(258, 60, 4, 200);
		cornerL1.setBounds(90, 60, 200, 200);
		cornerL2.setBounds(90, 60, 200, 200);

		playpanel.add(rL1);
		playpanel.add(rL2);
		playpanel.add(rL3);
		playpanel.add(cL1);
		playpanel.add(cL2);
		playpanel.add(cL3);
		playpanel.add(cornerL1);
		playpanel.add(cornerL2);

		playpanel.setComponentZOrder(rL1, 4);
		playpanel.setComponentZOrder(rL2, 5);
		playpanel.setComponentZOrder(rL3, 6);
		rL1.setVisible(false);
		rL2.setVisible(false);
		rL3.setVisible(false);
		cL1.setVisible(false);
		cL2.setVisible(false);
		cL3.setVisible(false);
		cornerL1.setVisible(false);
		cornerL2.setVisible(false);
	}

	public void addplaysymbolpos() {

		crossimgbox1.setBounds(100, 75, 40, 30);
		crossimgbox2.setBounds(170, 75, 40, 30);
		crossimgbox3.setBounds(240, 75, 40, 30);
		crossimgbox4.setBounds(100, 140, 40, 30);
		crossimgbox5.setBounds(170, 140, 40, 30);
		crossimgbox6.setBounds(240, 140, 40, 30);
		crossimgbox7.setBounds(100, 210, 40, 30);
		crossimgbox8.setBounds(170, 210, 40, 30);
		crossimgbox9.setBounds(240, 210, 40, 30);
		circleimgbox1.setBounds(100, 75, 40, 30);
		circleimgbox2.setBounds(170, 75, 40, 30);
		circleimgbox3.setBounds(240, 75, 40, 30);
		circleimgbox4.setBounds(100, 140, 40, 30);
		circleimgbox5.setBounds(170, 140, 40, 30);
		circleimgbox6.setBounds(240, 140, 40, 30);
		circleimgbox7.setBounds(100, 210, 40, 30);
		circleimgbox8.setBounds(170, 210, 40, 30);
		circleimgbox9.setBounds(240, 210, 40, 30);
	}

	public void addplaybuttons() {

		b1.setBounds(100, 75, 40, 30);
		b2.setBounds(170, 75, 40, 30);
		b3.setBounds(240, 75, 40, 30);
		b4.setBounds(100, 140, 40, 30);
		b5.setBounds(170, 140, 40, 30);
		b6.setBounds(240, 140, 40, 30);
		b7.setBounds(100, 210, 40, 30);
		b8.setBounds(170, 210, 40, 30);
		b9.setBounds(240, 210, 40, 30);
		b1.setFocusable(false);
		b2.setFocusable(false);
		b3.setFocusable(false);
		b4.setFocusable(false);
		b5.setFocusable(false);
		b6.setFocusable(false);
		b7.setFocusable(false);
		b8.setFocusable(false);
		b9.setFocusable(false);
		playpanel.add(b1);
		playpanel.add(b2);
		playpanel.add(b3);
		playpanel.add(b4);
		playpanel.add(b5);
		playpanel.add(b6);
		playpanel.add(b7);
		playpanel.add(b8);
		playpanel.add(b9);
	}

	public void fillarray() {
		positions.clear();
		for (int i = 1; i <= 9; i++)
			positions.add(i);
		System.out.println(positions);
	}

}
