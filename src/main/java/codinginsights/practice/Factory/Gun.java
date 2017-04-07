package codinginsights.practice.Factory;

/**
 * Created by elefher on 4/5/17.
 */

public abstract class Gun {

  private int bullets;
  private boolean isReady;

  public Gun(){
	isReady = true;
  }

  public Gun(int bullets){
	this.bullets = bullets;
	isReady = true;
  }

  public void setBullets(int bullets){
	this.bullets = bullets;
  }

  public int getBullets(){
	return bullets;
  }

  public void gunIsReady(boolean isReady){
	this.isReady = isReady;
  }

  public boolean isReady(){
	return isReady;
  }

  abstract public void shoot();
  abstract public void reload();
}
