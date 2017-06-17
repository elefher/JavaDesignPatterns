package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

public class Chamber extends Office {

  public Chamber(Mediator mediator) {super(mediator);}

  @Override
  public void addNewDocument(ArrayList<String> documents) {
	documents.add("Document from Chamber.");
	nextStep(documents);
  }

  @Override
  protected void nextStep(ArrayList<String> documents){
	this.mediator.getInsuranceCarrierDoc(documents);
  }
}
