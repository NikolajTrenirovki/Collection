package Iterator;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

    private final T[] array;
    private int currentPosition = -1;

    private int currentLength;

    public MyIterator(T[] array) {
        this.array = array;
        currentLength = array.length;
    }

    @Override
    public boolean hasNext() {
        return currentPosition + 1/*+ 1*/ < currentLength;
                //array.length - 1;
    }

    @Override
    public T next() {
      //  final T elem = array[currentPosition];
        currentPosition++;
        return array[currentPosition];
        // elem;
    }

    @Override
    public void remove() {
        for (int i = currentPosition; i +1 < currentLength; i++){
            array[i] = array[i + 1];
        }
        array[currentLength - 1] = null;
        currentLength--;
        currentPosition--;
    }
}
