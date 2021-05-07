package com.sebastian.swing.prueba3;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class EuroMillones {

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
					EuroMillones window = new EuroMillones();
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
	public EuroMillones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BusinessLogic bl = new BusinessLogic();

		frame = new JFrame();
		frame.setBounds(700, 200, 400, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
		
		ArrayList<JLabel> jlabels = new ArrayList<JLabel>(7);
		for (int i = 0; i < 7; i++) {
			JLabel lblNum = new JLabel("0");
			lblNum.setHorizontalAlignment(SwingConstants.CENTER);
			lblNum.setBounds(40 + i * 40, 49, 40, 40);
			frame.getContentPane().add(lblNum);
			jlabels.add(lblNum);
		}

		// Rellenamos todos los JLabels con su correspondiente número.
		// Y en caso de tirar una cuarte vez devolvemos un mensaje.
		JButton btnTirar = new JButton("Tirar");
		btnTirar.addActionListener((e) -> {
			if (tiradas < 3) {
				numeros = bl.getArrOf5NumFrom1To50();
				estrellas = bl.getArrOf2NumFrom1To12();
				for (int i = 0; i < 7; i++) 
					if(i < 5 )
						jlabels.get(i).setText(String.valueOf(numeros.remove(numeros.size() - 1)));
					else
						jlabels.get(i).setText(String.valueOf(estrellas.remove(estrellas.size() - 1)));
				tiradas++;
			} else {
				btnTirar.setEnabled(false);
				JOptionPane.showMessageDialog(frame, "Número máximo de \r\n"
						+ "tiradas alcanzadas");
			}
		});
		btnTirar.setBounds(140, 100, 80, 45);
		frame.getContentPane().add(btnTirar);
	}
}
