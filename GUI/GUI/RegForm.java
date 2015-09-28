import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Choice;
import java.awt.List;


public class RegForm extends JFrame {
	String value = "";
	private JTextField userTxt;
	private JPasswordField passwordField;
	private List list = new List();
	private Choice choice = new Choice();
	
	public static void main(String[] args) {
		
					RegForm frame = new RegForm();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public RegForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 513, 461);
		this.getContentPane().setLayout(null);
		
		userTxt = new JTextField();
		userTxt.setBounds(176, 26, 146, 20);
		getContentPane().add(userTxt);
		userTxt.setColumns(10);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(47, 32, 46, 14);
		getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(57, 57, 46, 14);
		getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('$');
		passwordField.setBounds(176, 54, 146, 20);
		getContentPane().add(passwordField);
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				printChange(e);
			}
		});
		rdbtnMale.setBounds(151, 107, 75, 23);
		getContentPane().add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			printChange(e);
			}
		});
		rdbtnFemale.setBounds(236, 107, 134, 23);
		getContentPane().add(rdbtnFemale);
		bg.add(rdbtnMale);
		bg.add(rdbtnFemale);
		
		
		
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(57, 111, 46, 14);
		getContentPane().add(lblGender);
		
		JLabel lblHobbies = new JLabel("Hobbies");
		lblHobbies.setBounds(47, 149, 68, 14);
		getContentPane().add(lblHobbies);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Sports");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			printCheckBox(e);
			}
		});
		chckbxNewCheckBox.setBounds(142, 141, 85, 50);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Reading");
		chckbxNewCheckBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			printCheckBox(e);
			}
		});
		chckbxNewCheckBox_1.setBounds(251, 141, 200, 50);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(28, 225, 46, 14);
		getContentPane().add(lblAddress);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(144, 208, 200, 50);
		getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(147, 208, 200, 50);
		scrollPane.setViewportView(textArea);
		
		
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				userTxt.setText(choice.getSelectedItem());
			}
		});
		
		choice.setBounds(159, 275, 146, 20);
		getContentPane().add(choice);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setBounds(28, 275, 46, 14);
		getContentPane().add(lblCity);
		
		
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			changeCity();
			}
		});
		list.add("USA");
		list.add("UK");
		list.add("India");
		list.add("China");
		list.setBounds(151, 306, 125, 60);
		getContentPane().add(list);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(28, 316, 46, 14);
		getContentPane().add(lblCountry);
		//getContentPane().add(textArea);
		
	}
	
	private void changeCity(){
		String countryName = list.getSelectedItem();
		choice.removeAll();
		if(countryName.equalsIgnoreCase("India")){
			choice.add("Delhi");
			choice.add("mumbai");
		}
		else
		if(countryName.equalsIgnoreCase("usa")){
			choice.add("NY");
			choice.add("LA");
		}
		else
		if(countryName.equalsIgnoreCase("uk")){
			choice.add("London");
			choice.add("Paris");
		}
	}
	private void printCheckBox(ItemEvent e){
		JCheckBox c = (JCheckBox)e.getItem();
		if(c.isSelected()){
		value = value + c.getText()+" ";
		userTxt.setText(value);
		}
	}
	private void printChange(ItemEvent e){
		JRadioButton r = (JRadioButton)e.getItem();
		userTxt.setText(r.getText());
	}
}
