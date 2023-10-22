package ocp.in_out;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class ThreadSafeList {
    private List<Integer> data = new ArrayList<>();

    public synchronized void addValue(int value) {
        data.add(value);
    }

    public int getValue(int index) {
        return data.get(index);
    }

    public int size() {
        synchronized (ThreadSafeList.class) {
            return data.size();
        }
    }
}