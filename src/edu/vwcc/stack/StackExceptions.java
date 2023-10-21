package edu.vwcc.stack;

/**
 * Custom exception to indicate that the stack is empty.
 */
class StackEmptyException extends RuntimeException {
	public StackEmptyException() {
		super("Stack is empty.");
	}

}

/**
 * Custom exception to indicate that the stack has overflowed its capacity.
 */
class StackOverflowException extends RuntimeException {
	public StackOverflowException() {
		super("Stack overflow. Maximum capacity reached.");
	}
}
