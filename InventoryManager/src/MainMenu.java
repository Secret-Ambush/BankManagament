import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings("serial")
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
					mainframe.setResizable(false);
					mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
		setBounds(100, 100, 1027, 576);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("\tBPDC INVENTORY MANAGEMENT SYSTEM");
		title.setForeground(new Color(255, 255, 255));
		title.setBackground(new Color(255, 128, 64));
		title.setFont(new Font("Devanagari MT", Font.BOLD, 30));
		title.setBounds(68, 15, 890, 55);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(title);
		
		JPanel ButtonsPanel = new JPanel();
		ButtonsPanel.setBackground(new Color(32, 178, 170));
		ButtonsPanel.setBounds(68, 108, 890, 375);
		contentPane.add(ButtonsPanel);
		ButtonsPanel.setLayout(null);
		
		JButton Categories = new JButton("CATEGORIES");
		Categories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Categories cat = new Categories();
			cat.show();
			dispose();
			}
		});
		Categories.setForeground(new Color(0, 128, 128));
		Categories.setBackground(new Color(0, 191, 255));
		Categories.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Categories.setBounds(0, 0, 435, 177);
		ButtonsPanel.add(Categories);
		
		JButton Manage = new JButton("MANAGE INVENTORY");
		Manage.setForeground(new Color(0, 128, 128));
		Manage.setBackground(new Color(128, 255, 128));
		Manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				       ManageInventory man = new ManageInventory();
			           man.ManageInv();  
			}
		});
		Manage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Manage.setBounds(455, 0, 435, 177);
		ButtonsPanel.add(Manage);
		
		JButton View = new JButton("VIEW INVENTORY");
		View.setForeground(new Color(0, 128, 128));
		View.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewInventory view = new ViewInventory();
		           view.show();  
		           dispose();
			}
		});
		View.setBackground(new Color(128, 255, 128));
		View.setFont(new Font("Tahoma", Font.PLAIN, 20));
		View.setBounds(0, 198, 435, 177);
		ButtonsPanel.add(View);
		
		JButton About = new JButton("ABOUT US");
		About.setForeground(new Color(0, 128, 128));
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs about = new AboutUs();
		           about.show();
		           dispose();
		           
				
			}
		});
		About.setBackground(new Color(128, 255, 128));
		About.setFont(new Font("Tahoma", Font.PLAIN, 20));
		About.setBounds(455, 198, 435, 177);
		ButtonsPanel.add(About);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setForeground(new Color(0, 128, 128));
		panel.setBounds(0, 172, 890, 29);
		ButtonsPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(431, 0, 28, 375);
		ButtonsPanel.add(panel_1);
		panel_1.setLayout(null);
	}
}