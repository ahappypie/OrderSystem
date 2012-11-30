package management;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Manager implements ActionListener{
	private OrderCompiler compiler;
	private JFrame frame;
	private JButton button;
	
	public static void main(String[] args)
	{
		Manager m = new Manager();
	}
	
	public Manager()
	{
		frame = new JFrame();
		frame.setSize(400, 400);
		button = new JButton("Compile Orders");
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		try {
			compiler.readOrders();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(frame, "Compiler error",
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(frame, "Complier error, no orders in repository",
					"Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		
	}
}
