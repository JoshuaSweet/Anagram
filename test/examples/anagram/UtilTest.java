package examples.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilTest {

	@Test
	void test_sameLettersSameLength() {

		boolean actual = Util.isAnagram( "aassdd", "asdasd");
		assertTrue( actual );
		
	}
	
	@Test
	void test_sameLettersButDifferentLength() {

		boolean actual = Util.isAnagram( "asd", "asdasd");
		assertFalse( actual );
		
	}
	
	@Test
	void test_empty() {

		boolean actual = Util.isAnagram( "", "");
		assertFalse( actual );
		
	}
	
	@Test
	void test_null() {

		boolean actual = Util.isAnagram( null, null);
		assertFalse( actual );
		
	}

}
