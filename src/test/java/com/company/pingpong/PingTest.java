package com.company.pingpong;

import static org.junit.Assert.*;

import org.junit.Test;


public class PingTest {

	@Test
	public void testNumber1() {
		assertEquals(1, RomanConverter.Convert("I"));
	}
	
	@Test
	public void testNumber2(){
		assertEquals(2,RomanConverter.Convert("II"));
	}
	
	@Test
	public void testNumber5(){
		assertEquals(5,RomanConverter.Convert("V"));
	}
	
	@Test
	public void testTwoDifferentNumbers(){
		assertEquals(6,RomanConverter.Convert("VI"));
	}
	
	@Test
	public void testTwoDifferentNumbersLowerCase(){
		assertEquals(6,RomanConverter.Convert("vi"));
	}
	
	@Test
	public void testNumberTen()
	{
		assertEquals(10,RomanConverter.Convert("X"));
	}
	
	@Test
	public void testNumberFifty() {
		assertEquals(50, RomanConverter.Convert("L"));		
	}
	
	@Test
	public void testNumberOneHundred()
	{
		assertEquals(100,RomanConverter.Convert("C"));
	}
	
	@Test
	public void testNumberFiveHundred()
	{
		assertEquals(500,RomanConverter.Convert("D"));
	}
	
	@Test
	public void testNumberOneThousand()
	{
		assertEquals(1000,RomanConverter.Convert("M"));
	}
	
	@Test (expected = RuntimeException.class)
	public void testE()
	{
		RomanConverter.Convert("E");
	}
	
	@Test (expected = RuntimeException.class)
	public void testNull()
	{
		RomanConverter.Convert(null);
	}
	
	@Test (expected = RuntimeException.class)
	public void testEmpty()
	{
		RomanConverter.Convert("");
	}
	
	@Test
	public void testFour()
	{
		assertEquals(4,RomanConverter.Convert("IV"));
	}
	
	@Test
	public void testNine()
	{
		assertEquals(9,RomanConverter.Convert("IX"));
	}
	
	@Test
	public void testFourty()
	{
		assertEquals(40,RomanConverter.Convert("XL"));
	}
	
	@Test
	public void testNinety()
	{
		assertEquals(90,RomanConverter.Convert("XC"));
	}
	
	@Test
	public void testFourHundred()
	{
		assertEquals(400,RomanConverter.Convert("CD"));
	}
	
	@Test
	public void testNineHundred()
	{
		assertEquals(900,RomanConverter.Convert("CM"));
	}
	
	@Test (expected = RuntimeException.class)
	public void testRepetition()
	{
		RomanConverter.Convert("VVVV");
	}
}