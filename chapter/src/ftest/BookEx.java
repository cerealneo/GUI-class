package ftest;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class BookEx extends JFrame{
	Container c=getContentPane();
	JLabel la1=new JLabel("ID");
	JTextField tf1 = new JTextField(5);
	JLabel la2=new JLabel("title");
	JTextField tf2 = new JTextField(5);
	JLabel la3=new JLabel("Publisher");
	JTextField tf3 = new JTextField(10);
	JLabel la4=new JLabel("Price");
	JTextField tf4 = new JTextField(10);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JTextField tf5 = new JTextField(10);
	JButton bu1=new JButton("�߰�");
	JButton bu2=new JButton("����");
	JButton bu3=new JButton("����");
	JButton bu4=new JButton("����˻�");
	
	
	String colName[] = { "ID", "å ����", "���ǻ�","����" };
	DefaultTableModel model = new DefaultTableModel(colName,0);
	JTable table = new JTable(model);
	JScrollPane scroll = new JScrollPane(table);
	
	public BookEx() {
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650,400);
		setVisible(true);
		
		p1.add(la1);
		p1.add(tf1);
		p1.add(la2);
		p1.add(tf2);
		p1.add(la3);
		p1.add(tf3);
		p1.add(la4);
		p1.add(tf4);
		p1.setLayout(new FlowLayout());
		
	
		p2.setLayout(new FlowLayout());
		p2.add(new JScrollPane(table));
		
		p3.setLayout(new FlowLayout());
		p3.add(bu1);
		p3.add(bu2);
		p3.add(bu3);
		p3.add(tf5);
		p3.add(bu4);
		
		
	
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		}


	public static void main(String[] args) {
		new BookEx();

	}

}
