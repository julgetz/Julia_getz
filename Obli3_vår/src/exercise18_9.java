import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;


public class exercise18_9  extends JApplet implements ActionListener {
	
	JPanel mainpanel = new JPanel (new GridLayout(3,1));
	JPanel p1 = new JPanel(new FlowLayout(0));
	JPanel p2 = new JPanel(new FlowLayout (0));
	JPanel p3 = new JPanel (new FlowLayout ( ));
	JTextField t1 = new JTextField (10);
	JTextField t2 = new JTextField (10);
	JButton clickbutton = new JButton("convert");
	{
	getContentPane().add(mainpanel);
	mainpanel.add(p1);
	mainpanel.add(p2);
	mainpanel.add(p3);
	p1.add(new JLabel("Insert Decimal:"));
	p1.add(t1);
	p2.add(clickbutton);
	p3.add(new JLabel("Decimal to Binary:"));
	p3.add(t2);
	clickbutton.addActionListener(this);
	}
	
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == clickbutton)
	{
		int counter,dec,user;
		user = Integer.valueOf(t1.getText()).intValue();
		String[]conversion = new String[8];
		String[]complete = new String[4];
		counter = 0;
		complete[0]="";
		
		do
		{
		dec=user%2;
		conversion[counter]=String.valueOf(dec);
		complete[0]=conversion[counter]+complete[0];
		user=user/2;
		counter+=1;
		}
		while(user !=0);
		t2.setText(String.valueOf(complete[user]));
		
		
	}
		
		
	}
	
	
}    
	




	


