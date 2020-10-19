package singleton_exemplo.visao;

import singleton_exemplo.model.SingletonObject;

public class SingletonPatternDemo {
	
	
	public static void main(String[] args) {

	      SingletonObject object = SingletonObject.getInstance(); //new
	      SingletonObject object2 = SingletonObject.getInstance();
	      SingletonObject object3 = SingletonObject.getInstance();
	      
	      //show the message
	      //object.showMessage();
	      System.out.println(object.getEstoque());
	      
	      //object2.showMessage();
	      object2.setEstoque(5);
	      System.out.println(object2.getEstoque());
	      
	      System.out.println(object.getEstoque());
	      System.out.println(object3.getEstoque());
	      
	      
	      System.out.println(object);
	      System.out.println(object2);
	      System.out.println(object3);
	   }
}

