package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class OrderList {
	
	private TreeSet<Order> tree;
	
	public OrderList()
	{
		tree = new TreeSet<Order>();
	}
	public boolean add(Order o)
	{
			return tree.add(o);
	}
	public boolean remove(Order o)
	{
			return tree.remove(o);
	}
	
}