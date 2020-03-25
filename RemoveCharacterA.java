package com.tdd;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/* TODO list for Removing 'A' if it is present in first 2 characters of string 
 * 1.'A' present in first character of string  :   ABCD => BCD
 * 2.Two A's  are present in first 2 characters  :   AABD => BD
 * 3.'A' present at the second character of the string  :   BACD => BCD
 * 4.No A present in the first two characters of the string  :  BBAA => BBAA
 * 5.String of length n characters :  AABBA =>BBA
 */


public class RemoveCharacterA { {

	RemoveACharacters removeAChar;

	@BeforeEach
	void setUp() {
		removeAChar = new RemoveACharacters();

	}

	@Test
	void testAtFirstIndex() {
		assertEquals("BCD",removeAChar.remove("ABCD"));
	}


	@Test
	void testAtTwoIndexes() {
		assertEquals("CD",removeAChar.remove("AACD"));
	}

	@Test
	void testAtSecondIndex() {
		assertEquals("BCD",removeAChar.remove("BACD"));
	}

	@Test
	void testForNoA() {
		assertEquals("BBAA",removeAChar.remove("BBAA"));
	}

	@Test
	void testForNChars() {
		assertEquals("BBA",removeAChar.remove("AABBA"));
	}


}


}
