package ch11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListEx extends JFrame{
	JList<String>list;
	JTextField tf;
	Container c=getContentPane();
	//����Ʈ �� �ؽ�Ʈ �ʵ� ����
	
	public ListEx() {
		setTitle("List Test - Multi Selection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		//gui �̸�, ������ ����
		String[] cities= {"����","����","�ĸ�","�õ��","�ν���������","����","��ũ��","�踮��","�����"};
		list=new JList<String>(cities);//����Ʈ�� ����Ʈ ����
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//��Ƽ ������ �ɼ� �ֵ��� �߰�
		list.setVisibleRowCount(7);
		//ȭ�鿡 �ߴ¸���Ʈ ���� ����
		list.addListSelectionListener(new ListHandler());
		//����Ʈ�� ������ �Ʒ��� �ý�Ʈ�ʵ忡 �߰��� ���ֵ��� �������ڵ鷯 �߰�
		add(new JScrollPane(list),BorderLayout.NORTH);
		//����Ʈ�� ��ũ�Ѱ� ���̾ƿ� ����
		tf=new JTextField(10);
		// �ؽ�Ʈ�ʵ� ����
		c.add(tf);
		//����Ʈ�ҿ� �ؽ�Ʈ�ʵ� �߰�
		setVisible(true);
		c.add(tf, BorderLayout.CENTER);
		//���̾ƿ� ����
		}

	class ListHandler implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e) {
			tf.setText(list.getSelectedValuesList()+"");
			// ����Ʈ ������ ���� �ؽ�Ʈ�ʵ忡 ���;ߵ����� ������ ����(�������ð��ɼ���)
			
		}
	}

	public static void main(String[] args) {
		new ListEx();

	}

}
