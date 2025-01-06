package ch11;

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class GrapihicEx extends JFrame{
	JPanel panel=new BarPanel();
	int[] y={56,78,166,89,150,111};
	public GrapihicEx() {
		setSize(460,360);
		setTitle("Bar-Graph Ex");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		setVisible(true);
	}
	
	class BarPanel extends JPanel{
		public void paintComponent(Graphics g) {
			Graphics2D g2=(Graphics2D) g;
			Shape shape;
			g2.setColor(Color.BLUE);
			for(int i=0;i<y.length;i++) {
				shape=new Rectangle2D.Double(i*70+30, 300-y[i], 50, y[i]);
				g2.setColor(Color.BLUE);
				g2.fill(shape);
				g2.setColor(Color.LIGHT_GRAY);
				g2.drawString(y[i]+"", i*70+50, 300-y[i]+15);
			}
		}
	}

	public static void main(String[] args) {
		new GrapihicEx();

	}

}
