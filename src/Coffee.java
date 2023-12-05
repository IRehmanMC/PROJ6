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
public class Coffee extends Beverage{
	private boolean extraShot; 
	private boolean extraSyrup; 
	private String name; 
	private Size size;
	private Type type = Type.COFFEE;

	public Coffee(String name, Size size, boolean extra_shot, boolean extra_syrup) {
		super(name, Type.COFFEE, size);
		this.extraShot = extra_shot;
		this.extraSyrup = extra_syrup; 
		this.name = name;
		this.size = size; 

	}
	
	
	public double getBasePrice() {
		return super.BASE_PRICE;
	}
	
	public String toString() {
		if(extraShot) {
			return "\nName: " + this.name + " Size: " + this.size + "\nContains Extra shot\nPrice: " + this.calcPrice() + "\n\\n";
		}if(extraSyrup) {
			return "\nName: " + this.name + " Size: " + this.size + "\nExtra syrup\nPrice: " + this.calcPrice() + "\n\\n";
		}else {
			return "\nName: " + this.name + " Size: " + this.size + "\nPrice: " + this.calcPrice() + "\n\n";
		}
	}
	public double calcPrice(){
		double price = super.addSizePrice();
		int count = 0; 
		if(extraSyrup) {
			count++; 
		}if(extraShot) {
			count++;
		}
		return price+((0.50)*count);
	}
	public String getBevName() {
		return this.name;
	}

	public Size getSize() {

		return this.size;
	}

	public Type getType() {

		return this.type;
	}


	public boolean getExtraShot() {


		return extraShot;
	}


	public boolean getExtraSyrup() {

		return extraSyrup;
	}



	

}
