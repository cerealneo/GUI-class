//19110091 �̹μ�

package mtest;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class SignUpEx extends JFrame{
	Container c=getContentPane();
	JLabel la1=new JLabel("ID");
	JTextField tf1 = new JTextField(5);
	JLabel la2=new JLabel("�̸�");
	JTextField tf2 = new JTextField(5);
	JLabel la3=new JLabel("�а�");
	JTextField tf3 = new JTextField(10);
	JLabel la4=new JLabel("��ȭ��ȣ");
	JTextField tf4 = new JTextField(10);
	JLabel la5=new JLabel("����");
	ButtonGroup group = new ButtonGroup();
	JRadioButton boy = new JRadioButton("��",true);
	JRadioButton Grie = new JRadioButton("��");
	JCheckBox CB1 = new JCheckBox("�л�",true);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JList<String>list;
	String[] cities= {"�λ�","����","����","�뱸","����","���",};
	JComboBox<String> combo = new JComboBox<String>(cities);
	JTextArea ta1 = new JTextArea(10,40);
	JButton bu1=new JButton("���");
	JButton bu2=new JButton("����");
	JButton bu3=new JButton("����");
	JButton bu4=new JButton("���");
	
	public SignUpEx() {
		setTitle("ȸ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		GridLayout grid = new GridLayout(3,4);
		grid.setVgap(1);
		p1.setLayout(grid);
		p1.add(la1);
		p1.add(tf1);
		p1.add(la2);
		p1.add(tf2);
		p1.add(la3);
		p1.add(tf3);
		p1.add(la4);
		p1.add(tf4);
		p1.add(la5);
		group.add(boy);
		group.add(Grie);
		p1.add(boy);
		p1.add(Grie);
		p1.add(CB1);
		p1.add(combo);
		p2.setLayout(new FlowLayout());
		p2.add(new JScrollPane(ta1));
		p3.setLayout(new FlowLayout());
		p3.add(bu1);
		p3.add(bu2);
		p3.add(bu3);
		p3.add(bu4);
		bu1.addActionListener(new MyActionListener());
		
		la1.setHorizontalAlignment(JLabel.CENTER);
		la2.setHorizontalAlignment(JLabel.CENTER);
		la3.setHorizontalAlignment(JLabel.CENTER);
		la4.setHorizontalAlignment(JLabel.CENTER);
		la5.setHorizontalAlignment(JLabel.CENTER);
		boy.setHorizontalAlignment(JLabel.CENTER);
		Grie.setHorizontalAlignment(JLabel.CENTER);
		CB1.setHorizontalAlignment(JLabel.CENTER);
		boy.setBackground(Color.CYAN);
		Grie.setBackground(Color.CYAN);
		ta1.setBackground(Color.LIGHT_GRAY);
		ta1.setEditable(false);
		
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		
		setVisible(true);
		}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			ta1.setText(tf1.getText()+"\n"+tf2.getText());
			ta1.setText("");
		}
	}
	

	public static void main(String[] args) {
		new SignUpEx();

	}

}
