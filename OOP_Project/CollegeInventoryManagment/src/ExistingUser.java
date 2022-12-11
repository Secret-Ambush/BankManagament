import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExistingUser extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public void showExistingUser()
	{
		ExistingUser frame = new ExistingUser();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ExistingUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Existing User");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel.setBounds(158, 40, 205, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(45, 83, 81, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(45, 130, 81, 16);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(138, 78, 214, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(136, 125, 214, 26);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(167, 173, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.showLogin();
			}
		});
		back.setBounds(6, 1, 73, 29);
		contentPane.add(back);
	}
	     
	       public void load()
	       {
	    	   Connection con1;
	  	     PreparedStatement insert;
	  	     ResultSet rs1;
	       
	           try 
	           {
	               Class.forName("com.mysql.jdbc.Driver");
	               con1 = DriverManager.getConnection("jdbc:mysql://localhost/customer","root","");
	               insert = con1.prepareStatement("SELECT * FROM user WHERE username=? and password=? ");                           
	               insert.setString(1, textField.getText());
	               insert.setString(2,textField_1.getText());
	               rs1=insert.executeQuery();
			        if(rs1.next())
			          {
			             mainmenu c = new mainmenu();
			             this.hide();
			             c.setVisible(true);           
			          }
			         else
			          {
			            JOptionPane.showMessageDialog(null, "Username and password do not matched");
			            textField.setText("");
			            textField_1.setText("");
			            textField.requestFocus();
			           }               
			   } 
	           catch (Exception e) 
	           {
	                 System.out.println("Failed " + e);
	           }
	       
	       }  
}

