package codinginsights.practice.Pooling;

import java.util.Iterator;
import java.util.UUID;

/**
 * Created by elefher on 3/19/17.
 */

public class DotPool extends Pool {

  public DotPool(int size) {
	super(size);
  }

  @Override
  public void addObj() {
	objects.add(new Dot(UUID.randomUUID().toString()));
  }

  @Override
  public void free(Object o) {

	boolean isOffered = objects.offer(o);

	if(!isOffered){
	  throw new NullPointerException("Offer object is null");
	}
  }

  @Override
  public Dot get() {
	if(!shutdown){
	  if(objects.size() == 0){ // if object is empty then create one
		addObj();
	  }
		Dot dot = null;
	  try {
		dot = (Dot) objects.take();
	  } catch (InterruptedException e) {
		e.printStackTrace();
	  }

	  return dot;
	}

	throw new IllegalStateException("Shutdown.");
  }

  public void printAllDots(){
	int s = objects.size();

	Iterator io = objects.iterator();

	while (io.hasNext()){
	  Dot d = (Dot) io.next();
	  System.out.println("Pool contains Dot with UUID = " + d.getUUID());
	}
  }
}
