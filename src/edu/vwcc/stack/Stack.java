package edu.vwcc.stack;

import java.util.ArrayList;

public class Stack<E> implements Stackable<E> {

	private ArrayList<E> elements = new ArrayList<>();

	@Override
	public void push(E element) {
		if (elements.size() >= 26)
			{ throw new StackOverflowException(); }
		elements.add(element);
	}

	@Override
	public E pop() {
		if (isEmpty())
			{ throw new StackEmptyException(); }
		return elements.remove(elements.size() - 1);
	}

	@Override
	public E peek() {
		if (isEmpty())
			{ throw new StackEmptyException(); }
		return elements.get(elements.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return elements.isEmpty();
	}

}
