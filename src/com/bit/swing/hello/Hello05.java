package com.bit.swing.hello;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hello05 {

	JFrame jf = new JFrame();
	JPanel jp= new JPanel();

	public Hello05() {

		jf.setTitle("the box including borderlayout");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		jp.setLayout(new BorderLayout());
//		jp.setLayout(new FlowLayout());
		jp.setBackground(Color.black);
		

		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		
		
		jp.add(bt1, "North");
		jp.add(bt2, "Center");
		jp.add(bt3, "South");
		
		jf.add(jp,"West");
		
		
		jf.setSize(400, 200);
		jf.setVisible(true);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Hello05();
	}

}
