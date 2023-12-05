/*
 * Class: CMSC203 
 * Instructor: Dr. Kuijt
 * Due: 12/4/2023
 * Platform/compiler:
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Ilyas Rehman
*/
public class Smoothie extends Beverage{
	private int fruits; 
	private boolean protein;
	public static final Type type = Type.SMOOTHIE;
	public Smoothie(String name, Size size, int numFruits, boolean protein) {
		super(name,type,size);
		this.protein = protein;
		this.fruits=numFruits;

	}
	public String toString() {
		String coffee  = super.toString();
		coffee+="\nFruit count: "+ this.fruits + "\nProtein:" + this.protein + "\nPrice: "+ this.calcPrice();
		return coffee;
	}
	public boolean equals(Smoothie beverage) {
		boolean equals  = false; 
		if(super.equals(beverage)) {
			if((this.fruits == beverage.getNumOfFruits()) && this.protein == beverage.protein) {
				equals = true;
			}
		}
		else
		{
			equals = false;
		}
		return equals;
	}
	public double getBasePrice() {
		return super.BASE_PRICE;
	}

	public double calcPrice() {
		double price = super.addSizePrice();
		if(protein) {
			price = price + 1.50;
		}
		price+=(0.50)*(fruits);
		return price;
	}

	public String getBevName() {
		return this.getBevName();
	}

	public Size getSize() {
		return this.size;
	}

	public int getNumOfFruits() {
		return this.fruits;
	}
	public boolean getAddProtien() {

		return protein;
	}

}