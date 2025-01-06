package ch11;

import javax.swing.*;
import java.awt.*;

public class First extends JFrame {
	JLabel[] label = new JLabel[3];
	public First() {
		setTitle("레이블 처리하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		label[0] = new JLabel("뭐라는지.");
		ImageIcon mococo = new ImageIcon("images/qqw.png");
		label[1] = new JLabel(mococo);
		ImageIcon mococo2 = new ImageIcon("images/mococo.jpg");
		label[2] = new JLabel("ㅠㅠ", mococo2, SwingConstants.LEFT);
		
		add(label[0], BorderLayout.NORTH);
		add(label[1], BorderLayout.CENTER);
		add(label[2], BorderLayout.SOUTH);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new First();

	}

}
