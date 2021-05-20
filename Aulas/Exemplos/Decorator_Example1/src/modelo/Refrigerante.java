package modelo;

public class Refrigerante extends CoquetelDecorator {

    public Refrigerante(Coquetel umCoquetel) {
        super(umCoquetel);
        super.setNome("Refrigerante");
        super.setPreco(3);
    }
 
}