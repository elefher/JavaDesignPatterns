package codinginsights.practice.Decorator;

/**
 * Created by elefher on 5/14/17.
 */

public class ExcaliburSword extends SwordDecorator {

  private String swordName = "Excalibur";
  private String commonSwordName;
  private int commonSwordPower;

  public ExcaliburSword(Sword sword) {
	super(sword);
	this.commonSwordName = sword.getSwordName();
	this.commonSwordPower = sword.getPower();

	setSwordName(swordName);
	setPower(10);
  }

  @Override
  public void setPower(int power) {
	sword.setPower(power);
  }

  @Override
  public int getPower() {
	return sword.getPower();
  }

  @Override
  public void setSwordName(String swordName) {
	sword.setSwordName(swordName);
  }

  @Override
  public String getSwordName() {
	return sword.getSwordName();
  }

  @Override
  public void attributes() {
	System.out.println("This is not a " + commonSwordName + " any more. This is the " + getSwordName() + " sword." +
			" Its power increased from " + commonSwordPower + " to " + getPower() + "!");
  }
}
