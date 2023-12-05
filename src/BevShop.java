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

public class BevShop implements BevShopInterface{
	private ArrayList<Order> orders;
	private Order currentOrder;
	private final int maxAlcohol = 3;
	private final int minAge = 21;
	
	public BevShop() {
		orders = new ArrayList<Order>();
	}
	public boolean isValidTime(int time) {
		return (MIN_TIME <= time) && (MAX_TIME >= time);
	}

	public boolean isEligibleForMore() {
		return getNumOfAlcoholDrink() < maxAlcohol;
	}
	public boolean isValidAge(int age) {
		return age > MIN_AGE_FOR_ALCOHOL;
	}
	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		currentOrder = new Order(time, day, new  Customer(customerName, customerAge));
		orders.add(currentOrder);	
	}
	@Override
	public void processCoffeeOrder(String name, Size size, boolean extraShot, boolean extraSyrup) {
		this.currentOrder.addNewBeverage(name, size, extraShot, extraSyrup);
	}
	@Override
	public void processAlcoholOrder(String name, Size size) {
		this.currentOrder.addNewBeverage(name, size);		
	}
	@Override
	public void processSmoothieOrder(String name, Size size, int numOfFruits, boolean addProtien) {
		this.currentOrder.addNewBeverage(name, size, numOfFruits, addProtien);
	}
	@Override
	public int findOrder(int order) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getOrderNo() == order) {
				return i; 
			}
		}
		return -1;
	}
	@Override
	public double totalOrderPrice(int order) {
		return orders.get(findOrder(order)).calcOrderTotal();
	}
	@Override
	public double totalMonthlySale() {
		double sum = 0;
		for(int i = 0; i < orders.size(); i++) {
			sum+=orders.get(i).calcOrderTotal();
		}
		return sum;
	}
	public void sortOrders() {
		for (int i = 0; i < orders.size() - 1; i++) {
			int minOrder = i;
			for (int j = i+1; j < orders.size(); j++) {
				if (orders.get(j).getOrderNo() < orders.get(minOrder).getOrderNo()) {
					minOrder = j;
				}
			}
			Order temp = orders.get(minOrder);
			orders.set(minOrder, orders.get(i));
			orders.set(i, temp);
		}
	}
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	public String toString() {
		String msg = "Beverage shop\nmonthly sales:" + totalMonthlySale()  +"\n";
		for(int i = 0; i < orders.size(); i++) {
			msg += "Order " + i + ":";
			msg += orders.get(i).toString();
		}
		return msg;
	}
	public Order getCurrentOrder() {
		return this.currentOrder;
	}
	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}
	public int getNumOfAlcoholDrink() {
		return currentOrder.findNumOfBeveType(Type.ALCOHOL);
	}
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	public boolean isMaxFruit(int i) {
		return i>MAX_FRUIT;
	}
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
	}
	public int getMaxOrderForAlcohol() {
		return minAge;
	}
	public int getMinAgeForAlcohol() {
		return maxAlcohol;
	}
}
