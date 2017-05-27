package codinginsights.practice.Facade;

/**
 * Created by elefher on 5/27/17.
 */

public class UserSubscribe {

  private User user;

  public UserSubscribe(User user){
	this.user = user;
  }

  public boolean hasPaidSubscription(){
	return user.subscriptionIsValid();
  }
}
