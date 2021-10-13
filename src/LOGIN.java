import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 535, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PAGE ");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 34));
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setBounds(155, 11, 227, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME ");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(51, 78, 112, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD ");
		lblNewLabel_2.setFont(new Font("Algerian", Font.BOLD, 20));
		lblNewLabel_2.setBounds(51, 117, 112, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(206, 83, 202, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 122, 202, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=textField.getText();
				String password=passwordField.getText();
				
				if(password.contains("123")&& username.contains("Aryan"))
				{
					textField.setText(null);
					passwordField.setText(null);
					Example nw = new Example();
					nw.NewScreen();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "          INVALID LOGIN      ","ERROR",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);	
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnNewButton.setBounds(51, 194, 89, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnNewButton_1.setBounds(206, 194, 89, 28);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		btnNewButton_2.setBounds(349, 194, 89, 28);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image.jpg"));
		lblNewLabel_3.setIcon(img);
		lblNewLabel_3.setBounds(10, 234, 499, 106);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
