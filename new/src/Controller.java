import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Controller implements ActionListener  {
	private Model modelobj;
	private View viewobj;
	
	public Controller(Model modeel, View vieew) {
		this.modelobj = modeel;
		this.viewobj= vieew;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		double n1=viewobj.getFirstNum();
		double n2=viewobj.getSecondNum();
		String opr="+";
		int index=0;
		JButton b=(JButton) e.getSource();
		for(int i=0;i<4;i++){
			if(b.equals(viewobj.b[i])){
				opr=viewobj.buttonStrings[i];
				index=i;
			}
			
		}
	

		modelobj.compute(n1,n2,index);
		viewobj.setResult(modelobj.getResult());
				  
	}
}
