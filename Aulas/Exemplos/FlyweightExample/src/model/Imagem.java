package model;
public class Imagem {
    private String nomeDaImagem;
 
    public Imagem(String imagem) {
        nomeDaImagem = imagem;
    }
 
    public void desenharImagem() {
        System.out.println(nomeDaImagem + " desenhada!");
    }

	public String getNomeDaImagem() {
		return nomeDaImagem;
	}

	public void setNomeDaImagem(String nomeDaImagem) {
		this.nomeDaImagem = nomeDaImagem;
	}
    
    
}