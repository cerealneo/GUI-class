package ch11;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AdminEx extends JFrame{
	Container c=getContentPane();
	JLabel label=new JLabel();
	JTextField tf1 = new JTextField(7);
	JTextField tf2 = new JTextField(10);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel pp1 = new JPanel();
	JPanel pp2 = new JPanel();
	JButton bu1=new JButton("�Է�");
	JButton bu2=new JButton("����");
	JButton bu3=new JButton("����");
	JButton bu4=new JButton("���");
	ButtonGroup g = new ButtonGroup();
	JRadioButton boy = new JRadioButton("����");
	JRadioButton Grie = new JRadioButton("����");
	JCheckBox CB1 = new JCheckBox("����");
	JCheckBox CB2 = new JCheckBox("�߱���");
	JCheckBox CB3 = new JCheckBox("�Ϻ���");
	JCheckBox CB4 = new JCheckBox("�����ξ�");
	JCheckBox CB5 = new JCheckBox("���þƾ�");
	JTextArea ta1 = new JTextArea(10,40);
	//�̸�, ��ȭ��ȣ �Է� ���� �� �ؽ�Ʈ�ʵ�� ����,���� ���� ���� ��ư �߰�
	//���� �ܱ������ �� �ֵ��� üũ�ڽ� �߰� �� �ؽ�Ʈ������� �Է�,����,����,���
	// �Է� ��ư ����

	public AdminEx() {
		setTitle("������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		//Ÿ��Ʋ �� ������ �⺻ ����
		c.setLayout(new FlowLayout());
		p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        pp1 = new JPanel();
        pp1.setLayout(new BorderLayout());
        pp2 = new JPanel();
        pp2.setLayout(new BorderLayout());
        // �� �г��� ���̾ƿ� ����
		p1.add(new JLabel("�̸�"));
		p1.add(tf1);
		p1.add(new JLabel("��ȭ"));
		p1.add(tf2);
		//�̸� �� ��ȭ��ȣ �Է� �ؽ�Ʈ�ʵ� �� �ȳ� ���� �߰�
		g.add(boy);
		g.add(Grie);
		p1.add(boy);
		p1.add(Grie);
		// ���� ���� ���� ������ư �߰�
		p2.add(CB1);
		p2.add(CB2);
		p2.add(CB3);
		p2.add(CB4);
		p2.add(CB5);
		//���� �ܱ��� ���� üũ�ڽ� �߰�
		p3.add(ta1);
		//������ ���� ���ü� �ֵ��� �ؽ�Ʈ������ �߰�
		p4.add(bu1);
		p4.add(bu2);
		p4.add(bu3);
		p4.add(bu4);
		//�Է�, ����, ����, ��� ��ư �߰�
		p2.setBorder(new TitledBorder(new LineBorder(Color.cyan,1),"���� �ܱ��� ����"));
		p3.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),""));
		//�ؽ�Ʈ ������ �� ���� �ܱ��� ���� �κ� �׵θ� ����
		tf1.setBackground(Color.YELLOW);
		//�̸� �Է¶� ��� ���� ����
		boy.setBackground(Color.LIGHT_GRAY);
		Grie.setBackground(Color.LIGHT_GRAY);
		//����,���� ���� ������ ����
		pp1.add(p1,BorderLayout.NORTH);
	    pp1.add(p2,BorderLayout.SOUTH);
	    pp2.add(p3,BorderLayout.NORTH);
	    pp2.add(p4,BorderLayout.SOUTH);
	   //���̾ƿ� ����  
	    c.add(pp1,BorderLayout.NORTH);
	    c.add(pp2,BorderLayout.SOUTH);
	    //���̾ƿ� ����
		setVisible(true);
		}

	public static void main(String[] args) {
		new AdminEx();

	}

}