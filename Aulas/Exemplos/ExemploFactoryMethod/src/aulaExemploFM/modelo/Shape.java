package aulaExemploFM.modelo;

public class Shape{
	
	private String tipo;
	
	public Shape(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String draw(){
		return "Desenhou";
	}
	
	
	
}
