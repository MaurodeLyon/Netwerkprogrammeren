package view;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 2773168040909497332L;

	public Frame() {
		super("Server");
		
		setContentPane(new Panel());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
}
