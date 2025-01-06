package ch11;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckEx extends JFrame {
	JPanel p1, p2;
	JCheckBox[] check = new JCheckBox[4];
	JLabel label = new JLabel();
	int[] price = {2000, 2500, 2800, 5000};
	int sum = 0;
	public CheckEx() {
		setTitle("체크박스 생성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		String[] menu = {"하", "이", "루", "뿡"};
		for(int i=0; i<check.length; i++) {
			check[i] = new JCheckBox(menu[i]);
			p1.add(check[i]);
			check[i].addItemListener(new itemHandler());
		}
		label.setText("0");
		label.setFont(new Font("돋움", Font.BOLD, 58));
		label.setSize(100, 100);
		p2.add(label);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		setVisible(true);
	}
	
	class itemHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				for(int i=0; i<check.length; i++)
					if(e.getItem() == check[i])
						sum += price[i];
			}
			else {
				for(int i=0; i<check.length; i++)
					if(e.getItem() == check[i])
						sum -= price[i];
			}
			label.setText("합계는"+sum+"입니다.");
		}
		
	}
	
	public static void main(String[] args) {
		new CheckEx();

	}

}
