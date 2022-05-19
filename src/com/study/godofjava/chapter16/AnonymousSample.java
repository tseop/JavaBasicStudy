package com.study.godofjava.chapter16;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnonymousSample {
	public static void main(String[] args) {
		new Frame();
	}

}

class Frame extends JFrame {

	private JButton mButton;

	// »ý¼ºÀÚ
	public Frame() {
		this.setSize(400, 250);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Lisener");

		JPanel panel = new JPanel();
		mButton = new JButton("Click on Button");
		mButton.addActionListener(new MagicButton());
		panel.add(mButton);
		this.add(panel);
		this.setVisible(true);
	}
}
