package codinginsights.practice.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elefher on 6/4/17.
 */

public class MaleLion implements Panthera{

  private String lionName;
  private String prideRank;
  private List<Panthera> family;

  public MaleLion(String lionName, String prideRank){
	this.lionName = lionName;
	this.prideRank = prideRank;
	family = new ArrayList<Panthera>();
  }

  @Override
  public void add(Panthera panthera) {
	family.add(panthera);
  }

  @Override
  public void remove(Panthera panthera) {
	int index = family.indexOf(panthera);
	if(index != -1){
		family.remove(index);
	}
  }

  @Override
  public Panthera getMemberOfPride(int member) {
	return family.get(member);
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
	String lion = "Lion with the name " + lionName + " and pride rank as a " + prideRank + ". Pride of lions consist of\n";

	for (Panthera pride: family) {
	  lion += "\t" + pride.toString() + "\n";
	}
	return lion;
  }
}
