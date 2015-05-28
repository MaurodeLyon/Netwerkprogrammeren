package view.Panels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Lobby extends JPanel{
	
	private static final long serialVersionUID = 8726091235849043624L;

	public Lobby(){
		setPreferredSize(new Dimension(1080, 720));
		setBackground(Color.BLUE);
		setFocusable(true);
	}	
}
