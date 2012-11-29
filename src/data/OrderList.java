package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OrderList {
	
	private ArrayList<Order> list;
	
	public OrderList()
	{
		list = new ArrayList<Order>();
	}
	public boolean add(Order o)
	{
			return list.add(o);
	}
	public boolean remove(Order o)
	{
			return list.remove(o);
	}
	
}