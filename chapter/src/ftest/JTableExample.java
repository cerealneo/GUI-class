package ftest;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class JTableExample extends JFrame {
private String colName[] = { "이름", "나이", "직업" };
private DefaultTableModel model = new DefaultTableModel(colName,0);
private JTable table = new JTable(model);
private JPanel pnl = new JPanel();

public JTableExample() {
this.setTitle("JTable");
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setBounds(100, 100, 500, 500);

getContentPane().add(new JScrollPane(table));
this.setVisible(true);
}
public static void main(String[] args){
new JTableExample();
}
}