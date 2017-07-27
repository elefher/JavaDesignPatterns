package codinginsights.practice.Strategy;

/**
 * Created by elefher on 7/27/17.
 */

public class Character {

  private SpecialPower power;

  public Character(){}

  public void setSpecialPower(SpecialPower power){
	this.power = power;
  }

  public void specialPower(){
	power.specialPower();
  }
}
