import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

import javax.swing.ImageIcon;
import java.awt.Color; 
@SuppressWarnings({ "serial", "unused" })
public class LoadingScreen extends JFrame {

	private JPanel contentPane;
	public static void LoadingS() {
		LoadingScreen loadframe = new LoadingScreen();
		loadframe.setVisible(true);
		loadframe.setSize(1000,750);
	
	}


	public LoadingScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 750, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel loading = new JLabel("");
		loading.setBackground(new Color(0, 0, 0));
		ImageIcon MainIcon = new ImageIcon(this.getClass().getResource("/EntryPage.gif"));
		loading.setIcon(MainIcon);
		loading.setBounds(0, 0, 750, 500);
		contentPane.add(loading);
	}
}
