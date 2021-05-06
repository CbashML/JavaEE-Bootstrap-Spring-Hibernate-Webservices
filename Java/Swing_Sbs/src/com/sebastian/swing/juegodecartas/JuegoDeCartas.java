package com.sebastian.swing.juegodecartas;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;

public class JuegoDeCartas {

	private JFrame frame;
	private ArrayList<Carta> cartas;
	private Carta carta;
	private Carta cartaAnterior;
	private int aciertos;
	
	private JButton btnMayor;
	private JButton btnMenor;
	private JButton btnIgual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JuegoDeCartas window = new JuegoDeCartas();
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
	public JuegoDeCartas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		BusinessLogic bl = new BusinessLogic();
		cartas = bl.getCartas();

		frame = new JFrame();
		frame.setBounds(700, 200, 450, 208);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextPane textPaneCarta = new JTextPane();
		cartaAnterior = cartas.remove(cartas.size() - 1);
		String text = String.format("%s de %s", cartaAnterior.getNum(), cartaAnterior.getTipo());
		textPaneCarta.setText(text);
		textPaneCarta.setEditable(false);
		textPaneCarta.setBounds(109, 23, 211, 25);
		frame.getContentPane().add(textPaneCarta);

		JLabel lblAciertos = new JLabel("Aciertos:");
		lblAciertos.setBounds(174, 59, 53, 25);
		frame.getContentPane().add(lblAciertos);

		JLabel lblNumAciertos = new JLabel("0");
		lblNumAciertos.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumAciertos.setBounds(222, 59, 32, 25);
		frame.getContentPane().add(lblNumAciertos);

		btnMayor = new JButton("Mayor");
		btnMayor.addActionListener((e) -> {
			siguienteCarta(textPaneCarta);
			if (carta.getNum() > cartaAnterior.getNum()) {
				aciertos++;
				lblNumAciertos.setText(String.valueOf(aciertos));
			}
			cartaAnterior = carta;
		});
		btnMayor.setBounds(37, 95, 103, 38);
		frame.getContentPane().add(btnMayor);

		btnMenor = new JButton("Menor");
		btnMenor.addActionListener((e) -> {
			siguienteCarta(textPaneCarta);
			if (carta.getNum() < cartaAnterior.getNum()){
				aciertos++;
				lblNumAciertos.setText(String.valueOf(aciertos));
			}
			cartaAnterior = carta;
		});
		btnMenor.setBounds(162, 95, 103, 38);
		frame.getContentPane().add(btnMenor);

		btnIgual = new JButton("Igual");
		btnIgual.addActionListener((e) -> {
			siguienteCarta(textPaneCarta);
			if (carta.getNum() == cartaAnterior.getNum()){
				aciertos++;
				lblNumAciertos.setText(String.valueOf(aciertos));
			}
			cartaAnterior = carta;
		});
		btnIgual.setBounds(286, 95, 103, 38);
		frame.getContentPane().add(btnIgual);
	}

	private void siguienteCarta(JTextPane textPaneCarta) {
		if (cartas.size() != 0)
			carta = cartas.remove(cartas.size() - 1);
		else
			disableAllButtons();
		String txt = String.format("%s de %s", carta.getNum(), carta.getTipo());
		textPaneCarta.setText(txt);
	}
	
	public void disableAllButtons() {
		btnMayor.setEnabled(false);
		btnMenor.setEnabled(false);
		btnIgual.setEnabled(false);
	}
}
