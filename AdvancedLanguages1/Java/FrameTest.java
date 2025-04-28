package pkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("First Frame");
		
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("Click to run");
		JTextField text1 = new JTextField(10);
		JTextArea result_area = new JTextArea(20,20);
		
		frame.add(text1);
		frame.add(button1);
		frame.add(result_area);
		
		button1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			result_area.setText("");
		
			try {
				int num = Integer.parseInt(text1.getText());
				for(int i=1; i<10; i++) {
					result_area.append(num+"*"+i + "=" + num*i + "\n");
				}
				}catch(Exception r) {
					result_area.append("ERROR! Do not type string data type!");
			}
			}});

		frame.setVisible(true);
	}

}
