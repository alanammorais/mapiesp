package modelo;

public class Acucar extends CoquetelDecorator{
	
	public Acucar(Coquetel umCoquetel) {
		super(umCoquetel);
        super.setNome("Açúcar");
        super.setPreco(2);
	}
}
