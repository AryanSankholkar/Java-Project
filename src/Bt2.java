import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bt2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bt2 window = new Bt2();
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
	public Bt2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(154, 205, 50));
		frame.setBounds(100, 100, 415, 163);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Diet Plans");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(152, 31, 101, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNonvegDiet = new JButton("Non-Veg Diet");
		btnNonvegDiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NonVeg nw = new NonVeg();
				nw.NewScreen();
			}
		});
		btnNonvegDiet.setBackground(Color.LIGHT_GRAY);
		btnNonvegDiet.setFont(new Font("Arial", Font.BOLD, 12));
		btnNonvegDiet.setBounds(142, 66, 111, 23);
		frame.getContentPane().add(btnNonvegDiet);
		
		JButton btnVegDiet = new JButton("Veg Diet");
		btnVegDiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Veg nw = new Veg();
				nw.NewScreen();
			}
		});
		btnVegDiet.setBackground(Color.LIGHT_GRAY);
		btnVegDiet.setFont(new Font("Arial", Font.BOLD, 12));
		btnVegDiet.setBounds(10, 66, 111, 23);
		frame.getContentPane().add(btnVegDiet);
		
		JButton btnVeganDiet = new JButton("Vegan Diet ");
		btnVeganDiet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vegan nw = new Vegan();
				nw.NewScreen();	
			}
		});
		btnVeganDiet.setBackground(Color.LIGHT_GRAY);
		btnVeganDiet.setFont(new Font("Arial", Font.BOLD, 12));
		btnVeganDiet.setBounds(278, 66, 111, 23);
		frame.getContentPane().add(btnVeganDiet);
	}

}
