package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import package2.Server;

public class Panel extends JPanel {

	private static final long serialVersionUID = 7367696254548670128L;
	private JPanel topPanel, bottomPanel;
	private Server server = new Server();

	public Panel() {
		setPreferredSize(new Dimension(1080, 720));
		setLayout(new GridLayout(2, 1));

		topPanel = new JPanel(new GridLayout(2, 1));
		bottomPanel = new JPanel(new GridLayout(1, 2));

		add(topPanel);
		add(bottomPanel);

		initTopPanel();
		initBottomPanel();
	}

	public void initTopPanel() {
		JTextField invoer = new JTextField();
		JTextField uitvoer = new JTextField();
		topPanel.add(invoer);
		topPanel.add(uitvoer);
	}

	public void initBottomPanel() {
		JButton ouder = new JButton("ouder");
		JButton bye = new JButton("bye");

		ouder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		bye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					server.getServer().close();
					server.getSocket().close();
					server.getIn().close();
					server.getOut().close();
				} catch (IOException d) {

				}
			}
		});

		bottomPanel.add(ouder);
		bottomPanel.add(bye);
	}
}
