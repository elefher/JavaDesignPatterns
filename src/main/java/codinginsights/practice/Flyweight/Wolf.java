package codinginsights.practice.Flyweight;

/**
 * Created by elefher on 7/23/17.
 */

public class Wolf implements Enemy {

  private WeaponType weapon;
  private int power;

  public Wolf(int power){
	this.power = power;
  }

  @Override
  public void assignWeapon(WeaponType weapon) {
	this.weapon = weapon;
  }

  public String toString(){
	return "Wolf has power " + power + " and as a weapon " + weapon + ". Class code is " + System.identityHashCode(this);
  }
}
