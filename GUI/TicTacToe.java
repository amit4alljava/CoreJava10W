import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TicTacToe extends JFrame {

	private boolean isX = false;
	JButton oneBt = new JButton("");
	JButton twoBt = new JButton("");
	JButton threeBt = new JButton("");
	
	public static void main(String[] args) {
		
					TicTacToe frame = new TicTacToe();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		
		
		oneBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(oneBt);
			}
		});
		oneBt.setBounds(35, 57, 89, 42);
		getContentPane().add(oneBt);
		twoBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(twoBt);
			}
		});
		
		
		twoBt.setBounds(153, 57, 89, 42);
		getContentPane().add(twoBt);
		threeBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printXorZero(threeBt);
			}
		});
		
		
		threeBt.setBounds(252, 57, 89, 42);
		getContentPane().add(threeBt);
		
	}
	
	private void printXorZero(JButton btObject){
		if(btObject.getText().trim().length()==0){
		if(isX){
			btObject.setText("X");
		}
		else
		{
			btObject.setText("0");
		}
		isX = !isX;
		}
	}

}









