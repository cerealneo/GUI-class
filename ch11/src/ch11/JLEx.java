package ch11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class JLEx extends JFrame{
	JList<String>list;
	JTextField tf;
	
	public JLEx() {
		setTitle("리스트 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(100,300);
		setLayout(new FlowLayout());
		String[] cities= {"서울","부산","대구","대전","광주","인천","강릉"};
		list=new JList<String>(cities);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setVisibleRowCount(5);
		list.addListSelectionListener(new ListHandler());
		tf=new JTextField(10);
		add(new JScrollPane(list));
		add(tf);
		setVisible(true);
		}

	class ListHandler implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e) {
			tf.setText(list.getSelectedValue());
			
		}
	}

	public static void main(String[] args) {
		new JLEx();

	}

}
