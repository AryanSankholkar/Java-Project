import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Vegan {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vegan window = new Vegan();
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
	public Vegan() {
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
		
		JLabel lblNewLabel = new JLabel("Vegan Diet Plan");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 24));
		lblNewLabel.setBounds(10, 11, 178, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Breakfast");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 46, 194, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Bowl of Meusli with your Choice of Fruit ");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 67, 252, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Cup of Almond Milk ");
		lblNewLabel_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(10, 81, 131, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Lunch");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(10, 106, 83, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("2 Mashed Potato");
		lblNewLabel_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_1.setBounds(10, 126, 138, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Greek Yoghurt ");
		lblNewLabel_1_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_2.setBounds(10, 155, 119, 14);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("Oats Pancakes with Berries ");
		lblNewLabel_1_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_3.setBounds(10, 141, 178, 14);
		frame.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("Bowl Of Vegan Salad ");
		lblNewLabel_1_2_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_5.setBounds(10, 168, 138, 14);
		frame.getContentPane().add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Evening Snacks");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(10, 193, 119, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Avacado ");
		lblNewLabel_1_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_1_1.setBounds(10, 216, 230, 14);
		frame.getContentPane().add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Dinner ");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(10, 241, 119, 24);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2_7 = new JLabel("Sweet Potato");
		lblNewLabel_1_2_7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_7.setBounds(10, 264, 194, 14);
		frame.getContentPane().add(lblNewLabel_1_2_7);
		
		JLabel lblNewLabel_1_2_5_1 = new JLabel("Bowl Of Vegan Salad ");
		lblNewLabel_1_2_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
		lblNewLabel_1_2_5_1.setBounds(10, 280, 138, 14);
		frame.getContentPane().add(lblNewLabel_1_2_5_1);
	}

}
