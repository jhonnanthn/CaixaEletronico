package entity;

public class Cedula {
	private double saldo;
	private double vlrASacar;
	
	public Cedula() {
		this.vlrASacar = 0.0;
	}
	public Cedula(double vlrASacar) {
		this.vlrASacar = vlrASacar;
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
