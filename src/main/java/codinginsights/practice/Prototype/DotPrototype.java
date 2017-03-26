package codinginsights.practice.Prototype;

import java.awt.Color;

/**
 * Created by elefher on 3/25/17.
 */

public class DotPrototype implements Cloneable {

  private int id;						// default value is 0
  private int posY;						// default value is 0
  private int posX;						// default value is 0
  private Boolean isFirst;				// default value is false
  private Boolean isLast;				// default value is false
  private Boolean isTaken;				// default value is false
  private Color dotColor;
  private int radious = 5;

  public DotPrototype(){}

  public void setPosition(int x, int y){
	posX = x;
	posY = y;
  }

  public void setDotColor(Color color){
	dotColor = color;
  }

  public Color getDotColor(){
	return dotColor;
  }

  public void isFirst(){
	isFirst = true;
	isLast = false;
  }

  public void last(){
	isLast = true;
	isFirst = false;
  }

  public void taken(Boolean taken){
	isTaken = taken;
  }

  public Boolean isTaken(){
	return isTaken;
  }

  public int getY(){
	return posY;
  }

  public int getX(){
	return posX;
  }

  public int getRadious(){
	return radious;
  }

  public Object clone(){
	Object clone = null;

	try{
	  clone = super.clone();
	}catch (CloneNotSupportedException e){
	  e.printStackTrace();
	}

	return clone;
  }
}
