package login_pkg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends BaseFrame{

	public LoginFrame() {
		super("Login", 500, 300);
		JPanel panel = new JPanel(new GridLayout(3,2,10,10));
		panel.setBorder(BorderFactory.createEmptyBorder(1,1,1,1));
		
		JLabel userLabel = new JLabel("Type ID");
		JLabel passLabel = new JLabel("Password:");
		JTextField userField = new JTextField(10);
		JPasswordField passField = new JPasswordField(10);
		JButton loginButton = new JButton("Click login");
		
		
		
		
		loginButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String username = userField.getText();
				String password = new String(passField.getPassword());
				
				if(LoginValidation.validate(username, password)) {
					JOptionPane.showMessageDialog(frame, "Login Success");
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "Wrong", "error", JOptionPane.ERROR_MESSAGE);
				}
				
			}});
		
		
		panel.add(userLabel);
		panel.add(userField);
		panel.add(passLabel);
		panel.add(passField);
		panel.add(new JLabel());
		panel.add(loginButton);
		
		frame.add(panel);
		
	}
	
}
