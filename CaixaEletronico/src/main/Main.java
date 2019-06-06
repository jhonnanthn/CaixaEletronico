package main;

import javax.swing.JOptionPane;

import controller.CedulaController;
import entity.Cedula;

public class Main {
	public static void main(String[] args) {
		double vlrASacar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a sacar: "));
		Cedula cedula = new Cedula(vlrASacar);
		CedulaController cedulaController = new CedulaController(cedula);
		String resultado = cedulaController.caixaEletronico();
		System.out.println("//--------------------------------------------------------------------//");
		System.out.println(resultado);
		System.out.println("//--------------------------------------------------------------------//");
		JOptionPane.showMessageDialog(null, resultado);
	}
}
