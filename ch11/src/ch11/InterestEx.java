package ch11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

public class InterestEx extends JFrame{
	Container c=getContentPane();
	JPanel p1,p2,p3;
	JLabel[] label=new JLabel[3];
	JTextField[] tf=new JTextField[3];
	JButton bu=new JButton();
	JTextField tf2=new JTextField("",20);
	//텍스트 패널 3개, 레블 3개, 입력 받을 택스트 필드 3개, 계산 버튼 1개, 결과값 텍스트 필드 1개 구상

	
	public InterestEx() {
		setTitle("이자계산기");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newComponents();
		setComponents();
		addComponents();
		setVisible(true);
		// 타이틀, 사이즈 및 기본 구성
	}
	
	void newComponents(){
		String[] name= {"원금을 입력하세요","이자를 입력하세요","년수를 입력하세요"};
		//레블 구상
		p1=new JPanel();
		p2=new JPanel();
		//패넬 명칭 구성
		for(int i=0;i<3;i++) {
			label[i]=new JLabel(name[i]);
			tf[i]=new JTextField(10);
			tf[i].setHorizontalAlignment(JTextField.RIGHT); //오른쪽 정렬
		}
		bu=new JButton("계산"); //계산 버튼 추가
		
		bu.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==bu) {
					double i, j, k, sum;
					i = Double.parseDouble(tf[0].getText());  // i= 첫번쨰 텍스트필드 값 가져옴
					j = Double.parseDouble(tf[1].getText());  // j= 첫번쨰 텍스트필드 값 가져옴
					k = Double.parseDouble(tf[2].getText());  // k= 첫번쨰 텍스트필드 값 가져옴
						sum = (i * (Math.pow((1+ ((j/k)/10)), k))); //sum= 복리계산식 입력
					String str = Double.toString(sum);  //더블의 sum값을 스트링으로 가져옴
					tf2.setText(str); //텍스트필드에 str 값을 출력함
					tf2.setHorizontalAlignment(JTextField.RIGHT); //오른쪽 정렬
				} // 계산버튼 클릭시 이자가 계산될 수 있도록 액션 리스너 추가
			}
		});
		tf2.setBackground(Color.LIGHT_GRAY);
		p3=new JPanel(); // 결과 텍스트 필드 생성
		
	}

	void setComponents() {
		p1.setLayout(new GridLayout(3, 2, 5, 5));
		this.setResizable(false); //레이아웃 설정
	}
	
	void addComponents() {
		for(int i=0;i<3;i++) {
			p1.add(label[i]);
			p1.add(tf[i]);
		}
		p2.add(bu);
		p3.add(tf2);
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);
		c.add(p3,BorderLayout.SOUTH);
		tf2.setEditable(false); //결과 레이아웃 add 및 맨 밑에 결과값이 수정될 수 없도록 설정
	}
	
	public static void main(String[] args) {
		new InterestEx();
	}



}