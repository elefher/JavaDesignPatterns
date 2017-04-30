package codinginsights.practice.State;

/**
 * Created by elefher on 4/30/17.
 */

public class GunContext implements GunState {

  private GunState state;

  public GunContext(){
	this.state = new ShotGunHasAmmo(this, 3);
  }

  public void setState(GunState state){
	this.state = state;
  }

  @Override
  public void addBullets(int bullets) {
	state.addBullets(bullets);
  }

  @Override
  public void fire() {
	state.fire();
  }

  @Override
  public void reload(int bullets) {
	state.reload(bullets);
  }
}
