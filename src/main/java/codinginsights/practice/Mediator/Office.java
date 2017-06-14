package codinginsights.practice.Mediator;

/**
 * Created by elefher on 6/14/17.
 */

abstract class Office {

  protected Mediator citizen;

  public Office(Mediator citizen){
	this.citizen = citizen;
  }

  public abstract void document(String document);
  public abstract String getNewDocument();
}
