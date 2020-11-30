import java.util.ArrayList;
import java.util.List;

public class Adaptador extends SomadorExistente implements SomadorEsperado{

	public int soma(int[] vetor) {
		int soma = 0;
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int valor : vetor)
			lista.add(valor);
		
		soma = super.soma(lista);
		return soma;
	}
}
