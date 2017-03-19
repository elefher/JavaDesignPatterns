package codinginsights.practice.Pooling;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import codinginsights.practice.Main;

/**
 * Created by elefher on 3/18/17.
 */

public class Dot {

    private int posX = 0;
    private int posY = 0;
    private int radious = 5;
    private String UUID;
    private boolean taken = false;
    private Shape circle;

    public Dot(String UUID){
        this.UUID = UUID;
        int x = Main.W_WIDTH;   // get window width
        int y = Main.W_HEIGHT;  // get window height

        Random rand = new Random();
        posX = rand.nextInt(x - 10) + 5; // generate random x point of circle
        posY = rand.nextInt(y - 10) + 5; // generate random y point of circle

        circle = new Ellipse2D.Float(posX, posY, radious * 2, radious * 2); // create a circle
    }

    public boolean isColliding(Line line){
        return taken = circle.getBounds2D().intersectsLine((Line2D) line.getShape()); // check if circle intersects with line
    }

    public boolean isTaken(){
        return taken;
    }

    public int getX(){
        return posX;
    }

    public int getY(){
        return posY;
    }

    public int getRadious(){
        return radious;
    }

    public Shape getShape(){
        return circle;
    }

    public String getUUID(){
        return UUID;
    }
}
