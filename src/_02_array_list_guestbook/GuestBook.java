package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> Guests = new ArrayList<String>();
	GuestBook(){
	button1.addActionListener(this);
	button2.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
	Guests.add("Bob Banders");
	Guests.add("Sandy Summers");
	Guests.add("Greg Ganders");
	Guests.add("Donny Doners");
	}
	public static void main(String[] args) {
		
		
		
		
		GuestBook book = new GuestBook();
		
		
		
	}
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==button1) {
			String newName = JOptionPane.showInputDialog("Enter a name.");
			Guests.add(newName);
		}
		
		if(arg0.getSource()==button2) {
				JOptionPane.showMessageDialog(null, "These are the guests: " + Guests);

			
		}
	}
}
