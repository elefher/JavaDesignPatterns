package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/17/17.
 */

public class ServiceMediator implements Mediator {

  private ArrayList<String> documents;
  private Office irs;
  private Office chamber;
  private Office insuranceCarrier;

  public ServiceMediator(){
	documents = new ArrayList<String>();

	irs = new Irs(this);
	chamber = new Chamber(this);
	insuranceCarrier = new InsuranceCarrier(this);
  }

  @Override
  public void startNewFirm(){
	getIrsDoc(documents);
  }

  @Override
  public void getIrsDoc(ArrayList<String> documents) {
	this.documents = documents;
	irs.addNewDocument(this.documents);
  }

  @Override
  public void getChamberDoc(ArrayList<String> documents) {
	this.documents = documents;
	chamber.addNewDocument(this.documents);
  }

  @Override
  public void getInsuranceCarrierDoc(ArrayList<String> documents) {
	this.documents = documents;
	insuranceCarrier.addNewDocument(this.documents);
  }

  @Override
  public void firmIsReady(ArrayList<String> documents) {
	this.documents = documents;

	System.out.println("Congratulations! Your documents are ready and are the following: ");
	for (String document : documents) {
	  System.out.println("\t" + document);
	}
	System.out.println("Your new firm is ready.");
  }
}
