package data;

public class Order implements Comparable<Object>{
	
	private String order;
	private String name;
	
	public Order(String p, String n)
	{
		order = p;
		name = n;
	}
	public String getOrder()
	{
		return order;
	}
	public String getName()
	{
		return name;
	}
	public int hashCode()
	{
		return order.hashCode() + name.hashCode();
	}
	@Override
	public int compareTo(Object o) {
		return name.compareTo(((Order) o).getName());
	}
}
