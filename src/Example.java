import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example window = new Example();
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
	public Example() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 553, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/image.jpg"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(10, 0, 517, 109);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("WORKOUT ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bt1 nw = new Bt1();
				nw.NewScreen();
			}
		});
		btnNewButton_1.setBounds(20, 355, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DIET ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bt2 nw = new Bt2();
				nw.NewScreen();
			}
		});
		btnNewButton_2.setBounds(224, 355, 100, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MY PROFILE ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bt3 nw = new Bt3();
				nw.NewScreen();
			}
		});
		btnNewButton_3.setBounds(427, 355, 100, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon image = new ImageIcon(this.getClass().getResource("/Dumbelll.png"));
		lblNewLabel_1.setIcon(image);
		lblNewLabel_1.setBounds(10, 120, 184, 224);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Aryan Sankholkar\\Downloads\\weights.png"));
		lblNewLabel_2.setBounds(135, 173, 260, 150);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Aryan Sankholkar\\Downloads\\Diet.png"));
		lblNewLabel_3.setBounds(416, 173, 100, 150);
		frame.getContentPane().add(lblNewLabel_3);
	}
}