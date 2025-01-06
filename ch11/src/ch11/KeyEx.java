package ch11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class KeyEx extends JFrame{
	Container c=getContentPane();
	JPanel p1,p2,p3;
	JTextField[] tf=new JTextField[2];
	JButton[] bu=new JButton[3];
	JLabel label=new JLabel();
	JLabel la1=new JLabel();
	JLabel la2=new JLabel();
	JLabel la3=new JLabel();
	String[] BuName= {"Alt","Ctrl","Shift"};
    ImageIcon apple=new ImageIcon("images/apple.png");
    ImageIcon banana=new ImageIcon("images/banana.png");
    ImageIcon cherry=new ImageIcon("images/cherry.png");
    //��� 3��, �ؽ�Ʈ�ʵ� 2��, ��Ʈ,��Ʈ��,����Ʈ ������ ��ư �߰�
  
	
	public KeyEx() {
		setTitle("Key Event Test - With CTRL/SHIFT/SHIFT key");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,300);
		setLayout(new BorderLayout());
		
		p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        p2 = new JPanel();
        p2.setLayout(new FlowLayout());

        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        //�⺻ ������ �� Ÿ��Ʋ ���� �� ���̾ƿ� ����
        label=new JLabel();
        
        for (int i = 0; i < tf.length; i++) {
            tf[i] = new JTextField(10);
            p1.add(tf[i]);
        } //�ؽ�Ʈ�ʵ� ���

        tf[1].setEditable(false);
        //�ι�° ĭ�� �Է����� ���ϵ��� ����

        for(int i=0;i<bu.length;i++) {
            bu[i]=new JButton(BuName[i]);
            bu[i].addKeyListener(new KeyListener());
            p1.add(bu[i]); // Ű�� ������ ��ư ������ ����ǵ��� Ű������ �߰�
        }
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.CENTER);
        this.add(p3,BorderLayout.SOUTH);
        //�г� �߰�
        
        p2.add(label);
        tf[0].addKeyListener(new KeyListener());
        //�ؽ�Ʈ�ʵ忡 �Է��ϸ� ���� �� �̸��� �ߵ��� Ű������ �߰�
		setVisible(true);
	}
	
	   class KeyListener extends KeyAdapter{
	        public void keyPressed(KeyEvent e) {
	        	int KeyCode = e.getKeyCode();
	        	if(e.getKeyCode()==e.VK_ALT) {
	                bu[0].setBackground(Color.RED);
	        	    bu[1].setBackground(Color.WHITE);
	        	    bu[2].setBackground(Color.WHITE);
	        	}
	            else if(e.getKeyCode()==e.VK_CONTROL) {
	            	bu[0].setBackground(Color.WHITE);
	            	bu[1].setBackground(Color.RED);
	            	bu[2].setBackground(Color.WHITE);
	            }
	            else if(e.getKeyCode()==e.VK_SHIFT) {
	            	bu[0].setBackground(Color.WHITE);
	            	bu[1].setBackground(Color.WHITE);
	            	bu[2].setBackground(Color.RED);
	            } //��ư�� ������ ���������� ������ �� �ֵ��� ������ ����
	        	if((KeyCode== 65)) {
	            	label.setIcon(apple);
	            	la1=new JLabel("apple");
	            	p3.add(la1);
	            	la1.setFont(new Font("���ü", Font.BOLD, 30));
	            }
	            else if((KeyCode== 66)){
	            	label.setIcon(banana);
	            	la2=new JLabel("banana");
	            	p3.add(la2);
	            	la2.setFont(new Font("���ü", Font.BOLD, 30));
	            }
	            else if((KeyCode== 67)){
	            	label.setIcon(cherry);
	            	la3=new JLabel("cherry");
	            	p3.add(la3);
	            	la3.setFont(new Font("���ü", Font.BOLD, 30));
	            } //�ؽ�Ʈ �ʵ忡 �Է��ϸ� ���� �� �۾��� �ߵ��� Ű������ ����
	        	}
	        } 

	public static void main(String[] args) {
		new KeyEx();

	}

}
