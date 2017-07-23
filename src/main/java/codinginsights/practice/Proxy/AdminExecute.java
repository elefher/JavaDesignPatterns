package codinginsights.practice.Proxy;

/**
 * Created by elefher on 7/8/17.
 */

public class AdminExecute implements Command {

  private Command command;

  public AdminExecute(Command command){
	this.command = command;
  }

  @Override
  public void delete() {
	System.out.print("Admin has access to ");
	this.command.delete();
  }

  @Override
  public void cp() {
	System.out.print("Admin has access to ");
	this.command.cp();
  }

  @Override
  public void add() {
	System.out.print("Admin has access to ");
	this.command.add();
  }

  @Override
  public void display() {
	System.out.print("Admin has access to ");
	this.command.display();
  }

  @Override
  public void sendMessage() {
	System.out.print("Admin has access to ");
	this.command.sendMessage();
  }
}
