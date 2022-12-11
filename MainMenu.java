import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu mainframe = new MainMenu();
				    mainframe.setSize(1000,750);
					mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1208, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("\tBPDC INVENTORY MANAGEMENT SYSTEM");
		title.setBackground(new Color(255, 128, 64));
		title.setFont(new Font("Algerian", Font.PLAIN, 30));
		title.setBounds(68, 15, 890, 32);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(title);
		
		JPanel ButtonsPanel = new JPanel();
		ButtonsPanel.setBounds(68, 108, 890, 375);
		contentPane.add(ButtonsPanel);
		ButtonsPanel.setLayout(null);
		
		JButton Categories = new JButton("CATEGORIES");
		Categories.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Categories.setBounds(0, 0, 435, 177);
		ButtonsPanel.add(Categories);
		
		JButton Manage = new JButton("MANAGE IVENTORY");
		Manage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Manage.setBounds(455, 0, 435, 177);
		ButtonsPanel.add(Manage);
		
		JButton View = new JButton("VIEW INVENTORY");
		View.setFont(new Font("Tahoma", Font.PLAIN, 20));
		View.setBounds(0, 198, 435, 177);
		ButtonsPanel.add(View);
		
		JButton About = new JButton("ABOUT US");
		About.setFont(new Font("Tahoma", Font.PLAIN, 20));
		About.setBounds(455, 198, 435, 177);
		ButtonsPanel.add(About);
	}
}
