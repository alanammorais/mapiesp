package modelo;

public class Limao extends CoquetelDecorator{
	
	public Limao(Coquetel umCoquetel) {
		super(umCoquetel);
        super.setNome("Limão");
        super.setPreco(1.50);
	}

}
