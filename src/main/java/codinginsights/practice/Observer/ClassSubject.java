package codinginsights.practice.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by elefher on 5/21/17.
 */

public class ClassSubject implements Subject {
  private List<Observer> observers = new ArrayList<Observer>();
  private int state;

  @Override
  public int getState() {
	return state;
  }

  @Override
  public void setState(int state) {
	this.state = state;
	notifyAllObservers();
  }

  @Override
  public void attach(Observer observer) {
	observers.add(observer);
  }

  @Override
  public void dettach(Observer observer) {
	int i = observers.indexOf(observer);
	if (i >= 0) {
	  observers.remove(i);
	}
  }

  @Override
  public void notifyAllObservers() {
	for (Observer observer : observers) {
	  observer.update();
	}
  }

  public String toString() {
	return "ClassSubject class";
  }
}
