package modelo;

public class Suco extends CoquetelDecorator {

	public Suco(Coquetel umCoquetel) {
		super(umCoquetel);
        super.setNome("Suco");
        super.setPreco(4);
	}

}
