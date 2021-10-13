import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class NonVeg {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NonVeg window = new NonVeg();
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
	public NonVeg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.setBounds(100, 100, 288, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Non-Veg Diet Plan");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 194, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Breakfast");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 46, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Oats - 50gms");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 67, 83, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Coffee/Tea - 1cup");
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(10, 81, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lunch");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 106, 83, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("2 Roti  or 1 Serving of Rice ");
		lblNewLabel_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(10, 126, 166, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("1 Cup of Dal");
		lblNewLabel_1_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_2.setBounds(10, 155, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Chicken Gravy  ");
		lblNewLabel_1_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_3.setBounds(10, 141, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("Cup of Curd ");
		lblNewLabel_1_2_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_4.setBounds(10, 170, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2_4);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Bowl Of Salad");
		lblNewLabel_1_2_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_5.setBounds(10, 183, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Evening Snacks");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 208, 119, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("2 Brown Bread + 1 tbps Peanut Butter");
		lblNewLabel_1_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_1_1.setBounds(10, 229, 230, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_6 = new JLabel("Coffee/Tea - 1cup");
		lblNewLabel_1_2_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_6.setBounds(10, 243, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2_6);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Dinner ");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(10, 268, 119, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_7 = new JLabel("Roasted Chicken 200gms");
		lblNewLabel_1_2_7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_7.setBounds(10, 289, 194, 14);
		frame.getContentPane().add(lblNewLabel_1_2_7);
		
		JLabel lblNewLabel_1_2_8 = new JLabel("Mix Vegetable Salad");
		lblNewLabel_1_2_8.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_8.setBounds(10, 303, 131, 14);
		frame.getContentPane().add(lblNewLabel_1_2_8);
	}

}
