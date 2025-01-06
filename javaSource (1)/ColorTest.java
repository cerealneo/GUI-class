package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorTest extends JFrame{
	JPanel p1,p2;
	JButton[] button=new JButton[4];
			
	public ColorTest() {
		setTitle("Color Test.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(370,200);
		String[] bName= {"RED","YELLOW","BLUE","RANDOM"};
		p1=new JPanel();
		p2=new JPanel();
		for(int i=0;i<4;i++) {
			button[i]=new JButton(bName[i]);
			p1.add(button[i]);
			button[i].addActionListener(new ButtonListener());
		}
		p2.setBackground(Color.LIGHT_GRAY);
		add(p1,BorderLayout.NORTH);
		add(p2);
		
		
		setVisible(true);
	}
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button[0])
				p2.setBackground(Color.RED);
			else if(e.getSource()==button[1])
				p2.setBackground(Color.YELLOW);
			else if(e.getSource()==button[2])
				p2.setBackground(Color.BLUE);
			else if(e.getSource()==button[3]) {
				int r=(int)(Math.random()*256);
				int g=(int)(Math.random()*256);
				p2.setBackground(new Color(r,g,(int)(Math.random()*256)));
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ColorTest();
	}

}
