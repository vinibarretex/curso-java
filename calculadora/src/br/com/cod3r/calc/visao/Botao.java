package br.com.cod3r.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("courier", Font.PLAIN, 30));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setForeground(Color.WHITE);
		setFocusable(false);
	}
}
