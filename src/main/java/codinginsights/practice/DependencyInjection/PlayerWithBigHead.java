package codinginsights.practice.DependencyInjection;

/**
 * Created by elefher on 4/12/17.
 */

public class PlayerWithBigHead implements PlayerInjection {
  @Override
  public Player getPlayer() {
	return new PlayerBigHead(new BigHead());
  }
}
