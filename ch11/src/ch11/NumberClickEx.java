package ch11;

import java.awt.*;
import javax.swing.*;

public class NumberClickEx extends JFrame{
	Container c = getContentPane();
	JLabel [] label = new JLabel[26];
	JButton button1=new JButton("GAME AGAIN");
	JTextField tf = new JTextField("  00sec",5);
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	//�ҳ� 2�� �� ��ư 2�� �� ���� ����
	
	public NumberClickEx() {
		setTitle("Mouse Test - Exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		//Ÿ��Ʋ �̸� �� ������ �� ����
		int randNum1 = 0;
		int randNum2 = 0;
		for(int i = 1; i < 26; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setSize(40,30);
			//��Ʈ ���� �� ������ ��Ʈ������ ����� �� �ֵ��� ����
			randNum1 = (int)(Math.random()*600)+30;
			randNum2 = (int)(Math.random()*400)+30;
			//�������� ȭ�鿡 ���;� ������ ���� ����
			label[i].setBounds(randNum1, randNum2, 26, 26);
			label[i].setFont(new Font("", Font.BOLD, 20));
			label[i].setBackground(Color.YELLOW);
			//���� ���� �� ��Ʈ ����
			label[i].setOpaque(true);
			//���� ��� ����
			p1.setLayout(null);
			//p1�� ���̾ƿ��� null�� ����
			p1.add(label[i]);
			//p1�� label �߰�
			p2.add(tf);
			p2.add(button1);
			//p2�� �ð� �ؽ�Ʈ�ʵ�� ���Ӿ���� ��ư �߰�
			tf.setEditable(false);
			//�ð��� ������ ������ �ؽ�Ʈ�ʵ� �Է� �� �� ������ ��Ȱ��ȭ
			button1.setFont(new Font("", Font.BOLD, 20));
			tf.setFont(new Font("", Font.BOLD, 20));
			//��ư ��Ʈ ����
			c.add(p1);
			c.add(p2,BorderLayout.SOUTH);
			//����Ʈ�ҿ� p1,p2 �߰��ϰ� p2�� ��δ����̾ƿ� ����
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new NumberClickEx();

	}

}
