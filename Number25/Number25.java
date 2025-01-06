package ch11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Number25 extends JFrame{
	int COUNT=5, seq=0;
	JPanel center, south;
	JTextField tf;
	JButton btn;
	JLabel[] label=new JLabel[COUNT];
	MouseHandler mh=new MouseHandler();
	long startTime, endTime;
	TimerThread thread=new TimerThread();;

	public Number25() {
		setTitle("Number "+COUNT);
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		center = new JPanel();
		south = new JPanel();
		tf = new JTextField(10);
		btn = new JButton(" NEW GAME ");
		for(int i=0;i<COUNT;i++) {
			label[i]=new JLabel(" "+(i+1)+" ");
		}

		center.setBackground(Color.LIGHT_GRAY);
		center.setLayout(null);

		btn.addActionListener(new ActionHandler());
		south.add(tf);
		south.add(btn);

		add(center,BorderLayout.CENTER);
		add(south,BorderLayout.SOUTH);

		setVisible(true);
	}

	void initGame() {
		int x, y;
		seq=0;
		tf.setText("0.0 Sec.");
		startTime=System.currentTimeMillis();
		Random r=new Random();
		Font font=new Font("",Font.BOLD,16);
		for(int i=0;i<COUNT;i++) {
			x=r.nextInt(getWidth()-50);
			y=r.nextInt(getHeight()-100);
			label[i].setFont(font);
			label[i].setLocation(x, y);
			label[i].setSize(40,30);
			label[i].setHorizontalAlignment(JLabel.CENTER);
			label[i].setOpaque(true);
			label[i].setBackground(Color.YELLOW);
			label[i].setVisible(true);
			label[i].addMouseListener(mh);
			center.add(label[i]);
			center.repaint();
		}
		if(thread.getState()==Thread.State.NEW || thread.getState()==Thread.State.TERMINATED) {
			thread=new TimerThread();
			thread.start();
		}
	}

	class TimerThread extends Thread {
		public void run() {
			while(true) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					return;
				}
				endTime=System.currentTimeMillis();
				tf.setText(((endTime-startTime)/100)/10d+" Sec.");				
			}
		}
	}

	class MouseHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			JLabel lbl = (JLabel)e.getSource();
			if(seq<COUNT && lbl==label[seq]) {
				label[seq].setVisible(false);
				seq++;
				if(seq==COUNT)
					thread.interrupt();
			}
		}
	}

	class ActionHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			initGame();
		}
	}

	public static void main(String[] args) {
		new Number25();
	}

}
