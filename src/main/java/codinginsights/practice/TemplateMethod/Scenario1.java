package codinginsights.practice.TemplateMethod;

/**
 * Created by elefher on 5/6/17.
 */

public class Scenario1 extends Scoring {

  private float totalQuests;
  private float correctResp;
  private int time;

  public Scenario1(){
	totalQuests = 50f;
	correctResp = 25f;
	time = 240;
  }

  @Override
  float computation1() {
	return correctResp / totalQuests;
  }

  @Override
  float computation2() {
	float bonus = 0;

	if (correctResp >= 5 && time < 300){
	  bonus = 0.2f;
	}else if(correctResp >= 10 && time < 240){
	  bonus = 0.3f;
	}

	return bonus;
  }
}
