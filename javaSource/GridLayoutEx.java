package ch09;

import java.awt.*;
import javax.swing.*;

public class GridLayoutEx extends JFrame{
	Container c=getContentPane();
	JPanel p1,p2;
	JLabel[] label=new JLabel[4];
	JTextField[] textField=new JTextField[4];
	JButton[] button=new JButton[3];
	
	public GridLayoutEx() {
		setTitle("Grid TEST");
		setSize(300,180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newComponents();
		setComponents();
		addComponents();
		setVisible(true);
	}
	
	void newComponents(){
		String[] name= {"이름","학년","학과","과목"};
		p1=new JPanel();
		p2=new JPanel();
		for(int i=0;i<4;i++) {
			label[i]=new JLabel(name[i]);
			textField[i]=new JTextField(20);
		}
		button[0]=new JButton("등록");
		button[1]=new JButton("수정");
		button[2]=new JButton("삭제");
	}

	void setComponents() {
		p1.setLayout(new GridLayout(4, 2, 5, 5));
		button[2].setEnabled(false);
		textField[2].setText("컴퓨터공학과");
		this.setResizable(false);
	}
	
	void addComponents() {
		for(int i=0;i<4;i++) {
			p1.add(label[i]);
			p1.add(textField[i]);
		}
		p2.add(button[0]);
		p2.add(button[1]);
		p2.add(button[2]);
		c.add(p1,BorderLayout.CENTER);
		c.add(p2,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new GridLayoutEx();
	}

}
