package codinginsights.practice.State;

import codinginsights.practice.Factory.Gun;

/**
 * Created by elefher on 4/30/17.
 */

public class ShotGunHasAmmo implements GunState {

  private String gunName = "Shotgun";
  private int bullets = 0;
  private GunContext context;

  public ShotGunHasAmmo(GunContext context, int bullets) {
	this.bullets = bullets;
	this.context = context;
	System.out.println(gunName + " is on has ammo state");
  }

  @Override
  public void addBullets(int bullets) {
	System.out.println("Append " + bullets + " bullet/bullets in " + gunName);
	this.bullets += bullets;
  }

  @Override
  public void fire() {
	bullets--;
	System.out.println(gunName + " is shooting. Left Bulets " + bullets);
	if(bullets == 0){
	  context.setState(new ShotGunHasNoAmmo(context));
	}
  }

  @Override
  public void reload(int bullets){
	System.out.println("Reload does nothing!");
  }
}
