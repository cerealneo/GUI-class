package chapter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class test extends JFrame{
	Container c=getContentPane();
	JLabel la1=new JLabel("고유번호");
	JTextField tf1 = new JTextField(5);
	JLabel la2=new JLabel("이름");
	JTextField tf2 = new JTextField(5);
	JLabel la3=new JLabel("책 이름");
	JTextField tf3 = new JTextField(10);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JTextArea ta1 = new JTextArea(10,40);
	JButton bu1=new JButton("대출");
	JButton bu2=new JButton("반납");
	JButton bu3=new JButton("삭제");
	JButton bu4=new JButton("취소");
	
	public test() {
		setTitle("대출");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		GridLayout grid = new GridLayout(3,3);
		grid.setVgap(5);
		p1.setLayout(grid);
		p1.add(la1);
		p1.add(tf1);
		p1.add(la2);
		p1.add(tf2);
		p1.add(la3);
		p1.add(tf3);
		
		p2.setLayout(new FlowLayout());
		p2.add(new JScrollPane(ta1));
		p3.setLayout(new FlowLayout());
		p3.add(bu1);
		p3.add(bu2);
		p3.add(bu3);
		p3.add(bu4);
		
		la1.setHorizontalAlignment(JLabel.CENTER);
		la2.setHorizontalAlignment(JLabel.CENTER);
		la3.setHorizontalAlignment(JLabel.CENTER);
		
		ta1.setBackground(Color.LIGHT_GRAY);
		ta1.setEditable(false);
		
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		
		setVisible(true);
		}
	
	public static void main(String[] args) {
		new test();

	}

}
