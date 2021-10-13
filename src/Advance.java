import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Advance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Advance window = new Advance();
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
	public Advance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 342, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Advanced");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 109, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Jumping Jacks - 1min");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 46, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Push Ups x 25");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 116, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Burpees x 15");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 81, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Squats x 25");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(10, 151, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Lunges x 20 ");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_2.setBounds(10, 186, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Dumbell Curl x 30");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_3.setBounds(10, 221, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Tricep Dips x 24");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_4.setBounds(10, 256, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Diamond Push-Ups x 20");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2_1.setBounds(10, 291, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Crunches x 20");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2.setBounds(10, 326, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Leg Raises x 18");
		lblNewLabel_1_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_2_2.setBounds(10, 361, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_2_2);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("Plank - 1min");
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_5.setBounds(10, 396, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1_5);
	}

}
