package aulaExemploFM.visao;

import aulaExemploFM.modelo.FactoryShape;
import aulaExemploFM.modelo.Shape;

public class Cliente {

	public static void main(String[] args) {
		FactoryShape fabrica = new FactoryShape();
		
		Shape sh = fabrica.getShape("poligono");
		
		//Shape sh = FactoryShape.getShape("poligono");
		
		
		System.out.println(sh.draw());

	}

}
