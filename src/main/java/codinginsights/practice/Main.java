package codinginsights.practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import codinginsights.practice.Pooling.Dot;
import codinginsights.practice.Pooling.DotPool;
import codinginsights.practice.Pooling.Line;

/**
 * Created by elefher on 3/10/17.
 */

public class Main extends JPanel {

  public static int W_WIDTH = 400;
  public static int W_HEIGHT = 400;
  private DotPool dPool;
  private ArrayList<Dot> dots;
  private Line line;

  public Main() {
	dPool = new DotPool(2);
	dots = new ArrayList<Dot>();

	line = new Line();

	test();
  }

  private void test(){
	System.out.println("Pooling Usage");
	System.out.println("Init Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(0).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(1).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dPool.free(dots.get(1));
	dots.remove(1); // remove the Dot from ArrayList
	System.out.println("Free object with UUID " + dots.get(0).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(1).getUUID());
	System.out.println("Pool Size " + dPool.size());

	dots.add(dPool.get());
	System.out.println("Get One Dot from Pool with UUID = " + dots.get(2).getUUID());
	System.out.println("Pool Size " + dPool.size());

	System.out.println("Free All Objects");

	int dotsSize = dots.size();
	int i = 0;
	for (i = 0; i < dotsSize; i++) {
	  dPool.free(dots.get(i));
	}

	System.out.println("Now Pool contains " + dPool.size() + " objects");
	dPool.printAllDots();
  }

  @Override
  public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2 = (Graphics2D) g;

	g2.setColor(Color.BLACK); // set the color to black

	int poolSize = dPool.size();
	for (int i = 0; i < poolSize; i++) {
	  dPool.free(dots.get(i));
	  Shape shape = dPool.get().getShape();		// get the shape (circle)
	  g2.draw(shape);							// draw the circle
	  g2.fill(shape);	 						// fill the circle with color (black)
	}

	g2.draw(line.getShape());   // draw the line
  }

  public static void main(String[] arg) {
	JFrame frame = new JFrame("Object Pooling");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(W_WIDTH, W_HEIGHT);
	frame.getContentPane().add(new Main());
	frame.setVisible(true);
  }
}
