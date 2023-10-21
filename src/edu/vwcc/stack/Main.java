/**
 * This program simulates a Kindergarten classroom roster system to ensure absolute fairness when 
 * doing roll call or forming lines. Fairness is defined by the Last In, First Out rule.
 * Utilize the custom Stack class to achieve this behavior.
 * 
 * Author: Cory Dunton
 * Date: 10/13/2023
 * 
 * 1. Implement all Stack class methods required by the Stackable interface.
 * Tip: Hover over the class name and click 'Add unimplemented methods...'
 *    
 * 2. Exception Handling:
 *    - Throw a StackEmptyException when trying to pop or peek from an empty stack.
 *    - Throw a StackOverflowException if more than 26 elements (representing the 26 students) are pushed onto the stack.
 *    
 * 3. Complete the "Reverse roster" task in the Roster class. 
 * 
 * 4. Pass all the JUnit5 unit tests in StackTest.java
 */

package edu.vwcc.stack;

public class Main {

	public static void main(String[] args) {
		Roster roster = new Roster();
		roster.load();
		roster.reverse();
	}
}

class Roster {

	final static String[] STUDENTS = { "Aisha", "Benjamin", "Chen", "Dalia", "Edward", "Fatima", "George", "Hiroshi",
			"Imran", "Jasmine", "Khalid", "Ling", "Mohammed", "Nadia", "Oscar", "Priya", "Qasim", "Rahul", "Sammy",
			"Tara", "Umar", "Vijay", "Wei", "Xiu", "Yara", "Zainab" };

	// TODO Create a new Stack
	Stack<String> stack = new Stack<>();

	public void load() {
		for (String student : STUDENTS) {
			stack.push(student);
		}
	}

	public void reverse() {
		while (!stack.isEmpty()) {
			String student = stack.pop();
			System.out.println(student);
		}
	}
}
