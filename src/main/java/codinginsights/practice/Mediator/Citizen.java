package codinginsights.practice.Mediator;

/**
 * Created by elefher on 6/17/17.
 */

public abstract class Citizen {

  protected Mediator mediator;

  public Citizen(Mediator mediator){
	this.mediator = mediator;
  }


}
