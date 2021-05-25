package model;

public class Sprite extends SpriteFlyweight {
    protected Imagem imagem;
    //X e y
    //Ponto
 
    public Sprite(String nomeDaImagem) {
        imagem = new Imagem(nomeDaImagem);
    }
 
    public void desenharImagem(Ponto ponto) {
        imagem.desenharImagem();
        System.out.println("No ponto (" + ponto.getX() + "," + ponto.getY() + ")!");
    }
}