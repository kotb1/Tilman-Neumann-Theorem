package de.tilman_neumann.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;

class Multiset_HashMapImplTest {
	public Collection <String> collect = new ArrayList<String>();
	@Test
	void testadd() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		m.add("Kotb");
		ArrayList k = new ArrayList(m.values());
		assertEquals(4,k.get(0));
	}
	@Test
	void testadd_2() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		m.add("Kotb",5);
		ArrayList k = new ArrayList(m.values());
		assertEquals(8,k.get(0));
	}
	@Test
	void testadd_3() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		m.add("Youssef",2);
		ArrayList k = new ArrayList(m.values());
		assertEquals(2,k.get(3));
	}
	@Test
	void testaddAll() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		Collection <String> collect2 = new ArrayList<String>();
		collect2.add("Youssef");
		collect2.add("Mohammed");
		collect2.add("Hossam");
		collect2.add("10");
		collect2.add("Kotb");
		m.addAll(collect2);
		ArrayList k = new ArrayList(m.values());
		assertEquals(4,k.get(0));
	}
	@Test
	void testaddAll_2() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		String [] collect2 = {"Kotb","20","50","70"};
		m.addAll(collect2);
		ArrayList k = new ArrayList(m.values());
		assertEquals(4,k.get(0));
	}
	@Test
	void testremove() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		m.remove("Kotb");
		ArrayList k = new ArrayList(m.values());
		assertEquals(2,k.get(0));
	}
	@Test
	void testremove_2() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		m.remove("Kotb",2);
		ArrayList k = new ArrayList(m.values());
		assertEquals(1,k.get(0));
	}
	@Test
	void testremoveAll() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		m.removeAll("Kotb");
		ArrayList k = new ArrayList(m.values());
		assertFalse(m.containsValue("Kotb"));
	}
	@Test
	void testtotalCount() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		int x =m.totalCount();
		assertEquals(5,x);
	}
	@Test
	void testtotalCount_2() 
	{
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		int x =m.totalCount();
		assertEquals(0,x);
	}
	@Test
	void testtoList() 
	{
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("Kotb");
		collect.add("2");
		collect.add("3");
		Multiset_HashMapImpl m = new Multiset_HashMapImpl(collect);
		ArrayList f = new ArrayList(m.toList());
		assertEquals("Kotb",f.get(0));
		assertEquals("Kotb",f.get(1));
		assertEquals("Kotb",f.get(2));
		assertEquals("2",f.get(3));
		assertEquals("3",f.get(4));
	}
	/*Intersect wil be 4 test cases
	 * 1- there is an intersection
	 * 2- there is no intersection
	 * 3- there is an intersection at the lower boundry (edge of set)
	 * 4- there is an intersection at the upper boundry (other edge of the set)
	 */
	
}
