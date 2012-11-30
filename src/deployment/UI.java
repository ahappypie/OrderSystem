package deployment;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI extends JFrame{
	
	private JButton finished;
	private JPanel textfields;
	private JTextField name;
	private JTextField order;
	public UI(ActionListener listener)
	{
		setBounds(100, 100, 400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		textfields = new JPanel();
		
		name = new JTextField();
		name.setText("Enter name here");
		textfields.add(name, BorderLayout.EAST);
		order = new JTextField();
		order.setText("Enter order here");
		textfields.add(order, BorderLayout.WEST);

		getContentPane().add(textfields, BorderLayout.NORTH);
		
		finished = new JButton("Finished");
		finished.addActionListener(listener);
		getContentPane().add(finished, BorderLayout.SOUTH);

	}
	public String[] getText()
	{
		String[] temp = {name.getText(), order.getText()};
		return temp;
	}
	public void clear()
	{
		name.setText("");
		order.setText("");
	}

}
