package com.sebastian.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Searcher {

	private JFrame frame;
	private JTextField textFieldSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searcher window = new Searcher();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Searcher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(184, 67, 46, 14);
		frame.getContentPane().add(lblSearch);
		
		textFieldSearch = new JTextField();
		textFieldSearch.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSearch.setForeground(Color.LIGHT_GRAY);
		textFieldSearch.setText("Query to process");
		textFieldSearch.setBounds(73, 91, 276, 20);
		frame.getContentPane().add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Duck Duck Go", "Youtube", "Stack Over Flow", "Google"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(153, 122, 117, 22);
		frame.getContentPane().add(comboBox);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.getAccessibleContext();
				System.out.println(comboBox.getAccessibleContext());
			}
		});
		btnSearch.setBounds(166, 156, 89, 23);
		frame.getContentPane().add(btnSearch);
		
		
		
	}
}
