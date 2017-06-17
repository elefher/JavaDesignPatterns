package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

abstract class Office {

  protected Mediator mediator;

  public Office(Mediator mediator){
    this.mediator = mediator;
  }

  public abstract void addNewDocument(ArrayList<String> documents);
  protected abstract void nextStep(ArrayList<String> documents);
}
