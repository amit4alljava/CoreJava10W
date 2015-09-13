import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Logic implements ActionListener {
	
	private MyFirstFrame frameObject;
	
	Logic(MyFirstFrame obj){
		frameObject = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Ok")){
			JOptionPane.showMessageDialog(frameObject, "U Click on OK");
			}
			else
			if(e.getActionCommand().equals("Cancel")){	
				JOptionPane.showMessageDialog(frameObject, "U Click on Cancel");
			}
		
	}

}
