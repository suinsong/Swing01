package com.bit.swing.hello;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Hello01 {

	JFrame jf = new JFrame();

	public Hello01() {

		jf.setTitle("안녕~~~");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("클릭하세요~~~");
		JButton btn1= new JButton("하단");
		JButton btn2 = new JButton("상단");
		JButton btn3 = new JButton("왼쪽");
		JButton btn4 = new JButton("오른쪽");
		
		jf.add(btn, "Center");
		jf.add(btn1, "South");
		jf.add(btn2, "North");
		jf.add(btn3, "West");
		jf.add(btn4, "East");
		
		
		jf.setSize(600, 400);
		//jf.pack(); 압축
		
		jf.setVisible(true);

	}

	public static void main(String[] args) {

		// 클래스의 생성자를 실행
		new Hello01();

	}

}
