package codinginsights.practice.Facade;

/**
 * Created by elefher on 5/27/17.
 */

public class User {

  private String username;
  private String password;
  private String email;
  private int amount;

  public String getUsername() {
	return username;
  }

  public void setUsername(String username) {
	this.username = username;
  }

  public String getPassword() {
	return password;
  }

  public void setPassword(String password) {
	this.password = password;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public void setAmount(int amount){
	this.amount = amount;
  }

  public boolean subscriptionIsValid() {
	return amount > 0 ? true : false;
  }
}
