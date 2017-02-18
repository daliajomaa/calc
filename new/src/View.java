import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {
	  private JLabel result;
	  private JTextField t1;
	  private JTextField t2;
	  private JLabel l1;
	  private JLabel l2;
	  private JLabel l3;
      private double n1;
      private double n2;
      private String op;
      public JButton [] b;
      public String[] buttonStrings;
	  private JPanel p2;
	  private JPanel p1;
	 
	  
	  public View() {
		  
			super("claculater");
		
		     p1 = new JPanel();
			add(p1, BorderLayout.NORTH);
			p1.setLayout(new GridLayout(3, 2, 5, 5));
			

			result = new JLabel("0.0");
			l1=new JLabel("First Number");
			l2=new JLabel("Second Number");
			l3=new JLabel("Result");
			
			t1 = new JTextField("0");
			t2 = new JTextField("0");
			p1.add(l1);
			p1.add(t1);
			p1.add(l2);
			p1.add(t2);
			p1.add(l3);
			p1.add(result);
			

			p2 = new JPanel();
		     add(p2, BorderLayout.SOUTH);
			p2.setLayout(new GridLayout(1, 4, 0, 0));
			
			 buttonStrings =new String[4];
			 buttonStrings[0]="+";
			 buttonStrings[1]="-";
			 buttonStrings[2]="*";
			 buttonStrings[3]="/";
			 
			 b=new JButton[4];
			//JButton [] b=new JButton[4];;

			for (int i=0;i<4;i++) {
			 	
			 b[i] =(JButton) new JButton(buttonStrings[i]);	
			p2.add(b[i]);
			}
			
			
			
		}
		
		public void setResult(String value) {
			
				result.setText(value);
		}
		
		public double getFirstNum(){
			n1=Double.parseDouble(t1.getText());
			return n1;
		}
		
		public double getSecondNum(){
			n2=Double.parseDouble(t2.getText());
			return n2;
		}
		
		public String getOperation(){
			return op;
		}
		
		public void addlist(Controller c){
			for (int i=0;i<4;i++) {
				 b[i].addActionListener(c);
				 
				}
		}
		
		}
		
		

