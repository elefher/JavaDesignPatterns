package codinginsights.practice.Bridge;

import codinginsights.practice.Factory.Gun;

/**
 * Created by elefher on 6/25/17.
 */

public abstract class Transformer {

  private String name;
  protected Weapon weapon;

  public Transformer(String name){
	this.name = name;
  }

  public String getName(){
	return name;
  }

  public abstract void assemble(Weapon weapon);
  public abstract void printDetails();
}
