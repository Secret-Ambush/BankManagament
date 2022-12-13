
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings({ "serial", "unused" })
public class Categories extends JFrame {

	private JPanel contentPane;
	private JTextField catid_text;
	private JTextField catdep_text;
	private JTextField catic_text;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JButton upd_cat;
	private JButton del_cat;
	DefaultTableModel model;

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
	@SuppressWarnings("unused")
	public Categories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel catTitle = new JLabel("CATEGORIES");
		catTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		catTitle.setBounds(407,15, 186, 40);
		contentPane.add(catTitle);
	
		
		JLabel cat_id = new JLabel("CATEGORY ID");
		cat_id.setBackground(new Color(255, 255, 255));
		cat_id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cat_id.setHorizontalAlignment(SwingConstants.LEFT);
		cat_id.setBounds(277, 75, 143, 30);
		contentPane.add(cat_id);
		
		JLabel department = new JLabel("DEPARTMENT");
		department.setBackground(new Color(255, 255, 255));
		department.setHorizontalAlignment(SwingConstants.LEFT);
		department.setFont(new Font("Tahoma", Font.PLAIN, 15));
		department.setBounds(277, 115, 143, 30);
		contentPane.add(department);
		
		JLabel cat_id_2 = new JLabel("NAME OF IN-CHARGE");
		cat_id_2.setBackground(new Color(255, 255, 255));
		cat_id_2.setHorizontalAlignment(SwingConstants.LEFT);
		cat_id_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cat_id_2.setBounds(277, 155, 160, 30);
		contentPane.add(cat_id_2);
		
		catid_text = new JTextField();
		catid_text.setBounds(463, 79, 200, 27);
		contentPane.add(catid_text);
		catid_text.setColumns(10);
		
		catdep_text = new JTextField();
		catdep_text.setColumns(10);
		catdep_text.setBounds(463, 119, 200, 27);
		contentPane.add(catdep_text);
		
		catic_text = new JTextField();
		catic_text.setColumns(10);
		catic_text.setBounds(463, 159, 200, 27);
		contentPane.add(catic_text);
		
	
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 278, 834, 490);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table_1.getSelectedRow();
				catid_text.setText(model.getValueAt(i, 0).toString());
				catdep_text.setText(model.getValueAt(i, 1).toString());
				catic_text.setText(model.getValueAt(i, 2).toString());
			}
		});
		table_1.setBackground(new Color(255, 255, 255));
		model= new DefaultTableModel();
		Object[] column = {"CATEGORY ID","DEPARTMENT","NAME OF INCHARGE"};
		Object[] row = new Object[15];
		model.setColumnIdentifiers(column);
		table_1.setModel(model);
		scrollPane.setViewportView(table_1);
	
		JButton addcat = new JButton("ADD");
		addcat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(catid_text.getText().equals("")|| catdep_text.getText().equals("") || catic_text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all necessary fields");
				}
				else {
				row[0]=catid_text.getText();
				row[1]=catdep_text.getText();
				row[2]=catic_text.getText();
				model.addRow(row);
				CategoryTypes.catViewer(catid_text.getText(),catdep_text.getText(),catic_text.getText());
				
				catid_text.setText("");
				catdep_text.setText("");
				catic_text.setText("");
				JOptionPane.showMessageDialog(null, "Saved Successfully");
				}
			}
		});
		addcat.setBounds(277, 218, 95, 30);
		contentPane.add(addcat);
		
		upd_cat = new JButton("UPDATE");
		upd_cat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=table_1.getSelectedRow();
				model.setValueAt(catid_text.getText(), j, 0);
				model.setValueAt(catdep_text.getText(), j, 1);
				model.setValueAt(catic_text.getText(), j, 2);
				CategoryTypes a = new CategoryTypes(catid_text.getText(),catdep_text.getText(),catic_text.getText());
				
				
			}
		});
		upd_cat.setBounds(421, 218, 95, 30);
		contentPane.add(upd_cat);
		
		del_cat = new JButton("DELETE");
		del_cat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i =table_1.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
				}
				else {
					JOptionPane.showMessageDialog(null, "You did not select anything to delete");
				}
			}
		});
		del_cat.setBounds(568, 218, 95, 30);
		contentPane.add(del_cat);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mainMenu = new MainMenu();
				mainMenu.showMenu();
			}
		});
		back.setBounds(18, 6, 73, 29);
		contentPane.add(back);
	}
}