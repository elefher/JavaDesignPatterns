package codinginsights.practice.Pooling;

import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 * Created by elefher on 3/19/17.
 */

public class Line {

  private Shape line;

  public Line(){
	line = new Line2D.Float(150, 205, 250, 205); // create a line
  }

  public Shape getShape(){
	return line;
  }
}
