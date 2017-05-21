package codinginsights.practice.Observer;

/**
 * Created by elefher on 5/21/17.
 */

public class Email {

  private String email;
  private String subject;
  private String body;

  public void setEmail(String email) {
	this.email = email;
  }

  public void setSubject(String subject) {
	this.subject = subject;
  }

  public void setBody(String body) {
	this.body = body;
  }

  public void send() {
	System.out.println(this.body);
  }
}
