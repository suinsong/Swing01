package com.bit.swing.hello;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hello04 {

	JFrame jf = new JFrame();
	JButton bt1, bt2, bt3;

	public Hello04() {

		jf.setTitle("the box including flowlayout");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// FLOW LAYOUT 순서대로 배치함

		jf.setLayout(new FlowLayout());

		bt1 = new JButton(" first button ");
		bt1.setEnabled(false);// 버튼 선택이 안 됨
		bt1.addActionListener(new bt1click());
		
		bt2 = new JButton(" second button ");
		bt2.setOpaque(true); // 평면적으로 1차원적
		bt2.setForeground(Color.MAGENTA);
		bt2.setBackground(Color.black);

		
		bt3 = new JButton(" third button ");
		bt3.addActionListener(new myclick());

		
		jf.add(bt1);
		jf.add(bt2);
		jf.add(bt3);

		
		jf.setSize(300, 300);
		jf.setVisible(true);
		
	}

	class bt1click implements ActionListener {
		// 이것은 어떤 값들을 넣어야 클릭할 수 있게 하는 거
		@Override
		public void actionPerformed(ActionEvent e) {
			if (bt1.isEnabled()) {
				bt1.setEnabled(false);
			}else{
				bt1.setEnabled(true);
			}

		}

	}

	class myclick implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (bt1.isVisible()) {
				bt1.setVisible(false);
				bt2.setVisible(false);
			} else {
				bt1.setVisible(true);
				bt2.setVisible(true);
			}

		}

	}

	public static void main(String[] args) {
		new Hello04();

	}

}
