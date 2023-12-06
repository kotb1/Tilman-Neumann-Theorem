package de.tilman_neumann.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class StringUtilTest {

	@Test
	void testRepeat() {
		//AAA
		//arrange
		String x = "Kotb ";
		int m = 4;
		//act
		String y = StringUtil.repeat(x, m);
		String h = "Kotb Kotb Kotb Kotb ";
		//assert
		assertEquals(h,y);
	}
	@Test
	void testRepeat_2() {
		//AAA
		//arrange
		String x = "Kotb ";
		int m = 0;
		//act
		String y = StringUtil.repeat(x, m);
		//assert
		assertNull(y);
	}
	@Test
	void testRepeat_3() 
	{
		//AAA
		//araange
		String x = "";
		int m = 5;
		//act
		String y = StringUtil.repeat(x, m);
		String t = "";
		//assert
		assertEquals(t,y);
	}
	@Test
	void testRepeat_4() 
	{
		//AAA
		//araange
		String x = "Kotb ";
		int m = -5;
		//act
		String y = StringUtil.repeat(x, m);
		//assert
		assertNull(y);
	}
	@Test
	void testRepeat_5() 
	{
		//AAA
		//araange
		String x = "";
		int m = 0;
		//act
		String y = StringUtil.repeat(x, m);
		//assert
		assertNull(y);
	}
	@Test
	void testFormatLeft() 
	{
		String q = "abc";
		String w = "123456";
		
		String y = StringUtil.formatLeft(q, w);
		String h = "abc456";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatLeft2() 
	{
		String q = "";
		String w = "123456";
		
		String y = StringUtil.formatLeft(q, w);
		String h = "123456";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatLeft3() 
	{
		String q = "abc";
		String w = "";
		
		String y = StringUtil.formatLeft(q, w);
		//System.out.println(y);
		String h = "abc";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatLeft_4() 
	{
		String q = "abcdef";
		String w = "123";
		
		String y = StringUtil.formatLeft(q, w);
		String h = "abcdef";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatLeft_5() 
	{
		String q = "abcdef";
		String w = "123456";
		
		String y = StringUtil.formatLeft(q, w);
		String h = "abcdef";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatLeft_6() 
	{
		String q = null;
		String w = null;
		
		String y = StringUtil.formatLeft(q, w);
		String h = "";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatRight() 
	{
		String q = "abc";
		String w = "123456";
		
		String y = StringUtil.formatRight(q, w);
		String h = "123abc";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatRight2() 
	{
		String q = "";
		String w = "123456";
		
		String y = StringUtil.formatRight(q, w);
		String h = "123456";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatRight3() 
	{
		String q = "abc";
		String w = "";
		
		String y = StringUtil.formatRight(q, w);
		//System.out.println(y);
		String h = "abc";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatRight_4() 
	{
		String q = "abcdef";
		String w = "123";
		
		String y = StringUtil.formatRight(q, w);
		String h = "abcdef";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatRight_5() 
	{
		String q = "abcdef";
		String w = "123456";
		
		String y = StringUtil.formatRight(q, w);
		String h = "abcdef";
		
		assertEquals(h,y);
	}
	@Test
	void testFormatRight_6() 
	{
		String q = null;
		String w = null;
		
		String y = StringUtil.formatRight(q, w);
		String h = "";
		
		assertEquals(h,y);
	}

}
