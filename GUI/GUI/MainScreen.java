import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MainScreen extends JFrame {

	Icon icon = new ImageIcon(MainScreen.class.getResource("giphy.gif"));
	public static void main(String[] args) {
		
					MainScreen frame = new MainScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmTictactoe = new JMenuItem("TicTacToe");
		mntmTictactoe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TicTacToe obj = new TicTacToe();
				obj.setVisible(true);
			}
		});
		mnFile.add(mntmTictactoe);
		
		JMenuItem mntmLogoquiz = new JMenuItem("LogoQuiz");
		mnFile.add(mntmLogoquiz);
		
		mnFile.addSeparator();
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(icon);
		getContentPane().add(lblNewLabel);
		
	}

}
