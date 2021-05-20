package visao;
import java.util.ArrayList;

import model.Grafico;
import model.GraficoComposto;
import model.Linha;
import model.Retangulo;
import model.Texto;

public class ProgramaDesenho {

	
	public static Grafico desenhoSimples(){
		Grafico l = new Linha();
		l.desenhar();
		
		Grafico r = new Retangulo();
		r.desenhar();
		
		Grafico t = new Texto();
		t.desenhar();
		
		return t;
		
	}
	
	
	public static GraficoComposto desenhoComplexo(){
		GraficoComposto g = new GraficoComposto();
		
		Texto t2 = new Texto();
		Retangulo r2 = new Retangulo();
		Retangulo r3 = new Retangulo();
		
		g.adicionarF(t2);
		g.adicionarF(r2);
		g.adicionarF(r3);
		
		g.desenhar(); //mesma forma de desenhar
		
		return g;
	}
	
	
	public static void main(String[] args) {
		//ArrayList<Grafico> listaElementos = new ArrayList<Grafico>();
		
		desenhoComplexo();
		
		System.out.println("\nDesenho simples:");
		desenhoSimples();

	}

}
