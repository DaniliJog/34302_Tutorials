import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TalKonverter extends JFrame implements ActionListener {
    
		// Declare components for the program's window
    public JButton b1;  							// Buttons
    public JTextField txtfld1;        // Small text field at the bottom of the window
    
    public TalKonverter() {
        // Set a BorderLayout on the main window
        getContentPane().setLayout(new BorderLayout());
        
        // Define a standard button size - 100 x 30 pixels
        Dimension btnsize = new Dimension(100, 30);        

        // Create a textfield (approx. size = 40 characters)
        txtfld1 = new JTextField(40);
        // Create a button
        b1 = new JButton("Copy Text");
        b1.addActionListener(this);
        // Create a container for the textfield and the button with a simple BorderLayout
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(txtfld1, BorderLayout.CENTER);
        p2.add(b1, BorderLayout.EAST);
        // Add the container to the bottom part of the main window
        getContentPane().add(p2, BorderLayout.SOUTH);
        
        
    
    }
    
    // actionPerformed method to handle when the user presses any of the buttons
    
    public static void main(String[] args) {
        TalKonverter talkonverter = new TalKonverter();
        
        talkonverter.setTitle("TalKonverter"); // Set title on window
        talkonverter.setSize(600, 150);     // Set size
        talkonverter.setResizable(false);    // Allow the window to be resized
        talkonverter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        talkonverter.setVisible(true);      // Make the window visible
    }
        
}
