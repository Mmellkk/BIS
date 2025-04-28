package login_pkg;

import javax.swing.JFrame;



public class BaseFrame {
	
	protected JFrame frame;
	
	public BaseFrame(String title, int w, int h) {
		frame = new JFrame(title);
		frame.setSize(w,h);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	
}
