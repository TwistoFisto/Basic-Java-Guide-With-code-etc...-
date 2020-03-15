package testbed.pack;
import javax.swing.*;
import java.awt.event.*;

public class swingUItest3 
{

	public static void main(String[] args) 
	{
		JFrame lelxd = new JFrame("we be gaying dude");
		JFrame yikes = new JFrame("can we get a yikes from chat pls?");
		JButton b = new JButton("Click here cunt");
	    b.setBounds(50,150,150,30);
	    
	    b.addActionListener(new ActionListener()
	    {
	    	public void actionPerformed(ActionEvent e)
		    	{  
	    		lelxd.setVisible(false);
	    	    	yikes.setSize(900,1250);  
	    		    yikes.setLayout(null);  
	    	    	yikes.setVisible(true);
		    	} 
	    });
	    
	    lelxd.add(b);
	    lelxd.setSize(400,400);  
	    lelxd.setLayout(null);  
	    lelxd.setVisible(true); 
	}

}
