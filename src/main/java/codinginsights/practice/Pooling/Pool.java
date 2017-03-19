package codinginsights.practice.Pooling;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by elefher on 3/18/17.
 */

public abstract class Pool<T> {

    private int size;
    protected boolean shutdown = false;
    protected BlockingQueue objects;


    public Pool(int size) {
        this.size = size;
        init();
    }

    private void init(){
        objects = new LinkedBlockingQueue();
        for (int i = 0; i < size; i++) {
            addObj();
        }
    }

    public int size(){
        return objects.size();
    }

    public void shutdown(){
        shutdown = true;
        objects.clear();
    }

    public abstract void addObj();
    public abstract void free(T t);
    public abstract T get();
}
