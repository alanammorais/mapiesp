package model;

import java.util.ArrayList;
import java.util.List;

public class NomeCitacaoIndireta extends Nome{
	
	private String expressao;

	public NomeCitacaoIndireta(String expressao) {
		this.expressao = expressao;
		List<String> nomes = identificarPartes();
		setPrimeiroNome(nomes.get(0));
		setSobrenome(nomes.get(1));
	}

	public List<String> identificarPartes(){
		List<String> saida = new ArrayList<String>();
		int posVirgula = this.expressao.indexOf(',');
		String lastName = this.expressao.substring(0, posVirgula);
		String firstName = this.expressao.substring(posVirgula+2);
		
		saida.add(firstName);
		saida.add(lastName);
		return saida;	
	}

}
