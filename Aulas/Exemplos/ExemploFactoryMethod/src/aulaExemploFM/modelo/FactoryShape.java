package aulaExemploFM.modelo;

//Pode ou não fazer extends para AbstractFactoryShape
public class FactoryShape extends AbstractFactoryShape {
	
	
	public FactoryShape(){}
	
	//factory method
	public Shape getShape(String tipo){
		if (tipo.equals("retangulo"))
			return new Rectangle("retangulo");
		
		else if (tipo.equals("poligono"))
			return new Polygon("poligono");
		
		else if (tipo.equals("circulo"))
			return new Circle("circulo");
		
		else return null;
			
	}
	

}
			