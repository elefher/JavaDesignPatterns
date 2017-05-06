package codinginsights.practice.TemplateMethod;

/**
 * Created by elefher on 5/6/17.
 */

abstract class Scoring {

  public float computeScore(){
	return computation1() + computation2();
  }

  abstract protected float computation1();
  abstract protected float computation2();
}
