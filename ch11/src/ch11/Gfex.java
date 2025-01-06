package ch11;//12��

import java.awt.*;


import javax.swing.*;

public class Gfex extends JFrame{
	public Gfex panel = new Gfex();
	public Gfex() {
		setTitle("�׷��Ƚ� �̿���");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}
	
	class Paint extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.fillRect(10,10,100,100);
			g.setColor(Color.RED);
			g.fillOval(10,120,100,100);
			g.fillRoundRect(120,10,100,100,20,20);
			g.setColor(Color.blue);
			g.fillArc(120,120,100,100,120,270);
			g.setFont(new Font("���",Font.BOLD,32));
			g.drawString("�ȳ��ϼ���",10,150);
		}
	}

	public static void main(String[] args) {
		new Gfex();
	}

}
