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

public class BevShopDriverApp {
	public static void main(String[] args) {
		final Day today = Day.SATURDAY;
		final int time = 5;
		BevShop bev = new BevShop();
		Customer cus = new Customer("Furqan", 49);
		
	
		bev.startNewOrder(time, today, cus.getName(), cus.getAge());
		System.out.println("The current order in process can have at most 3 alcoholic beverages.\nThe minimum age to order alcohol drink is 21\nStart please a new order:\nYour Total Order for now is 0.0\nWould you please enter your name Furqan\nWould you please enter your age 49\nYour age is above 20 and you are eligible to order alcohol\nWould you please add an alcohol drink\n ");
		System.out.println("#------------------------------------#\n" + bev.getCurrentOrder().toString() + "\n#------------------------------------#");
		System.out.println("The current order of drinks is 1");
		bev.processAlcoholOrder("drink1", Size.SMALL);
		
		System.out.println("The current order of drinks is 2");
		bev.processAlcoholOrder("drink2", Size.LARGE);
		
		System.out.println("The current order of drinks is 3");
		bev.processAlcoholOrder("drink3", Size.SMALL);
		
		System.out.println("You have a maximum alcohol drinks for this order");
		System.out.printf("\nThe Total Price on the Order$%.2f\n", bev.totalOrderPrice(bev.getCurrentOrder().getOrderNo()));
		System.out.println("#------------------------------------#\nWould you please add a COFFEE to your order: ");
		bev.processCoffeeOrder("Latte", Size.MEDIUM, true, false);
		System.out.printf("\nThe Total Price on the Order$%.2f\n", bev.totalOrderPrice(bev.getCurrentOrder().getOrderNo()));
		System.out.println("#------------------------------------#\nWould you please add a SMOOTHIE to your order: ");
		bev.processSmoothieOrder("Watermelon", Size.LARGE, 3, true);
		System.out.printf("\nThe Total Price on the Order$%.2f\n", bev.totalOrderPrice(bev.getCurrentOrder().getOrderNo()));
		System.out.println("#------------------------------------#");
		System.out.println(bev.getCurrentOrder().toString());
		System.out.printf("\nTotal : $%.2f", bev.getCurrentOrder().calcOrderTotal());
	}

}