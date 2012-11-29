package management;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import data.*;

public class OrderReader {
	private File folder;
	private Scanner reader;
	private File[] orders;
	
	public OrderReader()
	{
		folder = new File("/");
		orders = folder.listFiles();
	}
	public ArrayList<String> readOrder() throws FileNotFoundException
	{
		ArrayList<String> product = new ArrayList<String>();
		for(File f : orders)
		{
			reader = new Scanner(f);
			product.add(reader.nextLine());
		}
		return product;
	}
	
}
