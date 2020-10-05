/* DrawingLines.java
 * This program draws line when user clicks the mouse and drag it over the canvas
 */
import acm.program.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.util.*;

//user use this class to draw draw line
public class DrawingLines extends GraphicsProgram{

	//This is main method
	public void run() {
		addMouseListeners();
	}	
	//When user clicks on mouse, (its the starting position) and drag on canvas 
	//it draws lines with different color

	public void mousePressed(MouseEvent e) {
		double startpositionX = e.getX();
		double startpositionY = e.getY();

		line =  new GLine (startpositionX, startpositionY, startpositionX, startpositionY);
		line.setColor(rgen.nextColor());
		add(line);

	}
	// When user let the mouse go, (its the end position) and line stops there.
	public void mouseDragged(MouseEvent e) {

		double endpositionX = e.getX();
		double endpositionY = e.getY();

		line.setEndPoint(endpositionX, endpositionY);					
	}

	// Instance variable
	private GLine line;
	private RandomGenerator rgen = RandomGenerator.getInstance();
}
