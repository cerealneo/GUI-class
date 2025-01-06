package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxEx extends JFrame {
	JCheckBox[] check = new JCheckBox[4];
	JLabel label;
	int sum = 0;
	int[] price = { 200, 280, 330, 300 };

	public CheckboxEx() {
		setTitle("Checkbox Exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 200);

		String[] menu = { "�Ƹ޸�ī��", "ī���", "�����ֽ�", "����ֽ�" };
		ItemHandler itemHandler = new ItemHandler();
		for (int i = 0; i < 4; i++) {
			check[i] = new JCheckBox(menu[i]);
			add(check[i]);
			check[i].addItemListener(itemHandler);
		}
		label = new JLabel("�ݾ���ºκ�");
		label.setFont(new Font("���ü", Font.BOLD, 30));
		add(label);

		setVisible(true);
	}

	class ItemHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (e.getItem() == check[0])
					sum += price[0];
				else if (e.getItem() == check[1])
					sum += price[1];
				else if (e.getItem() == check[2])
					sum += price[2];
				else if (e.getItem() == check[3])
					sum += price[3];
			} else {
				if (e.getItem() == check[0])
					sum -= price[0];
				else if (e.getItem() == check[1])
					sum -= price[1];
				else if (e.getItem() == check[2])
					sum -= price[2];
				else if (e.getItem() == check[3])
					sum -= price[3];
			}
			label.setText("�հ�� " + sum + "�� �Դϴ�.");
		}
	}

	public static void main(String[] args) {
		new CheckboxEx();
	}
}