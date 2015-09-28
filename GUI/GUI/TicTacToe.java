import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


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
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int choice = JOptionPane.showConfirmDialog(TicTacToe.this, "Do u want to Quit this Game","MyGame-2015",JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION){
					TicTacToe.this.setVisible(false);
					TicTacToe.this.dispose();	
				}
				if(choice==JOptionPane.NO_OPTION){
					return;
				}
				
			}
		});
		
		setResizable(false);
		getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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









