package enchanted;

import interfaces.AbstractDoor;

public class EnchantedDoor implements AbstractDoor {
	public EnchantedDoor() {

	}
	@Override
	public void create() {
		System.out.println("You criou uma porta mágica!");
		
	}
}
