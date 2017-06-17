package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

public class Irs extends Office {

  public Irs(Mediator mediator) {super(mediator);}

  @Override
  public void addNewDocument(ArrayList<String> documents) {
	documents.add("Document from Irs.");
	nextStep(documents);
  }

  @Override
  protected void nextStep(ArrayList<String> documents){
	this.mediator.getChamberDoc(documents);
  }
}
