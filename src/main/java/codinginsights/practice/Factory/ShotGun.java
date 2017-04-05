package codinginsights.practice.Factory;

/**
 * Created by elefher on 4/5/17.
 */

public class ShotGun extends Gun {

  public ShotGun() {
	super(20);
  }

  public void reload() {
	gunIsReady(true);
  }

  @Override
  public void shoot() {
	if (isReady() && getBullets() > 0) {
	  setBullets(getBullets() - 1);
	  System.out.println("Gun is shooting. Left Boolets" + getBullets());
	}
  }
}
