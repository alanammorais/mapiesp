package modelo;

public class CoquetelDecorator extends Coquetel {
    Coquetel coquetel;
 
    public CoquetelDecorator(Coquetel umCoquetel) {
        coquetel = umCoquetel;
    }
 
    public String getNome() {
        return coquetel.getNome()  + " + " + super.getNome();
    }
 
    public double getPreco() {
        return coquetel.getPreco() + super.getPreco();
    }
}