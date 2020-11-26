package REPO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("abc");
		al.add(100);
		al.add('s');
		al.add("pqr");
		
		System.out.println(al);
		System.out.println("size of arraylist:"+al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		System.out.println(al.contains('V'));
		
		al.add(0,"cba");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		al.set(1, 1000);
		System.out.println(al);
		
		System.out.println("..........print arrylist ifo using iterator.............");
		Iterator lit = al.iterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}

		System.out.println("..........print arrylist info using lis titerator");
		ListIterator lit1 = al.listIterator();
		while(lit1.hasNext())
		{
			System.out.println(lit1.next());
		}
		System.out.println(".........print arraylist info using for loop");
		
		for (int i = 0; i <= al.size()-1; i++) 
		{
			System.out.println(al.get(i));
		}

	}

}
