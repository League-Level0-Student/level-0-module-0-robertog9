import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	        JOptionPane.showMessageDialog(null,color + " is also my favorite color");
	Robot white = new Robot ();
	white.miniaturize();
	white.setPenColor(Color.WHITE);
	white.penDown();
	white.setSpeed(257);
	

	
	
	
	
	

	
	
	
	
}
}
