package singleton_exemplo.model;


public class SingletonObject {

	private int estoque = 10;
	
	//Objeto da própria classe como atributo
	private static SingletonObject instance;

	//Construtor privativo
	private SingletonObject(){
		System.out.println("Construtor da Classe SingletonObject"); 
	}

	//Implementar metodo getInstance estático
	public static SingletonObject getInstance(){
		if (instance == null) 
			instance = new SingletonObject();
		
 		return instance;
	}

	public void showMessage(){
		System.out.println("Hello World!");
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}



}
