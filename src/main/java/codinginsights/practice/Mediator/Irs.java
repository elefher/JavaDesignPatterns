package codinginsights.practice.Mediator;

/**
 * Created by elefher on 6/14/17.
 */

public class Irs extends Office {

  public Irs(Mediator citizen) {
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
