import java.util.Iterator;

public class IntervalIterable implements Iterable<Integer> {
    final private int start, stop, step;

    IntervalIterable(int start, int stop, int step) {
        this.start = start;
        this.stop = stop;
        this.step = step;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntervalIterator(start, stop, step);
    }
}

class IntervalIterator implements Iterator<Integer> {
    private int next;
    private int stop;
    private int step;

    IntervalIterator(int start, int stop, int step) {
        this.next = start;
        this.stop = stop;
        this.step = step;
    }

    @Override
    public boolean hasNext() {
        return next <= stop;
    }

    @Override
    public Integer next() {
        int retValue = next;
        next += step;
        return retValue;
    }

    public static void main(String[] args) {
        for (int i : new IntervalIterable(0, 10, 2)) {
            System.out.println(i);
        }
    }
}
