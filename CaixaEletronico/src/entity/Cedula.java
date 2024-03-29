package entity;

public class Cedula {
	private double saldo;
	private double vlrASacar;
	private String resultado;
	
	public Cedula() {
		this.vlrASacar = 0.0;
	}
	public Cedula(double vlrASacar) {
		this.vlrASacar = vlrASacar;
	}
	
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getVlrASacar() {
		return vlrASacar;
	}
	public void setVlrASacar(double vlrASacar) {
		this.vlrASacar = vlrASacar;
	}

	@Override
	public String toString() {
		return "Cedula [saldo=" + saldo + ", vlrASacar=" + vlrASacar + "]";
	}
}
