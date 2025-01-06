package ch11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class InterestEx extends JFrame{
	Container c=getContentPane();
	JPanel p1,p2,p3;
	JLabel[] label=new JLabel[3];
	JTextField[] tf=new JTextField[3];
	JButton bu=new JButton();
	JTextField tf2=new JTextField("",20);
	//�ؽ�Ʈ �г� 3��, ���� 3��, �Է� ���� �ý�Ʈ �ʵ� 3��, ��� ��ư 1��, ����� �ؽ�Ʈ �ʵ� 1�� ����

	
	public InterestEx() {
		setTitle("���ڰ���");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newComponents();
		setComponents();
		addComponents();
		setVisible(true);
		// Ÿ��Ʋ, ������ �� �⺻ ����
	}
	
	void newComponents(){
		String[] name= {"������ �Է��ϼ���","���ڸ� �Է��ϼ���","����� �Է��ϼ���"};
		//���� ����
		p1=new JPanel();
		p2=new JPanel();
		//�г� ��Ī ����
		for(int i=0;i<3;i++) {
			label[i]=new JLabel(name[i]);
			tf[i]=new JTextField(10);
			tf[i].setHorizontalAlignment(JTextField.RIGHT); //������ ����
		}
		bu=new JButton("���"); //��� ��ư �߰�
		
		bu.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bu) {
					double i, j, k, sum;
					i = Double.parseDouble(tf[0].getText());  // i= ù���� �ؽ�Ʈ�ʵ� �� ������
					j = Double.parseDouble(tf[1].getText());  // j= ù���� �ؽ�Ʈ�ʵ� �� ������
					k = Double.parseDouble(tf[2].getText());  // k= ù���� �ؽ�Ʈ�ʵ� �� ������
						sum = (i * (Math.pow((1+ ((j/k)/10)), k))); //sum= �������� �Է�
					String str = Double.toString(sum);  //������ sum���� ��Ʈ������ ������
					tf2.setText(str); //�ؽ�Ʈ�ʵ忡 str ���� �����
					tf2.setHorizontalAlignment(JTextField.RIGHT); //������ ����
				} // ����ư Ŭ���� ���ڰ� ���� �� �ֵ��� �׼� ������ �߰�
			}
		});
		tf2.setBackground(Color.LIGHT_GRAY);
		p3=new JPanel(); // ��� �ؽ�Ʈ �ʵ� ����
		
	}

	void setComponents() {
		p1.setLayout(new GridLayout(3, 2, 5, 5));
		this.setResizable(false); //���̾ƿ� ����
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
		tf2.setEditable(false); //��� ���̾ƿ� add �� �� �ؿ� ������� ������ �� ������ ����
	}
	
	public static void main(String[] args) {
		new InterestEx();
	}



}