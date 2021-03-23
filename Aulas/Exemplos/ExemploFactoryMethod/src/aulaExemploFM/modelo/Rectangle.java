package aulaExemploFM.modelo;

public class Rectangle extends Shape{

	public Rectangle(String tipo) {
		super(tipo);
		System.out.println("Construiu Retângulo");
	}
	
	public String draw(){
		return "Desenhou Retângulo";
	}
	

}
