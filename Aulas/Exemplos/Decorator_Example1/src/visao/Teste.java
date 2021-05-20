package visao;

import modelo.Acucar;
import modelo.Cachaca;
import modelo.Coquetel;
import modelo.Gelo;
import modelo.Limao;
import modelo.Refrigerante;
import modelo.Suco;

public class Teste {

	public static void main(String[] args) {
		
        Coquetel meuCoquetel = new Cachaca();
        System.out.println(meuCoquetel.getNome() + " = "
                + meuCoquetel.getPreco());
 
        meuCoquetel = new Refrigerante(meuCoquetel);
        System.out.println(meuCoquetel.getNome() + " = "
                + meuCoquetel.getPreco());
        
        meuCoquetel = new Gelo(meuCoquetel);
        System.out.println(meuCoquetel.getNome() + " = "
                + meuCoquetel.getPreco());
        
        //cachaca, limao, gelo e acucar
        Coquetel caipirinha = new Cachaca();
        caipirinha = new Limao(caipirinha);
        caipirinha = new Acucar(caipirinha);
        caipirinha = new Acucar(caipirinha);
        caipirinha = new Gelo(caipirinha);
        
        System.out.println(caipirinha.getNome()+" = R$ "+caipirinha.getPreco());
        
        
    }

}
