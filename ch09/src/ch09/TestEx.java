package ch09;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 

public class TestEx extends JFrame{
	Container c=getContentPane();
	JPanel p1,p2,p3;
	JLabel[] label=new JLabel[3];
	JTextField[] tf=new JTextField[3];
	JButton bu=new JButton();
	JTextField tf2=new JTextField("",20);

	
	public TestEx() {
		setTitle("���ڰ���");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newComponents();
		setComponents();
		addComponents();
		setVisible(true);
	}
	
	void newComponents(){
		String[] name= {"������ �Է��ϼ���","���ڸ� �Է��ϼ���","����� �Է��ϼ���"};
		p1=new JPanel();
		p2=new JPanel();
		for(int i=0;i<3;i++) {
			label[i]=new JLabel(name[i]);
			tf[i]=new JTextField(10);
			tf[i].setHorizontalAlignment(JTextField.RIGHT);
		}
		bu=new JButton("���");
		
		bu.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == bu) { 
                    float result = Integer.parseInt(tf[0].getText()) * (1+Float.parseFloat(tf[1].getText()) *1+Float.parseFloat(tf[2].getText())); 
                    //�� �ؽ�Ʈ�ʵ��� ���� �ҷ����� ����Ų �� 
                    String str = Float.toString(result);
                    tf2.setText("���ڴ� �� " + str + "���� �Դϴ�."); 
				}
			}
		});
		p3=new JPanel();
		
	}

	void setComponents() {
		p1.setLayout(new GridLayout(3, 2, 5, 5));
		this.setResizable(false);
	}
	
	void addComponents() {
		for(int i=0;i<3;i++) {
			p1.add(label[i]);
			p1.add(tf[i]);
		}
		p2.add(bu);
		p3.add(tf2);
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		tf2.setEditable(false);
	}
	
	public static void main(String[] args) {
		new TestEx();
	}



}
