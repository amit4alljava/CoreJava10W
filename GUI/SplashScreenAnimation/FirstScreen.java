import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FirstScreen extends JFrame {
	private JButton ok1 = new JButton("Ok1");
	private JButton ok2 = new JButton("Ok2");
	private JButton ok3 = new JButton("Ok3");
	public FirstScreen() {
		this.setSize(300,300);
		this.setVisible(true);
		this.setLocation(200,300);
		this.getContentPane().setLayout(null);
		ok1.setBounds(20,20,70,70);
		ok2.setBounds(100,20,70,70);
		ok3.setBounds(20,100,70,70);
		this.getContentPane().add(ok1);
		this.getContentPane().add(ok2);
		this.getContentPane().add(ok3);

	}

	public static void main(String[] args) {
		FirstScreen obj = new FirstScreen();
		
	}

}
