package management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderCompiler {
	private Scanner reader;
	private PrintWriter writer;
	private File[] orders;
	private File output;
	
	public OrderCompiler()
	{
		File folder = new File("/Repository");
		orders = folder.listFiles();
		output = new File("Orders" + ".txt");
	}
	public int numOrders()
	{
		return orders.length;
	}
	public void readOrders() throws FileNotFoundException
	{
		writer = new PrintWriter(output);
		for(File f : orders)
		{
			reader = new Scanner(f);
			if(reader.hasNext())
				writer.println(reader.nextLine());
			else
				continue;
		}
	}
	
}
