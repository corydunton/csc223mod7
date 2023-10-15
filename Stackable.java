package edu.vwcc.stack;

public interface Stackable<E> {
	
	/*
	 * Adds element to the top of the stack
	 */
	void push(E element);
	
	/*
	 * Removes top element from the stack
	 */
	void pop();
	
	/*
	 * Returns view of the stack's top element without removing it from stack
	 */
	E peek();
	
	/*
	 * Returns true if this stack is empty, otherwise returns false
	 */
	boolean isEmpty();

}
