package ch11;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListEx extends JFrame{
	JList<String>list;
	JTextField tf;
	Container c=getContentPane();
	//리스트 와 텍스트 필드 생성
	
	public ListEx() {
		setTitle("List Test - Multi Selection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		//gui 이름, 사이즈 설정
		String[] cities= {"서울","런던","파리","시드니","로스엔젤레스","뉴욕","모스크바","쮜리히","벤쿠버"};
		list=new JList<String>(cities);//리스트의 리스트 생성
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		//멀티 선택이 될수 있도록 추가
		list.setVisibleRowCount(7);
		//화면에 뜨는리스트 갯수 설정
		list.addListSelectionListener(new ListHandler());
		//리스트를 누르면 아래의 택스트필드에 추가할 수있도록 리스너핸들러 추가
		add(new JScrollPane(list),BorderLayout.NORTH);
		//리스트에 스크롤과 레이아웃 설정
		tf=new JTextField(10);
		// 텍스트필드 설정
		c.add(tf);
		//컨텍트팬에 텍스트필드 추가
		setVisible(true);
		c.add(tf, BorderLayout.CENTER);
		//레이아웃 설정
		}

	class ListHandler implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e) {
			tf.setText(list.getSelectedValuesList()+"");
			// 리스트 선택한 값이 텍스트필드에 나와야됨으로 리스너 설정(복수선택가능설정)
			
		}
	}

	public static void main(String[] args) {
		new ListEx();

	}

}
