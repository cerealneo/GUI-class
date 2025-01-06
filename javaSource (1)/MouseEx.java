package ch10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEx extends JFrame{
	Container c=getContentPane();
	JLabel label=new JLabel("Hello");
	public MouseEx() {
		setTitle("Mouse Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,700);
		
		c.setLayout(null);
		label.setSize(90, 20);
		label.setLocation(200, 300);
		c.add(label);
		c.addMouseListener(new MouseHandler());
		c.addKeyListener(new KeyHandler());
		c.setFocusable(true);
		c.requestFocus();
		setVisible(true);
	}
	class KeyHandler extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				label.setLocation(label.getX()-1,label.getY());
			}
			else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				label.setLocation(label.getX()+1,label.getY());				
			}
			else if(e.getKeyCode()==KeyEvent.VK_UP) {
				label.setLocation(label.getX(),label.getY()-1);				
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				label.setLocation(label.getX(),label.getY()+1);				
			}
			label.setText("X="+label.getX()+",Y="+label.getY());
		}
	}
	
	class MouseHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			label.setText("X="+x+",Y="+y);
			label.setLocation(x, y);
		}
		public void mouseEntered(MouseEvent e) {
			c.setBackground(Color.LIGHT_GRAY);
		}
		public void mouseExited(MouseEvent e) {
			c.setBackground(Color.YELLOW);			
		}	
	}
	
	public static void main(String[] args) {
		new MouseEx();
	}

}
