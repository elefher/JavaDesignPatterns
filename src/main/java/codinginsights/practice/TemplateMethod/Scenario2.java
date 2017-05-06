package codinginsights.practice.TemplateMethod;

/**
 * Created by elefher on 5/6/17.
 */

public class Scenario2 extends Scoring {

  private float totalQuests;
  private float correctResp;
  private int time;

  public Scenario2(){
	totalQuests = 50f;
	correctResp = 10f;
	time = 240;
  }

  @Override
  float computation1() {
	return correctResp * 0.3f;
  }

  @Override
  float computation2() {
	float bonus = 0;

	if (correctResp >= 5 && time < 300){
	  bonus = 0.2f;
	}
	return bonus;
  }
}
