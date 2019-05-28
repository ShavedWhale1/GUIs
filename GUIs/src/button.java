//Ben Siri 5-27-2019

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class button extends JFrame implements ActionListener
{
	private JButton buttonOne;
	private JButton buttonTwo;
	private JButton buttonThree;
	
	button(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		buttonOne = new JButton("Button One");
		buttonTwo = new JButton("Button Two");
		buttonThree = new JButton("Button Three");
		
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);
		
		add(buttonOne);
		add(buttonTwo);
		add(buttonThree);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		int random = (int)(Math.random()*3);
		
		
		if(0 != random)
		{
			getContentPane().setBackground(Color.green);
			repaint();
		}
		else
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args)
	{
		button ben = new button("Ben's Button");
		
		ben.setSize(500,100);
		ben.setVisible(true);
	}
}
