package com.sebastian.swing.prueba4;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class EuroMillones3 {

	private JFrame frame;
	private int tiradas = 0;
	private ArrayList<Integer> numeros;
	private ArrayList<Integer> estrellas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EuroMillones3 window = new EuroMillones3();
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
	public EuroMillones3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BusinessLogic bl = new BusinessLogic();

		frame = new JFrame();
		frame.setBounds(700, 200, 439, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNum1 = new JLabel("0");
		lblNum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum1.setBounds(36, 49, 40, 40);
		frame.getContentPane().add(lblNum1);

		JLabel lblNum2 = new JLabel("0");
		lblNum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum2.setBounds(86, 49, 40, 40);
		frame.getContentPane().add(lblNum2);

		JLabel lblNum3 = new JLabel("0");
		lblNum3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum3.setBounds(136, 49, 40, 40);
		frame.getContentPane().add(lblNum3);

		JLabel lblNum4 = new JLabel("0");
		lblNum4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum4.setBounds(186, 49, 40, 40);
		frame.getContentPane().add(lblNum4);

		JLabel lblNum5 = new JLabel("0");
		lblNum5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum5.setBounds(236, 49, 40, 40);
		frame.getContentPane().add(lblNum5);

		JLabel lblNumStar1 = new JLabel("0");
		lblNumStar1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumStar1.setBounds(303, 49, 40, 40);
		frame.getContentPane().add(lblNumStar1);

		JLabel lblNumStar2 = new JLabel("0");
		lblNumStar2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumStar2.setBounds(353, 49, 40, 40);
		frame.getContentPane().add(lblNumStar2);

		// Rellenamos todos los JLabels con su correspondiente número.
		// Y en caso de tirar una cuarte vez devolvemos un mensaje.
		JButton btnTirar = new JButton("Tirar");
		btnTirar.addActionListener((e) -> {
			if (tiradas < 3) {
				numeros = bl.getArrOf5NumFrom1To50();
				estrellas = bl.getArrOf2NumFrom1To12();
				lblNum1.setText(String.valueOf(numeros.remove(numeros.size() - 1)));
				lblNum2.setText(String.valueOf(numeros.remove(numeros.size() - 1)));
				lblNum3.setText(String.valueOf(numeros.remove(numeros.size() - 1)));
				lblNum4.setText(String.valueOf(numeros.remove(numeros.size() - 1)));
				lblNum5.setText(String.valueOf(numeros.remove(numeros.size() - 1)));
				lblNumStar1.setText(String.valueOf(estrellas.remove(estrellas.size() - 1)));
				lblNumStar2.setText(String.valueOf(estrellas.remove(estrellas.size() - 1)));
				tiradas++;
			} else {
				btnTirar.setEnabled(false);
				JOptionPane.showMessageDialog(frame, "Número máximo de \r\n"
						+ "tiradas alcanzadas");
			}
		});
		btnTirar.setBounds(161, 100, 95, 45);
		frame.getContentPane().add(btnTirar);
	}
}
