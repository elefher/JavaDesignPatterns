package codinginsights.practice.Facade;

/**
 * Created by elefher on 5/27/17.
 */

public class UserActions implements UserActionsFacade {

  public CheckUserCredentials userCredentials;
  public CheckUserAccess userAccess;
  public UserSubscribe userSubscribe;

  @Override
  public void userLogin(User user) {
	if(this.isUserValid(user)){
	  System.out.println("User's credentials are valid and is logged in!");
	}else{
	  System.out.println("User's credentials are not valid!");
	}
  }

  @Override
  public void userAccessPage(User user, int pageId) {
	if(!this.isUserValid(user)){
	  System.out.println("User's credentials are not valid!");
	  return;
	}

	userSubscribe = new UserSubscribe(user);
	userAccess = new CheckUserAccess(user, userSubscribe);

	if(userAccess.isValidAccessPage()){
	  System.out.println("User has paid subscription and has access to page id : " + pageId);
	}
  }

  private boolean isUserValid(User user){
	userCredentials = new CheckUserCredentials(user);

	if(userCredentials.userIsValid()){
	  return true;
	}
	return false;
  }
}
