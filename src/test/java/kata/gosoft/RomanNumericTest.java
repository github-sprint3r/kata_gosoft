package kata.gosoft;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumericTest {

	@Test
	public void test_put_one_should_return_I() {
		assertEquals("I", RomanNumeric.convert(1));
	}

	@Test
	public void test_put_two_should_return_II() {
		assertEquals("II", RomanNumeric.convert(2));
	}

	@Test
	public void test_put_four_should_return_IV() {
		assertEquals("IV", RomanNumeric.convert(4));
	}

	@Test
	public void test_put_five_should_return_V() {
		assertEquals("V", RomanNumeric.convert(5));
	}
	
	@Test
	public void test_put_six_should_return_VI() {
		assertEquals("VI", RomanNumeric.convert(6));
	}
	
	@Test
	public void test_put_ten_should_return_X() {
		assertEquals("X", RomanNumeric.convert(10));
	}
	

}
