import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lbDisplayProcessing;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		showLogin();
	}

	/**
	 * Create the frame.
	 */
	public static void showLogin()
	{
		Login frame = new Login();
		frame.setVisible(true);
	}
	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to ");
		lblNewLabel.setBounds(178, 47, 129, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("College Inventory Management");
		lblNewLabel_1.setBounds(121, 75, 218, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lbDisplayProcessing = new JLabel("");
		lbDisplayProcessing.setBounds(175, 185, 164, 16);
		contentPane.add(lbDisplayProcessing);
		
		JButton ExistingUser = new JButton("Existing User");
		ExistingUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ExistingUser b = new ExistingUser();
				b.showExistingUser();
			}
		});
		ExistingUser.setBounds(248, 144, 117, 29);
		contentPane.add(ExistingUser);
		
		JButton NewUser = new JButton("New User"); 
		NewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewUser a = new NewUser();
				a.showWindow();
				
			}
		});
		NewUser.setBounds(87, 144, 117, 29);
		contentPane.add(NewUser);
		
		
	}
}
