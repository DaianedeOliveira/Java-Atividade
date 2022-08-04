package br.com.Capitulo5.Testes;

import javax.swing.JOptionPane;

import br.com.Capitulo5.beans.Locadora;

public class TesteLocadora {


public static void main(String[] args) {

	Locadora carros = new Locadora(
			JOptionPane.showInputDialog("Digite seu nome"),
			Integer.parseInt(JOptionPane.showInputDialog("Digite seu cep")),
			JOptionPane.showInputDialog("Digite sua cidade"),
	        Integer.parseInt(JOptionPane.showInputDialog("Digite sua cnpj"))

			);

System.out.println(carros.getBasico());
		System.out.println(carros.getCep());
	}

}
