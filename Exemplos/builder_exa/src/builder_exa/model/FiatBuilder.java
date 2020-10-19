package builder_exa.model;

public class FiatBuilder extends CarroBuilder{

    public void buildPreco() {
        // Operacao complexa. 
        carro.setPreco(30000.00);
    }
 
    public void buildDscMotor() {
        // Operacao complexa.
        carro.setDscMotor("Fire Flex 1.0");
    }
 
    public void buildAnoDeFabricacao() {
        // Operacao complexa.
        carro.setAnoDeFabricacao(2016);
    }
 
    public void buildModelo() {
        // Operacao complexa.
        carro.setModelo("Palio");
    }
 
    public void buildMontadora() {
        // Operacao complexa.
        carro.setMontadora("Fiat");
    }
}
