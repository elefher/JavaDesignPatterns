package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

public class InsuranceCarrier extends Office {

  public InsuranceCarrier(Mediator mediator) {super(mediator);}

  @Override
  public void addNewDocument(ArrayList<String> documents) {
	documents.add("Document from Insurance Carrier.");
	nextStep(documents);
  }

  @Override
  protected void nextStep(ArrayList<String> documents){
	this.mediator.firmIsReady(documents);
  }
}
