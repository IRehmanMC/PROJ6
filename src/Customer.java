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
public class Customer {
	private String name;
	private int age;
	
	
	public Customer(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	
	public Customer(Customer person) {
		setAge(person.getAge());
		setName(person.getName());
	}

	

	public void setName(String name) {
		this.name = name; 

	}

	public void setAge(int age) {
		this.age = age;

	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}
