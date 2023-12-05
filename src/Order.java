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
import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order>{
	private ArrayList<Beverage> beverage;
	private Customer customer; 
	private Day day;
	private int orderNum; 
	private double time;
	
	public Order(int time, Day day, Customer customer) {
		this.orderNum = random();
		this.day = day; 
		this.customer = new Customer(customer);
		this.setOrderTime(time);
		beverage = new ArrayList<Beverage>();
	}
	private void setOrderTime(int time2) {
		this.time=time2;
		
	}
	public int compareTo(Order order) {
		if(order.getOrderNo() == this.getOrderNo()) {
			return 0;
		}
		else if(order.getOrderNo() < this.getOrderNo()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public int random() {
		int rand = 10000 + (int)(Math.random() * ((90000 - 10000) + 1));
		return rand;
	}
	
	public String toString() {
		String total = "ORDER NUMBER: " + getOrderNo() + "\nCUSTOMER NAME: " + this.getCustomer().getName() + "\nORDER TOTAL:" + this.calcOrderTotal();
		for(int i = 0; i < beverage.size();i++) {
			total += this.getBeverage(i).toString();
		}
		return total;
	}

	public int getTotalItems() {
		return beverage.size();
	}

	public boolean isWeekend() {
		if(day==Day.SUNDAY||day==Day.SATURDAY) {
			return true;
		}
		else
		{		
			return false;
		}
	}

	public Customer getCustomer() {

		return new Customer(customer);
	}

	public double calcOrderTotal() {
		double total = 0.0;
		for(int i = 0; i < beverage.size();i++) {
			total = total + beverage.get(i).calcPrice();
			
		}
		return total;
	}

	public void Customer(Customer customer) {
		this.customer = new Customer(customer);
	}
	public void setListOfBeverages(ArrayList<Beverage> bev) {
		this.beverage = bev;
	}
	public int getOrderNo() {

		return this.orderNum;
	}

	public Beverage getBeverage(int i) {

		return beverage.get(i);
	}
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Coffee cof = new Coffee(bevName, size, extraShot, extraSyrup);
		beverage.add(cof);
	}

	public void addNewBeverage(String bevName, Size size) {
		Alcohol alc = new Alcohol(bevName, size, this.isWeekend());
		beverage.add(alc);
	}

	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addPRotien) {
		Smoothie smo = new Smoothie(bevName, size, numOfFruits, addPRotien);
		beverage.add(smo);
	}
	public int findNumOfBeveType(Type type) {
		int bevtype  = 0; 
		for(int i = 0; i < beverage.size();i++) {
			if(beverage.get(i).getType()==type) {
				bevtype++;
			}
		}
		return bevtype; 
	}
	public double getOrderTime() {
		return this.time;
	}
	public Day getOrderDay() {
		return day;
	}
}
