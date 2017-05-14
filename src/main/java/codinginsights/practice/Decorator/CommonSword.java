package codinginsights.practice.Decorator;

/**
 * Created by elefher on 5/14/17.
 */

public class CommonSword implements Sword {

  private int power;
  private String swordName;

  public CommonSword(String swordName){
	this.power = 1;
	this.swordName = swordName;
  }

  @Override
  public void setPower(int power) {
	this.power = power;
  }

  @Override
  public int getPower() {
	return power;
  }

  @Override
  public void setSwordName(String swordName) {
	this.swordName = swordName;
  }

  @Override
  public String getSwordName() {
	return swordName;
  }

  @Override
  public void attributes() {
	System.out.println("This is a " + swordName + ". Its power is " + power + "!");
  }
}
