package fmi.informatics.year.two.testers;

import fmi.informatics.year.two.eggs.Egg;

public class EggTest {
	public static void main(String args[]) {

		Egg egg1 = new Egg();
		egg1.washEgg();
		egg1.submergeEgg();
		egg1.checkCookingUtensil(2);
		egg1.checkStateEgg(1);
	}
}
