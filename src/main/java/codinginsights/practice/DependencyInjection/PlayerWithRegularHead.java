package codinginsights.practice.DependencyInjection;

/**
 * Created by elefher on 4/12/17.
 */

public class PlayerWithRegularHead implements PlayerInjection {
  @Override
  public Player getPlayer() {
	return new PlayerRegularHead(new RegularHead());
  }
}
