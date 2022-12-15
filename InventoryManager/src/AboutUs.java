
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings({ "unused", "serial" })
public class AboutUs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void AboutU() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs aboutframe = new AboutUs();
					aboutframe.setSize(1000,750);
					aboutframe.setVisible(true);
					aboutframe.setResizable(false);                    
					aboutframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 415, 423);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel AboutUsTitle =  new JLabel("ABOUT US");
		AboutUsTitle.setForeground(new Color(255, 255, 255));
		AboutUsTitle.setBounds(119, 23, 157, 40);
		AboutUsTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		contentPane.add(AboutUsTitle);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32, 178, 170));
		panel.setBounds(0, 78, 415, 317);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Group Members");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(25, 43, 195, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Heramb Devarajan");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(25, 78, 159, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblIdNumbers = new JLabel("ID Numbers");
		lblIdNumbers.setForeground(new Color(0, 0, 0));
		lblIdNumbers.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		lblIdNumbers.setBounds(218, 43, 170, 26);
		panel.add(lblIdNumbers);
		
		JLabel lblNewLabel_1_1 = new JLabel("2021A7PS0033U");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(218, 78, 159, 26);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Akash Rajasekar");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(25, 116, 159, 26);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Riddhi Goswami");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(25, 154, 159, 26);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Karthik Vishal");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(25, 192, 159, 26);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("2021A7PS0007U");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(218, 116, 159, 26);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("2021A7PS0017U");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1_2.setBounds(218, 154, 159, 26);
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("2021A7PS0041U");
		lblNewLabel_1_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_1_3.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_1_1_3.setBounds(218, 192, 159, 26);
		panel.add(lblNewLabel_1_1_3);
		
		JButton mainmenubtn = new JButton("Main Menu");
		mainmenubtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mm1=new MainMenu();
				mm1.show();
			}
		});
		mainmenubtn.setForeground(new Color(0, 128, 128));
		mainmenubtn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		mainmenubtn.setBackground(new Color(0, 128, 128));
		mainmenubtn.setBounds(107, 241, 176, 44);
		panel.add(mainmenubtn);
	}
}