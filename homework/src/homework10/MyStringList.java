package homework10;

import java.util.Arrays;

public class MyStringList implements Collection {

    private String[] array = new String[10];
    private int indexCounter = 0;

    @Override
    public boolean add(String o) {
        if (indexCounter >= array.length - 1) {
            expand();
        }
        array[indexCounter] = o;
        indexCounter++;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if (index < indexCounter) {
            if (indexCounter >= array.length - 1) {
                expand();
            }
            for (int i = indexCounter; i >= indexCounter - index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = o;
            indexCounter++;
            return true;
        } else return false;
    }

    @Override
    public boolean delete(String o) {
        for (int i = 0; i < indexCounter; i++) {
            if (array[i] != null && array[i].equals(o)) {
                for (int j = i; j < indexCounter; j++) {
                    array[j] = array[j + 1];
                }
                indexCounter--;
                if (indexCounter <= array.length * 0.5 && array.length > 10) {
                    shrink();
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String get(int index) {
        if (index < indexCounter) {
            return array[index];
        } else throw new IndexOutOfBoundsException("index " + index + " out of bounds for length " + indexCounter);
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < indexCounter; i++) {
            if (array[i] != null && array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Collection collection) {
        if (this == collection) return true;
        if (collection == null || getClass() != collection.getClass()) return false;
        MyStringList that = (MyStringList) collection;
        return indexCounter == that.indexCounter && Arrays.equals(array, that.array);
    }

    @Override
    public boolean clear() {
        array = new String[10];
        indexCounter = 0;
        return true;
    }

    @Override
    public int size() {
        return indexCounter;
    }

    private void expand() {
        String[] tmp = new String[(int) (array.length * 1.6)];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    private void shrink() {
        String[] tmp = new String[(int) (array.length * 0.7)];
        for (int i = 0; i <= indexCounter; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < indexCounter; i++) {
            System.out.println("index " + i + " = " + array[i]);
        }
        System.out.println();
    }

}
