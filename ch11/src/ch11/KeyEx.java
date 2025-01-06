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
    //페널 3개, 텍스트필드 2개, 알트,컨트롤,쉬프트 생성할 버튼 추가
  
	
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
        //기본 사이즈 및 타이틀 설정 및 레이아웃 설정
        label=new JLabel();
        
        for (int i = 0; i < tf.length; i++) {
            tf[i] = new JTextField(10);
            p1.add(tf[i]);
        } //텍스트필드 출력

        tf[1].setEditable(false);
        //두번째 칸은 입력하지 못하도록 설정

        for(int i=0;i<bu.length;i++) {
            bu[i]=new JButton(BuName[i]);
            bu[i].addKeyListener(new KeyListener());
            p1.add(bu[i]); // 키를 누르면 버튼 색상이 변경되도록 키리스너 추가
        }
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.CENTER);
        this.add(p3,BorderLayout.SOUTH);
        //패낼 추가
        
        p2.add(label);
        tf[0].addKeyListener(new KeyListener());
        //텍스트필드에 입력하면 사진 및 이름이 뜨도록 키리스너 추가
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
	            } //버튼을 누르면 빨간색으로 변경할 수 있도록 리스너 설정
	        	if((KeyCode== 65)) {
	            	label.setIcon(apple);
	            	la1=new JLabel("apple");
	            	p3.add(la1);
	            	la1.setFont(new Font("고딕체", Font.BOLD, 30));
	            }
	            else if((KeyCode== 66)){
	            	label.setIcon(banana);
	            	la2=new JLabel("banana");
	            	p3.add(la2);
	            	la2.setFont(new Font("고딕체", Font.BOLD, 30));
	            }
	            else if((KeyCode== 67)){
	            	label.setIcon(cherry);
	            	la3=new JLabel("cherry");
	            	p3.add(la3);
	            	la3.setFont(new Font("고딕체", Font.BOLD, 30));
	            } //텍스트 필드에 입력하면 사진 및 글씨가 뜨도록 키리스너 설정
	        	}
	        } 

	public static void main(String[] args) {
		new KeyEx();

	}

}
