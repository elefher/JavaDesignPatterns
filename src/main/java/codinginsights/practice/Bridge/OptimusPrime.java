package codinginsights.practice.Bridge;

/**
 * Created by elefher on 6/25/17.
 */

public class OptimusPrime extends Transformer {

  public OptimusPrime(){
	super("Optimus Prime");
  }

  @Override
  public void assemble(Weapon weapon) {
	this.weapon = weapon;
  }

  @Override
  public void printDetails() {
	System.out.println(getName() + " has the " + weapon.weapon() + " as weapon!");
  }
}
