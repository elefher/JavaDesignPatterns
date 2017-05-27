package codinginsights.practice.Facade;

/**
 * Created by elefher on 5/27/17.
 */

public class CheckUserAccess {

  private User user;
  private UserSubscribe subscription;

  public CheckUserAccess(User user, UserSubscribe subscription){
	this.user = user;
	this.subscription = subscription;
  }

  public boolean isValidAccessPage(){
	return subscription.hasPaidSubscription();
  }
}
