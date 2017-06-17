package codinginsights.practice.Mediator;

import java.util.ArrayList;

/**
 * Created by elefher on 6/14/17.
 */

public class Citizen1 extends Citizen{

  private ArrayList<String> documents;

  public Citizen1(Mediator mediator){
	super(mediator);
  }

  public void newFirm(){
	mediator.startNewFirm();
  }

}
