

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Categories extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void CatScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Categories catframe = new Categories();
					catframe.setSize(1000,750);
					catframe.setVisible(true);
					catframe.setResizable(false);                    
					catframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Categories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel catTitle = new JLabel("CATEGORIES");
		catTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		catTitle.setBounds(407,15, 186, 40);
		contentPane.add(catTitle);
		
		JButton catBackButton = new JButton("BACK");
		catBackButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		catBackButton.setBounds(0, 0, 57, 28);
		contentPane.add(catBackButton);
	}
}