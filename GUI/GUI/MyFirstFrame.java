import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFirstFrame extends JFrame {//implements ActionListener {

	private JPanel contentPane;
	private Icon icon = new ImageIcon(MyFirstFrame.class.getResource("cancel.jpg"));
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstFrame frame = new MyFirstFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOk.setBounds(230, 176, 89, 23);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setIcon(icon);
		/*ActionListener l = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printOK();
				
			}
		};*/
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printOK();
				
			}
		});
		//Logic logic = new Logic(this);
		//btnOk.addActionListener(logic);  // Regiser the Listener on Button
		btnCancel.setMnemonic('C');
		
		ActionListener a  = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printCancel();
				
			}
		};
		
		btnCancel.addActionListener(a); 
		btnCancel.setBackground(Color.YELLOW);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancel.setBounds(108, 82, 164, 59);
		getContentPane().add(btnCancel);
		
		JButton btnClickMe = new JButton("Click Me");
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printClickMe();
			}
		});
		btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnClickMe.setBounds(58, 171, 139, 34);
		getContentPane().add(btnClickMe);
		
		textField = new JTextField();
		textField.setToolTipText("Enter your Data");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(108, 26, 250, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		System.out.println(e.getSource());
		if(e.getActionCommand().equals("Ok")){
		JOptionPane.showMessageDialog(this, "U Click on OK");
		}
		else
		if(e.getActionCommand().equals("Cancel")){	
			JOptionPane.showMessageDialog(this, "U Click on Cancel");
		}
		
	}*/
	
	private void printOK(){
		textField.setText("Hello User");
		//JOptionPane.showMessageDialog(this, "U Click on OK");
	}
	
	private void printCancel(){
		JOptionPane.showMessageDialog(this, "U Click on Cancel");
	}
	
	private void printClickMe(){
		String data = textField.getText();
		JOptionPane.showMessageDialog(this, data);
	}
}










