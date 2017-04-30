package codinginsights.practice.State;

/**
 * Created by elefher on 4/30/17.
 */

public class ShotGunHasNoAmmo implements GunState {

  private String gunName = "Shotgun";
  private GunContext context;

  public ShotGunHasNoAmmo(GunContext context){
	this.context = context;
	System.out.println(gunName + " is on empty of ammo state");
  }

  @Override
  public void addBullets(int bullets) {
	reload(bullets);
  }

  @Override
  public void fire() {
	System.out.println(gunName + " is empty!");
  }

  @Override
  public void reload(int bullets) {
	context.setState(new ShotGunHasAmmo(context, bullets));
  }
}
