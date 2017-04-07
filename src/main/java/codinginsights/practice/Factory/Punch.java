package codinginsights.practice.Factory;

/**
 * Created by elefher on 4/7/17.
 */

public class Punch extends Gun {

  public Punch(){
	super();
  }

  @Override
  public void shoot() {
	System.out.println("Punch");
  }

  @Override
  public void reload() {

  }
}
