
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
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
		setBounds(100, 100, 941, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel AboutUsTitle =  new JLabel("ABOUT US");
		AboutUsTitle.setBounds(420, 15, 237, 40);
		AboutUsTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		contentPane.add(AboutUsTitle);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.showMenu();
			}
		});
		back.setBounds(6, 6, 73, 29);
		contentPane.add(back);
	}
}