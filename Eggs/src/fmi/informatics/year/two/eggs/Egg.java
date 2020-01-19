package fmi.informatics.year.two.eggs;

public class Egg {
	
	int state = 0;
	String eggState[] = {"Undercooked", "Runny", "Soft-Boiled", "Hard-Boiled", "Overcooked"};
	String cookingUtensil[] = {"Cezve", "Cook-pot", "Stockpot"};
	
	
	public void checkStateEgg(int minutes) {
		System.out.printf("The egg has been cooking for %d minutes\n", minutes);
		if(minutes < 1) {
			state = 0;
		}else if(minutes < 3) {
			state = 1;
		}else if(minutes < 5) {
			state = 2;
		}else if(minutes < 10) {
			state = 3;
		}else if(minutes >= 10) {
			state = 4;
		}
		System.out.print("The egg is " + eggState[state]);
	}
	
	public void checkCookingUtensil(int utensil) {
		System.out.printf("You have chosen to use a %s\n", cookingUtensil[utensil]);
		if(utensil == 0) {
			waterBoiling("one and a half");
		}else if(utensil == 1) {
			waterBoiling("two");
		}else if(utensil == 2) {
			waterBoiling("three");
		}
	}
	
	public void washEgg() {
		System.out.println("The egg has been washed!");
	}
	
	public void submergeEgg() {
		System.out.println("The egg has been submerged in water.");
	}
	
	public void waterBoiling(String waterTimer) {
		System.out.printf("The water has boiled after %s minutes\n", waterTimer);
	}
}
