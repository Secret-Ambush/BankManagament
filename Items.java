

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
public class Items extends JFrame {

	private JPanel contentPane;
	private JTextField itid_text;
	private JTextField itdep_text;
	private JTextField itic_text;
	private JTable table_1;
	private JScrollPane scrollPane;
	private JButton upd_it;
	private JButton del_it;
	DefaultTableModel model;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the appliition.
	 */
	public void itScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Items itframe = new Items();
					itframe.setSize(1000,750);
					itframe.setVisible(true);
					itframe.setResizable(false);                    
					itframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} itch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unused")
	public Items() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 953, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel itTitle = new JLabel("items");
		itTitle.setFont(new Font("Algerian", Font.PLAIN, 30));
		itTitle.setBounds(407,15, 186, 40);
		contentPane.add(itTitle);
	
		
		JLabel it_id = new JLabel("item ID");
		it_id.setBackground(new Color(255, 255, 255));
		it_id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		it_id.setHorizontalAlignment(SwingConstants.LEFT);
		it_id.setBounds(61, 76, 143, 30);
		contentPane.add(it_id);
		
		JLabel department = new JLabel("DEPARTMENT");
		department.setBackground(new Color(255, 255, 255));
		department.setHorizontalAlignment(SwingConstants.LEFT);
		department.setFont(new Font("Tahoma", Font.PLAIN, 15));
		department.setBounds(61, 118, 143, 30);
		contentPane.add(department);
		
		JLabel it_id_2 = new JLabel("NAME OF INCHARGE");
		it_id_2.setBackground(new Color(255, 255, 255));
		it_id_2.setHorizontalAlignment(SwingConstants.LEFT);
		it_id_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		it_id_2.setBounds(61, 156, 143, 30);
		contentPane.add(it_id_2);
		
		itid_text = new JTextField();
		itid_text.setBounds(216, 79, 200, 27);
		contentPane.add(itid_text);
		itid_text.setColumns(10);
		
		itdep_text = new JTextField();
		itdep_text.setColumns(10);
		itdep_text.setBounds(216, 121, 200, 27);
		contentPane.add(itdep_text);
		
		itic_text = new JTextField();
		itic_text.setColumns(10);
		itic_text.setBounds(216, 159, 200, 27);
		contentPane.add(itic_text);
		
	
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 278, 834, 490);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table_1.getSelectedRow();
				itid_text.setText(model.getValueAt(i, 0).toString());
				itdep_text.setText(model.getValueAt(i, 1).toString());
				itic_text.setText(model.getValueAt(i, 2).toString());
			}
		});
		table_1.setBackground(new Color(255, 255, 255));
		model= new DefaultTableModel();
		Object[] column = {"itEGORY ID","DEPARTMENT","NAME OF INCHARGE"};
		Object[] row = new Object[15];
		model.setColumnIdentifiers(column);
		table_1.setModel(model);
		scrollPane.setViewportView(table_1);
	
		JButton addit = new JButton("ADD");
		addit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(itid_text.getText().equals("")|| itdep_text.getText().equals("") || itic_text.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please fill all necessary fields");
				}
				else {
				row[0]=itid_text.getText();
				row[1]=itdep_text.getText();
				row[2]=itic_text.getText();
				model.addRow(row);
				
				itid_text.setText("");
				itdep_text.setText("");
				itic_text.setText("");
				JOptionPane.showMessageDialog(null, "Saved Successfully");
				}
			}
		});
		addit.setBounds(277, 218, 95, 30);
		contentPane.add(addit);
		
		upd_it = new JButton("UPDATE");
		upd_it.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int j=table_1.getSelectedRow();
				model.setValueAt(itid_text.getText(), j, 0);
				model.setValueAt(itdep_text.getText(), j, 1);
				model.setValueAt(itic_text.getText(), j, 2);
			}
		});
		upd_it.setBounds(421, 218, 95, 30);
		contentPane.add(upd_it);
		
		del_it = new JButton("DELETE");
		del_it.addActionListener(new ActionListener() {
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
		del_it.setBounds(568, 218, 95, 30);
		contentPane.add(del_it);
		
		JLabel name_item = new JLabel("NAME OF ITEM");
		name_item.setHorizontalAlignment(SwingConstants.LEFT);
		name_item.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name_item.setBackground(Color.WHITE);
		name_item.setBounds(450, 67, 143, 30);
		contentPane.add(name_item);
		
		JLabel qtyitem = new JLabel("QUANTITY");
		qtyitem.setHorizontalAlignment(SwingConstants.LEFT);
		qtyitem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		qtyitem.setBackground(Color.WHITE);
		qtyitem.setBounds(450, 118, 143, 30);
		contentPane.add(qtyitem);
		
		JLabel priceitem = new JLabel("UNIT PRICE");
		priceitem.setHorizontalAlignment(SwingConstants.LEFT);
		priceitem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		priceitem.setBackground(Color.WHITE);
		priceitem.setBounds(450, 164, 143, 30);
		contentPane.add(priceitem);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(580, 67, 200, 27);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(580, 121, 200, 27);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(580, 159, 200, 27);
		contentPane.add(textField_2);
	}
}