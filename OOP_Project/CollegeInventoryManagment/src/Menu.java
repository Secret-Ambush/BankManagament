import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void showMenu()
	{
		Menu frame = new Menu();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.showLogin();
			}
		});
		back.setBounds(6, 11, 73, 29);
		contentPane.add(back);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblMenu.setBounds(190, 10, 205, 26);
		contentPane.add(lblMenu);
		
		
	}

}
