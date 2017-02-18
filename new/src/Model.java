import javax.swing.JOptionPane;

public class Model {
	private double result;
	
	private String str;
	private String op;
	
    
    
	public Model() {
		//result = 0;
		str = " " + result;
		op = " ";
	}
	
	
	
	public void compute(double n1, double n2 , int i) {
		
		

		 if (i==0) {
			 System.out.print(""+n1+n2);
				result = n1+n2;} 
		 else if (i==1) {
				result = n1 - n2;}
		 else if (i==2) {
				result = n1 * n2;}	
		else if (i==3) {
				result = n1 / n2;}
			
			str = " "+ result;
			
		
	}
	
	public String getResult() {
		return str;
	}
}
