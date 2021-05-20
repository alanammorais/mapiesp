package model;
import java.util.ArrayList;


public class GraficoComposto extends Grafico {

	ArrayList<Grafico> lista = new ArrayList<Grafico>();
	
	public GraficoComposto() {
		super();
	}
	
	public void desenhar() {
		System.out.println("\nGrafico composto desenhado: ");
		
		for (int i =0; i<this.lista.size(); i++){
			Grafico g = (Grafico)lista.get(i);
			g.desenhar();
		}
		
	}

	public void adicionarF(Grafico g) {
		System.out.println("Grafico g adicionado");
		lista.add(g);
		
	}

	public void remover(int i) {
		System.out.println("Grafico id "+i+ " apagado!");
		lista.remove(i);
	}

}
