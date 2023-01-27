package robot_window_interactons;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class mouseactions {
public static void main(String[] args) throws Exception {
	Robot robot=new Robot();
	robot.setAutoDelay(500);
	
robot.mouseMove(30, 50);
robot.mousePress(InputEvent.BUTTON1_MASK);
robot.mousePress(InputEvent.BUTTON2_MASK);
robot.mouseRelease(InputEvent.BUTTON1_MASK);
	robot.mouseWheel(500);

	
}
}
