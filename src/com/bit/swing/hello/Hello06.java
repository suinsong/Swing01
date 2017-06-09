package com.bit.swing.hello;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Hello06 {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton[] bt = new JButton[10];

	public Hello06() {
		jf.setTitle("Grid Layout");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < bt.length; i++) {
			bt[i] = new JButton((i + 1) + " 번째 버튼 ");
			bt[i].addActionListener(new myclick());
			jp.add(bt[i]);
		}
			
								   // rows, cols
			jp.setLayout(new GridLayout(3, 5));
			jf.add(jp);
			jf.setSize(500, 200);
			jf.setVisible(true);

		}
	

	class myclick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object obj = e.getSource(); // 눌린버튼이 뭔지 알 수 있는 변수
			for (int i = 0; i < bt.length; i++) {
				if (obj==bt[i]) {
					JOptionPane.showMessageDialog(jf,bt[i].getText());
					
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Hello06();

	}

}
