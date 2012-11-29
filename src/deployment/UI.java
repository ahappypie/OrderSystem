package deployment;

import java.awt.Dimension;
import java.awt.FlowLayout;
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
	
	private JButton button;
	private JTextField text;
	private JPanel textpanel;
	
	public UI(EventListener listener)
	{
		super();
    	super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setSize(400, 50);
        super.setLayout(new GridLayout());
        super.setTitle("Create-an-Order!");
        
		button = new JButton();
		button.addActionListener((ActionListener) listener);
		button.setActionCommand("ok");
		button.setText("OK!");
		
		//textpanel = new JPanel(new FlowLayout());
		//textpanel.setSize(300, 50);
		
		text = new JTextField();
		text.addKeyListener((KeyListener) listener);
		text.setSize(300, 50);

		//textpanel.add(text);
		super.add(text);
		super.add(button);
	}
	public String getText()
	{
		return text.getText();
	}

}
