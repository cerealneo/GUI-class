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

		String[] menu = { "아메리카노", "카페라떼", "망고주스", "사과주스" };
		ItemHandler itemHandler = new ItemHandler();
		for (int i = 0; i < 4; i++) {
			check[i] = new JCheckBox(menu[i]);
			add(check[i]);
			check[i].addItemListener(itemHandler);
		}
		label = new JLabel("금액출력부분");
		label.setFont(new Font("고딕체", Font.BOLD, 30));
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
			label.setText("합계는 " + sum + "원 입니다.");
		}
	}

	public static void main(String[] args) {
		new CheckboxEx();
	}
}