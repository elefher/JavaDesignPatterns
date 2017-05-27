package codinginsights.practice.Facade;

/**
 * Created by elefher on 5/27/17.
 */

interface UserActionsFacade {
  public void userLogin(User user) throws Exception;
  public void userAccessPage(User user, int pageId);
}
