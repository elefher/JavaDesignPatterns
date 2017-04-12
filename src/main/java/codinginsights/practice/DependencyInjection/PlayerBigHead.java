package codinginsights.practice.DependencyInjection;

/**
 * Created by elefher on 4/12/17.
 */

public class PlayerBigHead implements Player {

  private Head head;

  public PlayerBigHead(Head head){
	this.head = head;
  }

  @Override
  public void playerMessage() {
	System.out.println("Hi, I am the player with " + head.headType() + " !");
  }
}
