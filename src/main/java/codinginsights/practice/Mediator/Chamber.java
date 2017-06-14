package codinginsights.practice.Mediator;

/**
 * Created by elefher on 6/14/17.
 */

public class Chamber extends Office {

  public Chamber(Mediator citizen) {
	super(citizen);
  }

  @Override
  public void document(String document) {

  }

  @Override
  public String getNewDocument() {
	return null;
  }
}
