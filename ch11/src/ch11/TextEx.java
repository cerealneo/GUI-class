package ch11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEx extends JFrame implements ActionListener{
	JLabel la;
	JTextField tf;
	JTextArea ta;
	Container c;
	public TextEx() {
		setTitle("�ؽ�Ʈ����� �߰��ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		c=getContentPane();
		la=new JLabel("<����>Ű�� ġ�� �߰��˴ϴ�");
		tf=new JTextField(20);
		ta=new JTextArea(10,20);
		ta.setEditable(false);
		ta.setBackground(Color.LIGHT_GRAY);
		c.setLayout(new FlowLayout());
		c.add(la);
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(this);
		setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText(tf.getText()+"\n"+ta.getText());
		tf.setText("");
		
	}
	public static void main(String[] args) {
		new TextEx();
	}

}
