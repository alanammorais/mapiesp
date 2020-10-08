package enchanted;

import interfaces.AbstractRoom;

public class EnchantedRoom implements AbstractRoom {
	public EnchantedRoom() {
		
	}
	
	@Override
	public void create() {
		System.out.println("Você criou uma porta mágica!");
	}
}
