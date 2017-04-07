package codinginsights.practice.Factory;

/**
 * Created by elefher on 4/7/17.
 */

public class FactoryActionFigure {

  public static ActionFigure createFigurePunch(){
	return new ActionFigure();
  }

  public static ActionFigure createFigureShotGun(){
	return new ActionFigure(new ShotGun());
  }
}
