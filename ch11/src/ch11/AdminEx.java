package ch11;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AdminEx extends JFrame{
	Container c=getContentPane();
	JLabel label=new JLabel();
	JTextField tf1 = new JTextField(7);
	JTextField tf2 = new JTextField(10);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel pp1 = new JPanel();
	JPanel pp2 = new JPanel();
	JButton bu1=new JButton("입력");
	JButton bu2=new JButton("수정");
	JButton bu3=new JButton("삭제");
	JButton bu4=new JButton("취소");
	ButtonGroup g = new ButtonGroup();
	JRadioButton boy = new JRadioButton("남자");
	JRadioButton Grie = new JRadioButton("여자");
	JCheckBox CB1 = new JCheckBox("영어");
	JCheckBox CB2 = new JCheckBox("중국어");
	JCheckBox CB3 = new JCheckBox("일본어");
	JCheckBox CB4 = new JCheckBox("스페인어");
	JCheckBox CB5 = new JCheckBox("러시아어");
	JTextArea ta1 = new JTextArea(10,40);
	//이름, 전화번호 입력 레벨 및 텍스트필드와 남자,여자 선택 라디오 버튼 추가
	//가능 외국어선택할 수 있도록 체크박스 추가 및 텍스트에리어와 입력,수정,삭제,취소
	// 입력 버튼 생성

	public AdminEx() {
		setTitle("응시자 관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		//타이틀 및 사이즈 기본 설정
		c.setLayout(new FlowLayout());
		p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        pp1 = new JPanel();
        pp1.setLayout(new BorderLayout());
        pp2 = new JPanel();
        pp2.setLayout(new BorderLayout());
        // 각 패널의 레이아웃 설정
		p1.add(new JLabel("이름"));
		p1.add(tf1);
		p1.add(new JLabel("전화"));
		p1.add(tf2);
		//이름 및 전화번호 입력 텍스트필드 및 안내 레벨 추가
		g.add(boy);
		g.add(Grie);
		p1.add(boy);
		p1.add(Grie);
		// 남자 여자 선택 라디오버튼 추가
		p2.add(CB1);
		p2.add(CB2);
		p2.add(CB3);
		p2.add(CB4);
		p2.add(CB5);
		//가능 외국어 선택 체크박스 추가
		p3.add(ta1);
		//선택한 값이 나올수 있도록 텍스트에리어 추가
		p4.add(bu1);
		p4.add(bu2);
		p4.add(bu3);
		p4.add(bu4);
		//입력, 수정, 삭제, 취소 버튼 추가
		p2.setBorder(new TitledBorder(new LineBorder(Color.cyan,1),"가능 외국어 선택"));
		p3.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),""));
		//텍스트 에리아 및 가능 외국어 선택 부분 테두리 설정
		tf1.setBackground(Color.YELLOW);
		//이름 입력란 배경 색상 설정
		boy.setBackground(Color.LIGHT_GRAY);
		Grie.setBackground(Color.LIGHT_GRAY);
		//남자,여자 설정 배경색상 설정
		pp1.add(p1,BorderLayout.NORTH);
	    pp1.add(p2,BorderLayout.SOUTH);
	    pp2.add(p3,BorderLayout.NORTH);
	    pp2.add(p4,BorderLayout.SOUTH);
	   //레이아웃 설정  
	    c.add(pp1,BorderLayout.NORTH);
	    c.add(pp2,BorderLayout.SOUTH);
	    //레이아웃 설정
		setVisible(true);
		}

	public static void main(String[] args) {
		new AdminEx();

	}

}