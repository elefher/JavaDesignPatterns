package codinginsights.practice.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elefher on 6/4/17.
 */

public class FemaleLion implements Panthera {

  private String lionName;
  private String prideRank;
  private List<Panthera> cubs;

  public FemaleLion(String lionName, String prideRank){
	this.lionName = lionName;
	this.prideRank = prideRank;
	cubs = new ArrayList<Panthera>();
  }

  @Override
  public void add(Panthera panthera) {
	cubs.add(panthera);
  }

  @Override
  public void remove(Panthera panthera) {
	int index = cubs.indexOf(panthera);
	if(index != -1){
	  cubs.remove(index);
	}
  }

  @Override
  public Panthera getMemberOfPride(int member) {
	return cubs.get(member);
  }

  @Override
  public String getName() {
	return lionName;
  }

  @Override
  public String getPrideRank() {
	return prideRank;
  }

  public String toString(){
	String lion = "Female Lion with name " + lionName + " and pride rank as a " + prideRank + ".";

	for (Panthera cub: cubs) {
		lion += "\n\t\tHas a cub with the name " + cub.toString();
	}
	return lion;
  }
}
