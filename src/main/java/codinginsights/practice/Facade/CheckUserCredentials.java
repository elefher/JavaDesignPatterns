package codinginsights.practice.Facade;

/**
 * Created by elefher on 5/27/17.
 */

public class CheckUserCredentials {

  private User user;

  public CheckUserCredentials(User user){
	this.user = user;
  }

  public boolean userIsValid(){
	return user.getUsername() == "lefteris" && user.getPassword() == "delimitrou";
  }
}
