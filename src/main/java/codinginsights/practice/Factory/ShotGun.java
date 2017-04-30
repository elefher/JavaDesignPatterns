package codinginsights.practice.Factory;

/**
 * Created by elefher on 4/5/17.
 */

public class ShotGun extends Gun {

  public ShotGun() {
	super(3);
  }

  @Override
  public void shoot() {
	if (isReady() && getBullets() > 0) {
	  setBullets(getBullets() - 1);
	  System.out.println("Gun is shooting. Left Bulets " + getBullets());
	}else{
	  gunIsReady(false);
	  System.out.println("Gun is empty!");
	}
  }

  @Override
  public void reload(){
	setBullets(3);
	gunIsReady(true);
  }
}
