package model;

import java.util.ArrayList;
import java.util.List;

public class NomeCitacaoDireta extends Nome{
	
	private String expressao_direta;

	public NomeCitacaoDireta(String expressao) {
		this.expressao_direta = expressao;
		List<String> nomes = identificarPartes();
		setPrimeiroNome(nomes.get(0));
		setSobrenome(nomes.get(1));
	}

	public List<String> identificarPartes(){
		List<String> saida = new ArrayList<String>();
		int primeiroEspaco = this.expressao_direta.indexOf(' ');
		int ultimoEspaco = this.expressao_direta.lastIndexOf(' ');
		
		String firstName= this.expressao_direta.substring(0, primeiroEspaco);
		String lastName = this.expressao_direta.substring(ultimoEspaco+1);
		
		saida.add(firstName);
		saida.add(lastName);
		return saida;	
	}
	

}
