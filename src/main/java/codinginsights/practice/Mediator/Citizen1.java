package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

public class Citizen1 implements Mediator {

  private Irs irs;
  private Chamber chamber;
  private InsuranceCarrier insuranceCarrier;

  private ArrayList<String> documents;

  public Citizen1(){
	this.documents = new ArrayList<String>();
  }

  public Citizen1(Irs irs, Chamber chamber, InsuranceCarrier insuranceCarrier){
	this.irs = irs;
	this.chamber = chamber;
	this.insuranceCarrier = insuranceCarrier;
	this.documents = new ArrayList<String>();
  }



  @Override
  public void receiveDocument() {

  }

  @Override
  public void sendDocument() {

  }

  public Irs getIrs() {
	return irs;
  }

  public void setIrs(Irs irs) {
	this.irs = irs;
  }

  public Chamber getChamber() {
	return chamber;
  }

  public void setChamber(Chamber chamber) {
	this.chamber = chamber;
  }

  public InsuranceCarrier getInsuranceCarrier() {
	return insuranceCarrier;
  }

  public void setInsuranceCarrier(InsuranceCarrier insuranceCarrier) {
	this.insuranceCarrier = insuranceCarrier;
  }
}
