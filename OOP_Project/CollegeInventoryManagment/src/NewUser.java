import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class NewUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		textField = new JTextField();
		textField.setBounds(174, 66, 232, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 110, 232, 26);
		contentPane.add(textField_1);
		
		JLabel lblReenterPassword = new JLabel("Re-enter Password");
		lblReenterPassword.setBounds(48, 161, 118, 16);
		contentPane.add(lblReenterPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(174, 156, 232, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(220, 190, 186, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password1 = textField_1.getText();
				String password2 = textField_2.getText();
				if (password2.equals(password1))
				{
					Menu a = new Menu();
					a.showMenu();
				}
				else
				{
					lblNewLabel.setText("Incorrect Pasword. Try again");
				}
			}
		});
		btnNewButton.setBounds(174, 218, 117, 29);
		contentPane.add(btnNewButton);
	}
}
