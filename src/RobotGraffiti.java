import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	// Make a new robot
	Robot r= new Robot();
	
	r.miniaturize();
	// pen down  
	
	
	r.setPenColor(Color.blue);
    // 6. Make the robot move as fast as possible    
r.setSpeed(50);                                          
	r.penDown();// Do everything below here 2 times
	for (int i = 0; i < 2; i++) {
	
	// r.move
	r.move(200);
	// r.turn
	r.turn(90);
	
	 
}
}
	
	
	
	
}
