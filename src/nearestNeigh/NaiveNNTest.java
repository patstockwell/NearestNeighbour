package nearestNeigh;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class NaiveNNTest {
	
	List<Point> points = new ArrayList();
	NaiveNN agent = new NaiveNN();
	
	@Before
	public void setupPoints() {
		System.out.println("Starting to add points");
		points.add((new Point("id0", Point.parseCat("restaurant"), -37.3159209067, 147.812377025)));
		points.add((new Point("id1", Point.parseCat("restaurant"), -33.3159209067, 146.441243728)));
		points.add((new Point("id2", Point.parseCat("restaurant"), -32.3159209067, 142.812377235)));
		points.add((new Point("id3", Point.parseCat("restaurant"), -31.3159209067, 143.512377638)));
		points.add((new Point("id4", Point.parseCat("restaurant"), -35.3159209067, 144.912347025)));
		points.add((new Point("id5", Point.parseCat("restaurant"), -36.3159209067, 137.882372325)));
		points.add((new Point("id6", Point.parseCat("restaurant"), -39.3159209067, 127.812377025)));
		points.add((new Point("id7", Point.parseCat("restaurant"), -50.3159209067, 119.222377025)));
		points.add((new Point("id8", Point.parseCat("restaurant"), -40.3159209067, 148.772377025)));
	}
	
	@Test
	public void selectionSortByLatitudeTest() { 
		System.out.println("Starting Test");
		System.out.println("lat in point 0: " + points.get(0).lat);
		agent.buildIndex(points);
		System.out.println("lat in point 0: " + agent.getPoints().get(0).lat);
		System.out.println("lat in point 1: " + agent.getPoints().get(1).lat);
		assertTrue(agent.getPoints().get(0).lat < agent.getPoints().get(1).lat);
	}

}
