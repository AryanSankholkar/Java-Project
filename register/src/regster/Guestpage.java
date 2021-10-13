package regster;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guestpage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Guestpage window = new Guestpage();
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
	public Guestpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1130, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\vaishnavi\\befit.jpg"));
		lblNewLabel.setBounds(10, 10, 734, 192);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME!");
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 99));
		lblNewLabel_1.setBounds(0, 303, 524, 92);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrWhereverYouGo = new JTextArea();
		txtrWhereverYouGo.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		txtrWhereverYouGo.setText("Wherever you go in the World people travelling for business or holiday expect to be able to access a gym and \r\na qualified and experienced Gym Instructor or Personal Trainer. Demand for both outstrips supply!\r\nEvery fitness professional has to start somewhere and as this is the 1st level of robustness, there are no \r\nformal entry requirements or prerequisites to achieve strength. What will help you get off to flying start \r\nhowever is some experience of using cardiovascular and resistance equipment, as well as free weights, \r\nin your local gym.\r\nFrom theory to practical, you\u2019ll learn exactly what it takes to become a fitness freak\r\nWe'll be - \r\nOPEN ALL YEAR, 6 DAYS A WEEK & EVENINGS\r\nWEEKLY START DATES - ENROLL AT ANY TIME");
		txtrWhereverYouGo.setBounds(10, 389, 1020, 290);
		frame.getContentPane().add(txtrWhereverYouGo);
		Image photo= new ImageIcon(this.getClass().getResource("/Contact-icon.png")).getImage();
		
		JButton btnNewButton_1 = new JButton("");
		Image photo1= new ImageIcon(this.getClass().getResource("/dumbell.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(photo1));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(1031, -15, -1, 31);
		frame.getContentPane().add(btnNewButton_1);
		Image photo2= new ImageIcon(this.getClass().getResource("/gym.png")).getImage();
		Image photo3= new ImageIcon(this.getClass().getResource("/dumbell.png")).getImage();
		
		JButton btnNewButton_4 = new JButton("View Gallery");
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gallery nw = new Gallery();
				nw.NewScreen();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(474, 685, 131, 31);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pngwing.com_7.png"));
		lblNewLabel_2.setBounds(754, 51, 295, 315);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registratio nw = new Registratio();
				nw.NewScreen();
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(832, 10, 85, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Contact us");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contact nw = new contact();
				nw.NewScreen();
			}
		});
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(927, 10, 103, 31);
		frame.getContentPane().add(btnNewButton_2);
	}
}
