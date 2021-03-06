package model;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Home extends JFrame {
		public JFrame mainframe ;
		public JPanel panelcont = new JPanel();
		public JPanel homepanel = new JPanel();
		public JLabel Image;
		public ImageIcon img = new ImageIcon(getClass().getResource("banner.gif"));
		public ImageIcon frameIcon = new ImageIcon(getClass().getResource("frameIcon.png"));
		public JButton playbtn,exitbtn;
		public CardLayout cl = new CardLayout();
		public JPanel loginpanel = new JPanel() ;
		public JLabel name,rbtnimg1,rbtnimg2,namenotselected;
		public JTextField namebox;
		public JRadioButton choice1,choice2;
		public JButton gobtn,backtohome;
		public ButtonGroup bg = new ButtonGroup();
		public ImageIcon crossimg = new ImageIcon(getClass().getResource("cross.png"));
		public ImageIcon circleimg = new ImageIcon(getClass().getResource("circle.png"));
		public String userchoice  =  "cross";
		
		public JPanel playpanel = new JPanel();
		public ImageIcon gridimg = new ImageIcon(getClass().getResource("grid.png"));
		public ImageIcon rowLineImg = new ImageIcon(getClass().getResource("verticalLine.png"));
		public ImageIcon columLineImg = new ImageIcon(getClass().getResource("horizontalLine.png"));
		public ImageIcon cornerLineImg1 = new ImageIcon(getClass().getResource("corner-line.png"));
		public ImageIcon cornerLineImg2 = new ImageIcon(getClass().getResource("corner-line2.png"));
		public JLabel gridholder, rL1, rL2, rL3, cL1, cL2, cL3, cornerL1, cornerL2;
		public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
		public JLabel crossimgbox1, crossimgbox2, crossimgbox3, crossimgbox4, crossimgbox5, crossimgbox6, crossimgbox7,
				crossimgbox8, crossimgbox9;
		public JLabel circleimgbox1, circleimgbox2, circleimgbox3, circleimgbox4, circleimgbox5, circleimgbox6,
				circleimgbox7, circleimgbox8, circleimgbox9;
		
		public ArrayList<Integer> positions = new ArrayList<Integer>();
		public Random randpos = new Random();
		public int[] winarr = {0,0,0,0,0,0,0,0,0};
		
	public Home()  {
		mainframe = new JFrame();
		Image = new JLabel(img);
		playbtn = new JButton("Play");
		exitbtn = new JButton("Quit");
		
		//mainframe setting
		this.setLayout( null );
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Tic Tac Toe");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setIconImage(frameIcon.getImage());
		this.add(panelcont);
		
		//panel container setting
		panelcont.setLayout(cl);
		panelcont.setSize(400,400);
		panelcont.add(homepanel,"1");
		cl.show(panelcont, "1");
		
		//homepanel settings
		this.homepanel.setSize(400,400);
		this.homepanel.setLayout(null);
		homepanel.setBackground(Color.WHITE);
		Image.setBounds(90, 30, 200, 220);
		playbtn.setBounds(140, 250, 100, 30);
		playbtn.setBackground(Color.GREEN);
		exitbtn.setBounds(140, 290, 100, 30);
		exitbtn.setBackground(Color.RED);
		exitbtn.setForeground(Color.WHITE);
		homepanel.add(Image);
		homepanel.add(playbtn);
		homepanel.add(exitbtn);
		validate();
		
		
		//buttin methods
		playbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(panelcont, "2");
			}
		});
		exitbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
	}
	
}
