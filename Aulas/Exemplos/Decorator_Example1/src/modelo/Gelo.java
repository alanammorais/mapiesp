package modelo;

public class Gelo extends CoquetelDecorator{
	
	public Gelo(Coquetel umCoquetel) {
		super(umCoquetel);
        super.setNome("Gelo");
        super.setPreco(0.5);
	}
}
