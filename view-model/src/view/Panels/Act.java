package view.Panels;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Act extends JPanel{

	private static final long serialVersionUID = 2026654298264523599L;

	public Act(){
		setPreferredSize(new Dimension(1080, 720));
		setBackground(Color.RED);
		setFocusable(true);
	}
}
