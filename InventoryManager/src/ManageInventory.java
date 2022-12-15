
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings({ "serial", "unused" })
public class ManageInventory extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void ManageInv() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageInventory manframe = new ManageInventory();
					manframe.setSize(1000,750);
					manframe.setVisible(true);
					manframe.setResizable(false);                    
					manframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageInventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel manTitle =  new JLabel("MANAGE INVENTORY");
		manTitle.setBounds(352, 15, 295, 40);
		manTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		contentPane.add(manTitle);
	}
}