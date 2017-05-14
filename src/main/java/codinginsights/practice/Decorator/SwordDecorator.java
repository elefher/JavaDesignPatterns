package codinginsights.practice.Decorator;

/**
 * Created by elefher on 5/14/17.
 */

public abstract class SwordDecorator implements Sword {
  // protected
  protected Sword sword;

  public SwordDecorator(Sword sword){
	this.sword = sword;
  }

  public abstract void attributes();
}
