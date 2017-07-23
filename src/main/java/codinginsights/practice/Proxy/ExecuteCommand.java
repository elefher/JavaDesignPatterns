package codinginsights.practice.Proxy;

/**
 * Created by elefher on 7/8/17.
 */

public class ExecuteCommand implements Command {

  public ExecuteCommand(){}

  @Override
  public void delete() {
	System.out.println("delete a file.");
  }

  @Override
  public void cp() {
	System.out.println("copy a file.");
  }

  @Override
  public void add() {
	System.out.println("add a new file.");
  }

  @Override
  public void display() {
	System.out.println("display all files.");
  }

  @Override
  public void sendMessage() {
	System.out.println("send a message.");
  }
}
