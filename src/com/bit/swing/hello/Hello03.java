package com.bit.swing.hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hello03 {

	
	JFrame jf = new JFrame();

	// 생성자 메서드
	public Hello03() {
		
		jf.setTitle(" this is a box");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn1 = new JButton("위쪽");
		btn1.addActionListener(new NorthClick()); // 무명, 익명 클래스

		JButton btn2 = new JButton("아래쪽");
		SouthClick sc = new SouthClick();
		btn2.addActionListener(sc);

		jf.add(btn1, "North");
		jf.add(btn2, "South");

		jf.setSize(300, 300);
		jf.setVisible(true);
	}

	class NorthClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(jf, "North 버튼 클릭");
		}

	}

	class SouthClick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(jf, "South 버튼 클릭");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello03();
	}
}
