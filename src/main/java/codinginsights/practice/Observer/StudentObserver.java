package codinginsights.practice.Observer;

import java.util.Observable;

/**
 * Created by elefher on 5/21/17.
 */

public class StudentObserver implements Observer {

  private Subject classSubject;
  private Email email;
  private String name;

  public StudentObserver(Subject classSubject, String name) {
	this.classSubject = classSubject;
	this.classSubject.attach(this);

	this.name = name;

	this.email = new Email();
	this.email.setEmail("lefteris@codinginsights.blog");
  }

  @Override
  public void update() {
	this.email.setBody("Hi " + this.name + ", you receive this email because you are registered as observer in " + this.classSubject.toString() +
			". Subject state changed to " + this.classSubject.getState());
	this.email.send();
  }
}
