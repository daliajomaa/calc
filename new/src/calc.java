import javax.swing.JFrame;

public class calc {
	public static void main(String[] args) {
		
	Model modelobj = new Model();
    View viewobj = new View();
		
		Controller controllerobj = new Controller(modelobj, viewobj);
		viewobj.addlist(controllerobj);
		viewobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewobj.setSize(400, 150);
		viewobj.setVisible(true);
	}
}
