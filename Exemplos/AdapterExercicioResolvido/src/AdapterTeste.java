import java.util.ArrayList;
import java.util.List;


public class AdapterTeste {

	public static void main(String[] args) {
		List<Integer> listaInteger = new ArrayList<Integer>();
		listaInteger.add(10);
		listaInteger.add(20);

		int[] listaVetor = {1,2,3,4,5,6,7,7,8,10};  
		
		
		Adaptador demo = new Adaptador();
		System.out.println(demo.soma(listaInteger));

		System.out.println(demo.soma(listaVetor));
	}

}
