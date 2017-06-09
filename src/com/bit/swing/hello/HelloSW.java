package com.bit.swing.hello;

import javax.swing.JFrame;

public class HelloSW {

	// 윈도우 생성, container
	// 다른 layout이나 component를 포함하는 클래스(객체)
	JFrame jframe = new JFrame();

	// 클래스 이름과 같은 메소드 =생성자
	public HelloSW() {
		
		jframe.setTitle("Hello Swing"); // 윈도우 창 좌픅에 보이는 제목(제목 표시줄)
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//끄는 기능
		
		
		jframe.setSize(600, 400); //사이즈 조정
		
		jframe.setVisible(true); // 창을 실행
		

	}

	
	
	
	public static void main(String[] args) {
		
		
		
	new HelloSW();
	

	}

}
