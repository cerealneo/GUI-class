package ch09;

import javax.swing.*;
import java.awt.*;

public class FIirstFrame extends JFrame{

public FIirstFrame() {
	setTitle("FirstFrame");
	setSize(300,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	JButton button1=new JButton("ok");
	JButton button2=new JButton("cancel");
	JButton button3=new JButton("ig");
	JPanel panel=new JPanel();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.setBackground(Color.RED);
	add(panel,BorderLayout.NORTH);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new FIirstFrame();
	}

}
