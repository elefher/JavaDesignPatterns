package codinginsights.practice.Prototype;

import java.awt.Color;
import java.util.Hashtable;

/**
 * Created by elefher on 3/26/17.
 */

public class DotSpawner {

  private static Hashtable<String, DotPrototype> dots  = new Hashtable<String, DotPrototype>();

  public static DotPrototype getDot(String color) {
	DotPrototype spawner = dots.get(color);
	return (DotPrototype) spawner.clone();
  }

  public static void initialize() {
	DotPrototype dot = new DotPrototype();

	DotPrototype redDot = new DotPrototype();
	redDot.setPosition(1, 1);
	redDot.setDotColor(Color.RED);
	dots.put("RED", redDot);

	DotPrototype yellowDot = new DotPrototype();
	yellowDot.setPosition(2, 2);
	yellowDot.setDotColor(Color.YELLOW);
	dots.put("YELLOW", yellowDot);

	DotPrototype greenDot = new DotPrototype();
	greenDot.setPosition(3, 3);
	greenDot.setDotColor(Color.GREEN);
	dots.put("GREEN", greenDot);
  }
}
