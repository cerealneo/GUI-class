package ch11;

import java.awt.*;
import javax.swing.*;

public class Checkbox extends JFrame {
	public Checkbox() {
		setTitle("체크박스 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		
		setLayout(new FlowLayout());
		ImageIcon icon1 = new ImageIcon("images/mococo.png");
		ImageIcon icon2 = new ImageIcon("images/qqw.png");
		
		JCheckBox mococo = new JCheckBox("모코코");
		JCheckBox qqw = new JCheckBox("몰라", icon2);
		JCheckBox qw = new JCheckBox("앙", icon1);
		
		qw.setBorderPainted(true);
		qw.setSelectedIcon(icon2);
		
		add(mococo);
		add(qqw);
		add(qw);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new Checkbox();

	}

}
