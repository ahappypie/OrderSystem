package deployment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HWOrder implements ActionListener{
	
	private UI ui;
	private PrintWriter writer;
	
	public static void main(String[] args)
	{
		HWOrder main = new HWOrder();
	}
	
	public HWOrder()
	{
		ui = new UI(this);
		ui.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
			try {
				writeOrder(ui.getText());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(ui, "Could not create order. Please try again.",
						"Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			ui.clear();
			System.exit(0);
		}
	private void writeOrder(String[] order) throws IOException
	{
		//System.out.println(order[0] + order[1]);
		File file = new File("order" + ".txt");
		file.createNewFile();
		writer = new PrintWriter(file);
		writer.println(order[0]);
		writer.println(order[1]);
		writer.close();
	}	
}
