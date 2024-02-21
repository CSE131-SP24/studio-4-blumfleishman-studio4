package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(.03);
		StdDraw.rectangle(.5, .5, .5, .5);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(.7, .7, .2);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(.3, .3, .2);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(.7, .3, .2);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(.3, .7, .2);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(.3, .5, .2);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(.7, .5, .2);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(.5, .7, .2);
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(.5, .3, .2);
		
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.5, .5, .1);
	}
}