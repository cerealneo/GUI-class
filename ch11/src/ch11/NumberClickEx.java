package ch11;

import java.awt.*;
import javax.swing.*;

public class NumberClickEx extends JFrame{
	Container c = getContentPane();
	JLabel [] label = new JLabel[26];
	JButton button1=new JButton("GAME AGAIN");
	JTextField tf = new JTextField("  00sec",5);
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	//팬낼 2개 및 버튼 2개 및 레벨 생성
	
	public NumberClickEx() {
		setTitle("Mouse Test - Exam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		//타이틀 이름 및 사이즈 등 설정
		int randNum1 = 0;
		int randNum2 = 0;
		for(int i = 1; i < 26; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setSize(40,30);
			//인트 설정 및 레벨을 인트형으로 변경될 수 있도록 설정
			randNum1 = (int)(Math.random()*600)+30;
			randNum2 = (int)(Math.random()*400)+30;
			//랜덤으로 화면에 나와야 됨으로 렌덤 설정
			label[i].setBounds(randNum1, randNum2, 26, 26);
			label[i].setFont(new Font("", Font.BOLD, 20));
			label[i].setBackground(Color.YELLOW);
			//글자 색상 및 폰트 설정
			label[i].setOpaque(true);
			//숫자 배경 설정
			p1.setLayout(null);
			//p1의 레이아웃을 null로 설정
			p1.add(label[i]);
			//p1에 label 추가
			p2.add(tf);
			p2.add(button1);
			//p2에 시간 텍스트필드와 게임어게인 버튼 추가
			tf.setEditable(false);
			//시간만 나오는 것으로 텍스트필드 입력 할 수 없도록 비활성화
			button1.setFont(new Font("", Font.BOLD, 20));
			tf.setFont(new Font("", Font.BOLD, 20));
			//버튼 폰트 설정
			c.add(p1);
			c.add(p2,BorderLayout.SOUTH);
			//컨텐트팬에 p1,p2 추가하고 p2에 블로더레이아웃 설정
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new NumberClickEx();

	}

}
