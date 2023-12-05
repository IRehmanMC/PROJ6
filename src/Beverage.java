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
abstract class Beverage{
	public String name; 
	public Type type;
	public Size size; 
	
	public final double BASE_PRICE = 2.0; 
	public final double SIZE_UP_PRICE = 1.0; 

	public Beverage(String name, Type type,Size size){
		this.name = name;
		this.type = type; 
		this.size = size;
	}
	
	public abstract double calcPrice();
	public Type getBevType() {
		return this.type;
	}
	public String toString() {
		return this.name + " " + this.size;
	}
	public boolean equals(Beverage beverage) {
		return (beverage.name.equals(this.name) && beverage.type.equals(this.type) && beverage.size.equals(this.size));
	}
	public String getBevName() {
		return this.name;
	}
	public Type getType() {
		return this.type; 
	}
	public Size getSize() {
		return this.size;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public double addSizePrice() {
		if(this.size.equals(Size.SMALL)) {
			return BASE_PRICE;
		}
		if(this.size.equals(Size.MEDIUM)) {
			return BASE_PRICE + SIZE_UP_PRICE;	
		}
		else {
			return BASE_PRICE + (SIZE_UP_PRICE*2);
		}
	}
}
