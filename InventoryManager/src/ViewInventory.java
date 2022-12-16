import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class ViewInventory extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInventory frame = new ViewInventory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewInventory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 586, 487);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInverntory = new JLabel("Inventory");
		lblInverntory.setHorizontalAlignment(SwingConstants.CENTER);
		lblInverntory.setForeground(Color.WHITE);
		lblInverntory.setFont(new Font("Georgia", Font.BOLD, 24));
		lblInverntory.setBounds(60, 0, 466, 47);
		panel.add(lblInverntory);
		
		JLabel lblEquipmentDetails = new JLabel("Equipment Details");
		lblEquipmentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquipmentDetails.setForeground(Color.WHITE);
		lblEquipmentDetails.setFont(new Font("Georgia", Font.BOLD, 24));
		lblEquipmentDetails.setBounds(0, 59, 301, 47);
		panel.add(lblEquipmentDetails);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(328, 73, 91, 27);
		panel.add(comboBox);
	}
}
