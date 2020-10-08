package simple;

import interfaces.AbstractRoom;

public class SimpleRoom implements AbstractRoom {
	public void Room() {
		
	}
	
	@Override
	public void create() {
		System.out.println("Você criou uma sala de poder simples!");
	}
}
