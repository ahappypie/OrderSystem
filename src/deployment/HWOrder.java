package deployment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HWOrder implements ActionListener, KeyListener{
	
	private UI ui;
	private FileWriter writer;
	
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
		if(event.getActionCommand().equals("ok"))
		{
			try {
				writeOrder(ui.getText());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(ui, "Could not create order. Please try again.",
						"Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		
	}
	
	private void writeOrder(String order) throws IOException
	{
		File file = new File("order" + ".txt");
		file.createNewFile();
		writer = new FileWriter(file);
		writer.write(order);
	}

	@Override
	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_ENTER)
		{
			try {
				writeOrder(ui.getText());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(ui, "Could not create order. Please try again.",
						"Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
