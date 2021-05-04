package com.sebastian.swing.e1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class LaOnce {

	private JFrame frame;
	private int[] arrResultado;
	private int[] arrGenerar;
	int cuantosIgualesEnReversa = 0;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaOnce window = new LaOnce();
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
	public LaOnce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BusinessLogic bl = new BusinessLogic();
		JButton btnCobrar = new JButton("Cobrar");
		JButton btnResultado = new JButton("Resultado");
		JButton btnGenerar = new JButton("Generar");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNum1 = new JLabel("N/A");
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setForeground(Color.LIGHT_GRAY);
		lblNum1.setBounds(62, 52, 46, 50);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("N/A");
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setForeground(Color.LIGHT_GRAY);
		lblNum2.setBounds(182, 52, 46, 50);
		frame.getContentPane().add(lblNum2);
		
		JLabel lblNum3 = new JLabel("N/A");
		lblNum3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum3.setForeground(Color.LIGHT_GRAY);
		lblNum3.setBounds(122, 52, 46, 50);
		frame.getContentPane().add(lblNum3);
		
		JLabel lblNum4 = new JLabel("N/A");
		lblNum4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum4.setForeground(Color.LIGHT_GRAY);
		lblNum4.setBounds(242, 52, 46, 50);
		frame.getContentPane().add(lblNum4);
		
		JLabel lblNum5 = new JLabel("N/A");
		lblNum5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum5.setForeground(Color.LIGHT_GRAY);
		lblNum5.setBounds(302, 52, 46, 50);
		frame.getContentPane().add(lblNum5);
		
		JLabel lblResult = new JLabel("La Once");
		lblResult.setEnabled(false);
		lblResult.setForeground(Color.BLACK);
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(93, 219, 224, 31);
		frame.getContentPane().add(lblResult);
		
		
		btnCobrar.setEnabled(false);
		btnCobrar.addActionListener((e) -> {
			int premio = bl.getPremio(cuantosIgualesEnReversa);
			String text = String.format("Has ganado %d Euros!", premio);
			lblResult.setText(text);
			btnCobrar.setEnabled(false);
			btnResultado.setEnabled(false);
			btnGenerar.setEnabled(true);
		});
		btnCobrar.setBounds(51, 148, 89, 44);
		frame.getContentPane().add(btnCobrar);
		
		
		btnResultado.setEnabled(false);
		btnResultado.addActionListener((e) -> {
			arrResultado = bl.conseguir5NumerosAleatorios();
			lblNum1.setText(String.valueOf(arrResultado[0]));
			lblNum2.setText(String.valueOf(arrResultado[1]));
			lblNum3.setText(String.valueOf(arrResultado[2]));
			lblNum4.setText(String.valueOf(arrResultado[3]));
			lblNum5.setText(String.valueOf(arrResultado[4]));
			btnResultado.setEnabled(false);
			
			cuantosIgualesEnReversa = bl.cuantosIgualesEnReversa(arrGenerar, arrResultado);
			lblResult.setText(String.valueOf(cuantosIgualesEnReversa));
			if (cuantosIgualesEnReversa > 0) {
				btnCobrar.setEnabled(true);
				btnGenerar.setEnabled(false);
			}
		});
		btnResultado.setBounds(163, 148, 89, 44);
		frame.getContentPane().add(btnResultado);
		
		
		
		
		btnGenerar.addActionListener((e) -> {
			arrGenerar = bl.conseguir5NumerosAleatorios();
			lblNum1.setText(String.valueOf(arrGenerar[0]));
			lblNum2.setText(String.valueOf(arrGenerar[1]));
			lblNum3.setText(String.valueOf(arrGenerar[2]));
			lblNum4.setText(String.valueOf(arrGenerar[3]));
			lblNum5.setText(String.valueOf(arrGenerar[4]));
			btnResultado.setEnabled(true);
		});
		btnGenerar.setBounds(275, 148, 89, 44);
		frame.getContentPane().add(btnGenerar);
		
		
	}
}
