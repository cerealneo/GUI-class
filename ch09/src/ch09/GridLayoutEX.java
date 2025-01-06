package ch09;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEX extends JFrame {
	public GridLayoutEX() {
		setTitle("Grid Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container OHMYGIRL = getContentPane();
		
		JPanel p1 = new JPanel();
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(5);
		
		p1.setLayout(grid);
		p1.add(new JLabel("�̸�"));
		p1.add(new JTextField(""));
		p1.add(new JLabel("����"));
		p1.add(new JTextField(""));
		p1.add(new JLabel("�а�"));
		p1.add(new JTextField(""));
		p1.add(new JLabel("����"));
		p1.add(new JTextField(""));
		
		JPanel p2 = new JPanel();
		
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 40));
		
		p2.add(new JButton("Ȯ��"));
		p2.add(new JButton("����"));
		p2.add(new JButton("����"));
		
		OHMYGIRL.add(p1,BorderLayout.CENTER);
		OHMYGIRL.add(p2,BorderLayout.SOUTH);
		
		setSize(500,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new GridLayoutEX();
	}
}
