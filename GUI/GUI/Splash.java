import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class Splash extends JWindow {
	int progressValue = 0;
	JProgressBar progressBar = new JProgressBar();
	int counter = 1;
	boolean isVisible = true;
	JLabel lblNewLabel = new JLabel("");
	JLabel lblTictactoegame = new JLabel("TicTacToeGame");
	Timer timer = null;
	Timer progressTimer = null;
	Icon icon = new ImageIcon(Splash.class.getResource("animatedtic.gif"));
	public static void main(String[] args) {
		
					Splash frame = new Splash();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.animation();
					frame.doProgress();
					
				
	}
	
	void doProgress(){
		ActionListener l = (e)->{
			if(progressValue<=100){
				progressValue++;
				progressBar.setValue(progressValue);
			}
			else
			{
				if(progressTimer!=null){
					progressTimer.stop();
				}
				if(timer!=null){
					timer.stop();
				}
				MainScreen obj = new MainScreen();
				obj.setVisible(true);
				obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
				obj.setLocationRelativeTo(null);
				Splash.this.setVisible(false);
				
			}
		};
		progressTimer = new Timer(10,l);
		progressTimer.start();
	}

	void animation(){
		
		
		ActionListener l = (e)->{
			
			switch(counter){
			case 1:
				lblTictactoegame.setForeground(Color.RED);
				break;
			case 2:
				lblTictactoegame.setForeground(Color.YELLOW);
				break;
			case 3:
				lblTictactoegame.setForeground(Color.GREEN);
				break;
			case 4:
				lblTictactoegame.setForeground(Color.BLUE);
				break;
			case 5:
				lblTictactoegame.setForeground(Color.MAGENTA);
				break;
			}
			if(isVisible){
				//lblTictactoegame.setFont(new Font("Times",Font.BOLD,counter*10));
				if(counter>=5){
					counter = 1;
				}
				counter ++;
			}
			lblTictactoegame.setVisible(isVisible);
			isVisible = !isVisible;
		};
		timer = new Timer(100,l);
		timer.start();
	}
	
	/**
	 * Create the frame.
	 */
	public Splash() {
		getContentPane().setBackground(new Color(175, 238, 238));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 457);
		this.getContentPane().setLayout(null);
		
		
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(10, 21, 414, 234);
		getContentPane().add(lblNewLabel);
		
		
		lblTictactoegame.setHorizontalAlignment(SwingConstants.CENTER);
		lblTictactoegame.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTictactoegame.setBounds(95, 266, 234, 36);
		getContentPane().add(lblTictactoegame);
		
		
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 18));
		progressBar.setForeground(new Color(205, 92, 92));
		progressBar.setStringPainted(true);
		progressBar.setBackground(new Color(154, 205, 50));
		progressBar.setBounds(20, 327, 404, 50);
		getContentPane().add(progressBar);
		
	}
}
