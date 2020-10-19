package builder_exa.visao;

import builder_exa.model.CarroProduto;
import builder_exa.model.ConcessionariaDirector;
import builder_exa.model.FiatBuilder;
import builder_exa.model.HondaBuilder;

public class Teste {

	public static void main(String[] args) {
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
	    concessionaria.construirCarro();
	    
	    CarroProduto carro = concessionaria.getCarro();
	    
	    System.out.println("Carro: " + carro.getModelo() + "/" + carro.getMontadora()
	            + "\nAno: " + carro.getAnoDeFabricacao() + "\nMotor: "
	            + carro.getDscMotor() + "\nValor: " + carro.getPreco());
	 
	 
	    //Testando outro construtor
	    concessionaria = new ConcessionariaDirector(new HondaBuilder());
	    concessionaria.construirCarro();
	    carro = concessionaria.getCarro();
	    System.out.println("Carro: " + carro.getModelo() + "/" + carro.getMontadora()
	    		+ "\nAno: " + carro.getAnoDeFabricacao() + "\nMotor: "
	    		+ carro.getDscMotor() + "\nValor: " + carro.getPreco());
	}

}
