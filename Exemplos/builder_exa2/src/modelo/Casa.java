package modelo;

public class Casa extends Edificacao{


	private int m2;
	
	public Casa() {
		super();
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	@Override
	public String toString() {
		return "Casa [m2=" + m2 + ", getEndereco()=" + getEndereco() + ", getPreco()=" + getPreco() + "]";
	}
	


}
