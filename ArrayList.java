public class ArrayList<T> implements List<T>
{
    T[] arr;
    T[] growArr;
    int size;
    int position;

    public ArrayList() {
        //set up array list size
        arr = (T[]) new Object[10];
        size = 10;
        //set the position on -1
        position = - 1;
    }

    @Override
    public void add(T item) {
        //store element to the first space
        if (position == size - 1) {
            grow();
        }
        //increase index
        position++;
        arr[position] = item;
    }

    private void grow()
    {
        //increase array size double it
        growArr = (T[]) new Object[arr.length * 2];
        //transfer element to new
        for (int i = 0; i < size; i++) {
            growArr[i] = arr[i];
        }
        arr = growArr;
        size = size * 2;
    }

    @Override
    public void add(int pos, T item) {
        //default for out of the range
        if (position == size - 1) {
            grow();
        }
        for (int i = position; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = item;
        position++;
    }

    @Override
    public T get(int pos) {
        //check size if it is empty
        if (size == 0) {
            return null;
        }
        return arr[pos];
    }

    @Override
    public T remove(int pos) {
        //check size if it is empty
        if (size == 0) {
            return null;
        }
        T temp = arr[pos];
        for (int i = pos + 1; i < position; i++) {
            //shifting to right
            arr[i - 1] = arr[i];
        }//reset it to empty
        arr[position] = null;
        position--;
        return temp;
    }

    @Override
    public int size() {
        return position + 1;
    }
}
