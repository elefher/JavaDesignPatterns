package codinginsights.practice.Proxy;

/**
 * Created by elefher on 7/8/17.
 */

public class UserExecute implements Command {

  private Command command;

  public UserExecute(Command command){
	this.command = command;
  }

  @Override
  public void delete() {
	System.out.print("User doesn't have access to ");
	this.command.delete();
  }

  @Override
  public void cp() {
	System.out.print("User doesn't have access to ");
	this.command.cp();
  }

  @Override
  public void add() {
	System.out.print("User has access to ");
	this.command.add();
  }

  @Override
  public void display() {
	System.out.print("User has access to ");
	this.command.display();
  }

  @Override
  public void sendMessage() {
	System.out.print("User doesn't have access to ");
	this.command.sendMessage();
  }
}
