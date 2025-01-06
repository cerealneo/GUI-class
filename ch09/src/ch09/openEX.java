package ch09;
import java.awt.*;
import javax.swing.*;

public class openEx extends JFrame{
	JPanel p1,p2;
	JButton[] button=new JButton[3];
	JLabel[] label=new JLabel[3];
			
	public openEx() {
		setTitle("OpenEx");
		setSize(300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newComponents();
		setComponents();
		addComponents();
		setVisible(true);
	}

	void newComponents() {
		String[] bName= {"Open","Read","Close"};
		String[] lName= {"Hello","Love","Java"};
		
		p1=new JPanel();
		p2=new JPanel();
		for(int i=0;i<3;i++) {
			button[i]=new JButton(bName[i]);
			label[i]=new JLabel(lName[i]);
		}
	}
	void setComponents() {
		p2.setLayout(null);
		p2.setBackground(Color.orange);
		label[0].setBounds(100,  30, 40, 20);
		label[1].setBounds(200, 150, 40, 20);
		label[2].setBounds(120,  60, 40, 20);
	}
	void addComponents() {
		p1.add(button[0]);
		p1.add(button[1]);
		p1.add(button[2]);
		p2.add(label[0]);
		p2.add(label[1]);
		p2.add(label[2]);
		add(p1,BorderLayout.NORTH);
		add(p2);
	}
	public static void main(String[] args) {
		new openEx();
	}

}
