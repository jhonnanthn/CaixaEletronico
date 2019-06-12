package controller;

import entity.Cedula;

public class CedulaController {
	private Cedula cedula;
	
	public CedulaController(Cedula cedula) {
		this.cedula = cedula;
	}
	
	public double saldo() {
		System.out.println(cedula.getSaldo());
		return cedula.getSaldo();
	}
	
	public Object isEmpty() {
		return cedula;
	}

	public Cedula caixaEletronico() {
		int cedulaCem = 0, cedulaCinquenta = 0, cedulaVinte = 0, cedulaDez = 0;
		String resultado;
		cedula.setSaldo(cedula.getVlrASacar());
		
		if(cedula.getSaldo() / 100 > 0) {
			cedulaCem = (int) (cedula.getSaldo() / 100);
			cedula.setSaldo(cedula.getSaldo() - (cedulaCem * 100));
		}
		if(cedula.getSaldo() / 50 > 0) {
			cedulaCinquenta = (int) (cedula.getSaldo() / 50);
			cedula.setSaldo(cedula.getSaldo() - (cedulaCinquenta * 50));
		}
		if(cedula.getSaldo() / 20 > 0) {
			cedulaVinte = (int) (cedula.getSaldo() / 20);
			cedula.setSaldo(cedula.getSaldo() - (cedulaVinte * 20));
		}
		if(cedula.getSaldo() / 10 > 0) {
			cedulaDez = (int) (cedula.getSaldo() / 10);
			cedula.setSaldo(cedula.getSaldo() - (cedulaDez * 10));
		}
		
		cedula.setResultado("Entregar " + cedulaCem + " nota de R$100.00; " + cedulaCinquenta + " de R$50.00; " + cedulaVinte + " de R$20.00; " + cedulaDez + " de R$10.00");
		return cedula;
	}
}
