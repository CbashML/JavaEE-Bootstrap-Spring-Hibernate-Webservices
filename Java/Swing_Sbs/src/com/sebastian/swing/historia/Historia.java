package com.sebastian.swing.historia;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;

public class Historia {

	private JFrame frame;
	private String[] data;
	private boolean hide = false;
	
	private JButton btnOcultarHistoria;
	private JButton btnSiguiente;
	private JButton btnIniciarPartida;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historia window = new Historia();
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
	public Historia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BusinessLogic bl = new BusinessLogic();
		
		try {
			UIManager.setLookAndFeel(
			        UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		frame = new JFrame();
		frame.setBounds(700, 100, 490, 290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panelPrincipal = new JPanel();
		frame.getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblHistoria = new JLabel("Historia:");
		lblHistoria.setBounds(10, 11, 74, 14);
		panelPrincipal.add(lblHistoria);
		
		JLabel lblNewLabel = new JLabel("Descripci\u00F3n:");
		lblNewLabel.setBounds(10, 125, 74, 19);
		panelPrincipal.add(lblNewLabel);
		
		JTextPane txtPaneHistoria = new JTextPane();
		txtPaneHistoria.setEditable(false);
		txtPaneHistoria.setBounds(10, 38, 454, 76);
		panelPrincipal.add(txtPaneHistoria);
		
		JTextPane txtPaneDescripcion = new JTextPane();
		txtPaneDescripcion.setEditable(false);
		txtPaneDescripcion.setBounds(10, 155, 454, 44);
		panelPrincipal.add(txtPaneDescripcion);
		
		btnOcultarHistoria = new JButton("Ocultar historia");
		btnOcultarHistoria.addActionListener((e) -> {
			if (!hide) {
				hide = true;
				txtPaneHistoria.setText("");
				txtPaneDescripcion.setText("");
				btnSiguiente.setEnabled(!hide);
				btnIniciarPartida.setEnabled(hide);
			}else {
				hide = false;
				String history = bl.getStringForTextFieldOf(80, data[0]);
				String description = data[1];
				txtPaneHistoria.setText(history);
				txtPaneDescripcion.setText(description);
				btnSiguiente.setEnabled(!hide);
				btnIniciarPartida.setEnabled(hide);
			}
			
		});
		btnOcultarHistoria.setEnabled(false);
		btnOcultarHistoria.setBounds(10, 210, 136, 30);
		panelPrincipal.add(btnOcultarHistoria);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener((e) -> {
			data = bl.getHistoryAndDescriptionFromCsv();
			String history = bl.getStringForTextFieldOf(80, data[0]);
			String description = data[1];
			txtPaneHistoria.setText(history);
			txtPaneDescripcion.setText(description);
		});
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(192, 210, 89, 30);
		panelPrincipal.add(btnSiguiente);
		
		btnIniciarPartida = new JButton("Iniciar partida");
		btnIniciarPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				data = bl.getHistoryAndDescriptionFromCsv();
				String history = bl.getStringForTextFieldOf(80, data[0]);
				String description = data[1];
				txtPaneHistoria.setText(history);
				txtPaneDescripcion.setText(description);
				btnOcultarHistoria.setEnabled(true);
				btnSiguiente.setEnabled(true);
				btnIniciarPartida.setEnabled(false);
			}
		});
		btnIniciarPartida.setBounds(328, 210, 136, 30);
		panelPrincipal.add(btnIniciarPartida);
	}
}
