package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

public interface Mediator {
  public void startNewFirm();
  public void getIrsDoc(ArrayList<String> documents);
  public void getChamberDoc(ArrayList<String> documents);
  public void getInsuranceCarrierDoc(ArrayList<String> documents);
  public void firmIsReady(ArrayList<String> documents);
}
