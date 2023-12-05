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
public class Alcohol extends Beverage{
	private boolean offered;
	private final double fee = 0.6;
	
	public Alcohol(String name, Size size, boolean served) {
		super(name, Type.ALCOHOL, size);
		setServedOnWeekends(served);
	}
	
	public double calcPrice() {
		double price = 0;

		price += (offered) ? fee : 0;
		price +=  BASE_PRICE + ((Size.SMALL == getSize()) ? 0 : (Size.MEDIUM == getSize()) ? SIZE_UP_PRICE: this.SIZE_UP_PRICE*2); 
		
		return price;
	}
	
	public boolean equals(Alcohol alcohol) {
		return (this.getSize() == alcohol.getSize()) && (this.getBevName() == alcohol.getBevName()) && (this.getBevType() == alcohol.getBevType()) && (this.isWeekend() == alcohol.isWeekend());
	}
	
	public String toString() {
		return "\nAlcohol Name: " + getBevName() + "\nSize: " + getSize() + "\nPrice: " + this.calcPrice() + "\n";
	}
	public boolean isWeekend() {
		return offered;
	}

	public void setServedOnWeekends(boolean servedOnWeekends) {
		this.offered = servedOnWeekends;
	}

	public double getBasePrice() {
		return super.BASE_PRICE;
	}
}
