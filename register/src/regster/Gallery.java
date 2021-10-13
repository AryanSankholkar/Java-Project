package regster;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;

public class Gallery {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gallery window = new Gallery();
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
	public Gallery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(128, 0, 0));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 1335, 789);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\vaishnavi\\befit.jpg"));
		lblNewLabel.setBounds(221, 10, 730, 192);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea txtrForUsA = new JTextArea();
		txtrForUsA.setBackground(new Color(128, 0, 0));
		txtrForUsA.setForeground(new Color(255, 192, 203));
		txtrForUsA.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		txtrForUsA.setText("For us, a healthy lifestyle is much more than just lifting weights. It\u2019s about stretching, warming up, eating healthily, and getting necessary \r\nrest and enough sleep. We love helping others see and experience what their bodies are capable of with just enough hard work. We make it \r\na goal to help you achieve a happy and well-balanced lifestyle that will minimize the risk of future health-related issues.");
		txtrForUsA.setBounds(10, 227, 1154, 89);
		frame.getContentPane().add(txtrForUsA);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\image0.jpg"));
		lblNewLabel_1.setBounds(10, 326, 520, 351);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\image2.jpg"));
		lblNewLabel_2.setBounds(556, 326, 375, 351);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\image (1).jpg"));
		lblNewLabel_4.setBounds(941, 326, 370, 351);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
