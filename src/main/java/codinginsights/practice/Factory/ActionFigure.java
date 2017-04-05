package codinginsights.practice.Factory;

/**
 * Created by elefher on 4/5/17.
 */

public class ActionFigure {

  private Gun gun;
  private int Health = 100;

  public ActionFigure(){}

  public ActionFigure(Gun gun){
	this.gun = gun;
  }

  public void setGun(Gun gun){
	this.gun = gun;
  }

  public Gun getGun(){
	return gun;
  }

  public void shoot(){
	gun.shoot();
  }
}
