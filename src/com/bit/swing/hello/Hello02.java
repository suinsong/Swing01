package com.bit.swing.hello;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hello02 {

	JFrame jf = new JFrame();

	public Hello02() {

		jf.setTitle("this is a box");
		JButton btn = new JButton("클릭해라");

		// 버튼을 클릭했으 ㄹ때 할일을 미리 지정해 주는 것
		// 이벤트 핸들러 등록
		btn.addActionListener(new MyClick());
	
		jf.add(btn, "Center");
		
		jf.setSize(300,300);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello02();

	}

	class MyClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//다이알로그 박스
			JOptionPane.showMessageDialog(jf,"버튼눌렀다~~");
			
		}
		
		
		
	}
}
