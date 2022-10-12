package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.setPenColor(0, 255, 0);
		double[] x = {0, .5, 1};
		double [] y = {0, .5, 0};
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledCircle(.75, .75, .2);

		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledRectangle(.25, .75, .1, .05);
	
		double[] a = {.1, .1, .17};
		double [] z = {.7, .8, .761};
		StdDraw.filledPolygon(a, z);
		
		StdDraw.rectangle(0, 0, 1, 1);

	}
}