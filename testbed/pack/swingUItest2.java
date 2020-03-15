package testbed.pack;
import javax.swing.*;
import java.awt.event.*;

//here we'll be messing around with buttons, text fields and labels

public class swingUItest2 
{
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("we be simping dude");
		JTextField tf = new JTextField();
		tf.setBounds(50,50, 200,20);
		
		JLabel label1 = new JLabel("say something funny");
		label1.setBounds(25,25, 150,20);
		
		JButton b = new JButton("Click here cunt");
	    b.setBounds(50,100,150,30);
	    
	    //binds an action/effect to when the button is pressed.
	    b.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e)
		    	{  
	            	tf.setText("Welcome to Javatpoint.");  
		    	} 
	    }); 
	    
	    f.add(b);
	    f.add(tf);
	    f.add(label1);
	    
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}

}
