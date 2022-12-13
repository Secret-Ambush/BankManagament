import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	
	public void showWindow()
	{
		NewUser frame = new NewUser();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public NewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(48, 71, 52, 16);
		contentPane.add(lblName);
		
		name = new JTextField();
		name.setBounds(174, 66, 232, 26);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New User");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(165, 28, 205, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.showLogin();
			}
		});
		back.setBounds(6, 6, 73, 29);
		contentPane.add(back);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(48, 115, 59, 16);
		contentPane.add(lblPassword);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setBounds(48, 161, 118, 16);
		contentPane.add(lblReenterPassword);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(220, 190, 186, 16);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 110, 232, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(174, 156, 232, 26);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password1 = passwordField.getText();
				String password2 = passwordField_1.getText();
				String username = name.getText();
				String msg = "" + username;
				if (!password2.equals(password1))
				{
					lblNewLabel.setText("Incorrect Password. Try again");	
				}
				else
				{
					MainMenu mainMenu = new MainMenu();
					mainMenu.showMenu();
				}
			}
		});
		btnNewButton.setBounds(174, 218, 117, 29);
		contentPane.add(btnNewButton);
	}
}
