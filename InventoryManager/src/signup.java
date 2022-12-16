import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField username;
	private JTextField password;
	private JTextField phonenumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel signuppanel = new JPanel();
		signuppanel.setBackground(new Color(0, 128, 128));
		signuppanel.setForeground(Color.WHITE);
		signuppanel.setBounds(0, 0, 478, 75);
		contentPane.add(signuppanel);
		signuppanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 24));
		lblNewLabel.setBounds(6, 6, 466, 47);
		signuppanel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 178, 170));
		panel_1.setBounds(0, 73, 478, 326);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Nanum Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(34, 24, 104, 16);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name:");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Nanum Gothic", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(34, 70, 104, 16);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("User Name:");
		lblNewLabel_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_2.setFont(new Font("Nanum Gothic", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(34, 113, 116, 16);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Password:");
		lblNewLabel_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_3.setFont(new Font("Nanum Gothic", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(34, 159, 116, 16);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Phone Number:");
		lblNewLabel_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_4.setFont(new Font("Nanum Gothic", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(34, 198, 164, 23);
		panel_1.add(lblNewLabel_1_4);
		
		firstname = new JTextField();
		firstname.setBounds(196, 21, 194, 26);
		panel_1.add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setColumns(10);
		lastname.setBounds(196, 67, 194, 26);
		panel_1.add(lastname);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(196, 110, 194, 26);
		panel_1.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(196, 156, 194, 26);
		panel_1.add(password);
		
		phonenumber = new JTextField();
		phonenumber.setColumns(10);
		phonenumber.setBounds(196, 198, 194, 26);
		panel_1.add(phonenumber);
		
		JButton signupbutton = new JButton("Signup");
		signupbutton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		signupbutton.setBounds(54, 252, 116, 44);
		panel_1.add(signupbutton);
		signupbutton.setBackground(new Color(0, 128, 128));
		signupbutton.setForeground(new Color(0, 128, 128));
		
		JButton loginbutton = new JButton("Login");
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mm = new MainMenu();
				mm.show();
				dispose();
				
				
			}
		});
		loginbutton.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		loginbutton.setForeground(new Color(0, 128, 128));
		loginbutton.setBackground(new Color(0, 128, 128));
		loginbutton.setBounds(196, 252, 116, 44);
		panel_1.add(loginbutton);
	}
}
