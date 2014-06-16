package kata.gosoft;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void One_Should_Return_One() {
		String output = FizzBuzz.getOutput(1);
		assertEquals("1", output);
	}
	
	@Test
	public void Two_Should_Return_Two() {
		String output = FizzBuzz.getOutput(2);
		assertEquals("2", output);
	}

	@Test
	public void Three_Should_Return_Fizz() {
		String output = FizzBuzz.getOutput(3);
		assertEquals("Fizz", output);
	}
	
	@Test
	public void Five_Should_Return_Buzz() {
		String output = FizzBuzz.getOutput(5);
		assertEquals("Buzz", output);
	}
	
	@Test
	public void Six_Should_Return_Fizz() {
		String output = FizzBuzz.getOutput(6);
		assertEquals("Fizz", output);
	}
	
	@Test
	public void Ten_Should_Return_Buzz() {
		String output = FizzBuzz.getOutput(10);
		assertEquals("Buzz", output);
	}
	
	@Test
	public void Fifteen_Should_Return_FizzBuzz(){
		String output = FizzBuzz.getOutput(15);
		assertEquals("FizzBuzz", output);
	}
	
	
	
}
