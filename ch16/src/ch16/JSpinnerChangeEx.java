package ch16;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.*;

	public class JSpinnerChangeEx extends JFrame {
		JPanel panel = new JPanel();
		JSpinner spinnerString;
		JSpinner spinnerInteger;
		JSpinner spinnerDate;
		JButton btn=new JButton(" 표시하기 ");
		JTextField tf=new JTextField(30);
	
		public JSpinnerChangeEx() {
			setTitle("JSpinnerEx");
			setSize(380, 150);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c=getContentPane();
			c.setLayout(new FlowLayout());
			// List Model
			String[] items = { "소설", "잡지", "웹툰", "전공서적", "취미" };
			SpinnerListModel listModel = new SpinnerListModel(items);
			spinnerString = new JSpinner(listModel);
			spinnerString.setPreferredSize(new Dimension(100, 20));
			panel.add(spinnerString);
			btn.addActionListener(new ActionHandler());
			ChangeHandler handler=new ChangeHandler();
			// Number Model
			SpinnerNumberModel numberModel = new SpinnerNumberModel(5, 0, 9, 1);
			spinnerInteger = new JSpinner(numberModel);
			spinnerInteger.setPreferredSize(new Dimension(50, 20));
			panel.add(spinnerInteger);
			// Date Model
			SpinnerDateModel dateModel = new SpinnerDateModel();
			dateModel.setCalendarField(Calendar.MONTH);
			spinnerDate = new JSpinner(dateModel);
			// 날짜를 편집할 수 있는 편집기 지정
			spinnerDate.setEditor(new JSpinner.DateEditor(spinnerDate, "yyyy.MM.dd"));
			panel.add(spinnerDate);
			spinnerString.addChangeListener(handler);
			spinnerInteger.addChangeListener(handler);
			spinnerDate.addChangeListener(handler);
			c.add(panel);
			c.add(btn);
			c.add(tf);
			setVisible(true);
			}
		class ChangeHandler implements ChangeListener {
			public void stateChanged(ChangeEvent e) {
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy.MM.dd");
			tf.setText(spinnerString.getValue().toString()+":"+
			spinnerInteger.getValue().toString()+":"+
			dateFormat.format(spinnerDate.getValue()));
			}
			}
			class ActionHandler implements ActionListener {
			public void actionPerformed(ActionEvent e) {
			SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
			tf.setText(spinnerString.getValue().toString()+":"+
			spinnerInteger.getValue().toString()+":"+
			dateFormat.format(spinnerDate.getValue()));
			}
			}
			public static void main(String[] args) {
			new JSpinnerChangeEx();
			}
			}
		