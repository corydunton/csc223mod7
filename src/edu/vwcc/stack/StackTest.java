package edu.vwcc.stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StackTest {
	private Stack<String> stack;

	@BeforeEach
	void setUp() {
		stack = new Stack<>();
	}

	@Test
	void testPush() {
		stack.push("Alice");
		assertEquals("Alice", stack.peek());
	}

	@Test
	void testPopOnEmptyStack() {
		assertThrows(StackEmptyException.class, () -> stack.pop());
	}

	@Test
	void testPop() {
		stack.push("Bob");
		stack.push("Charlie");
		stack.pop();
		assertEquals("Bob", stack.peek());
	}

	@Test
	void testPeekOnEmptyStack() {
		assertThrows(StackEmptyException.class, () -> stack.peek());
	}

	@Test
	void testPeek() {
		stack.push("Charlie");
		assertEquals("Charlie", stack.peek());
		// Ensure peek doesn't remove the element
		assertFalse(stack.isEmpty());
	}

	@Test
	void testIsEmptyInitially() {
		assertTrue(stack.isEmpty());
	}

	@Test
	void testIsNotEmptyAfterPush() {
		stack.push("Dave");
		assertFalse(stack.isEmpty());
	}

	@Test
	void testPushBeyondCapacity() {
		for (int i = 0; i < 26; i++) {
			stack.push("Student" + i);
		}

		assertThrows(StackOverflowException.class, () -> stack.push("Student27"));
	}

	@Test
	void testMultipleOperations() {
		assertTrue(stack.isEmpty());
		stack.push("Eve");
		stack.push("Frank");
		assertEquals("Frank", stack.peek());
		stack.pop();
		assertEquals("Eve", stack.peek());
	}

	@Test
	void testPopUntilEmpty() {
		stack.push("Grace");
		stack.push("Hannah");
		stack.pop();
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	void testReverseMethod() {

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outputStream));

		Roster roster = new Roster();
		roster.load();
		roster.reverse();

		String expectedOutput = "Zainab\nYara\nXiu\nWei\nVijay\nUmar\nTara\nSammy\nRahul\nQasim\nPriya\nOscar\nNadia\nMohammed\nLing\nKhalid\nJasmine\nImran\nHiroshi\nGeorge\nFatima\nEdward\nDalia\nChen\nBenjamin\nAisha\n";
		System.setOut(originalOut);
		String actualOutput = outputStream.toString();
		assertEquals(expectedOutput.replaceAll("\r\n", "\n"), actualOutput.toString().replaceAll("\r\n", "\n"));

	}

}
